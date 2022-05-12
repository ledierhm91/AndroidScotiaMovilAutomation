/*
 * Classname: Reports 
 * 
 * Version information: 2.0
 *
 * Date: September 21 2015
 * 
 * Copyright notice
 */

package framework;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import javax.imageio.ImageIO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;
import _be.quodlibet.boxable.BaseTable;
import _be.quodlibet.boxable.Cell;
import _be.quodlibet.boxable.Row;

import com.google.common.io.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDJpeg;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDPixelMap;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;
import org.apache.pdfbox.util.PDFMergerUtility;

public class Reportes {

	private Float passed = (float) 0;
	private Float failed = (float) 0;
	private Long duration = (long) 0;
	private static Float margin = 50f;
	ArrayList<ArrayList> detalleListaCP = new ArrayList<ArrayList>();

	private static String fileNameFallas = Frmwrk.CARPETA_REPORTES + "Reporte Fallas.pdf";
	private static String fileNameResults = Frmwrk.CARPETA_REPORTES + "Reporte Resultados.pdf";
	private static String fileNameResultsDetails = Frmwrk.CARPETA_REPORTES + "Detalle Reporte Resultados.pdf";
	private static String fileNameTotal = Frmwrk.CARPETA_REPORTES + "Reporte General.pdf";
	private static String fileNameTapaLogo = Frmwrk.CARPETA_REPORTES + "Tapa logo.pdf";

	public Float getPassed() {
		return passed;
	}

	public void addPassed() {
		this.passed = this.passed + 1;
	}

	public Float getFailed() {
		return failed;
	}

	public void addFailed() {
		this.failed = this.failed + 1;
	}

	public Long getDuration() {
		return duration;
	}

	public void addDuration(long time) {
		this.duration = this.duration + time;
	}

	public void setupResultPDF() throws IOException, COSVisitorException {
		// Create a document and add a page to it
		PDDocument doc = new PDDocument();
		PDPage page = addNewPage(doc);

		// -----Add a chart
		float alto = page.findMediaBox().getHeight();
		float ancho = page.findMediaBox().getWidth();

		int altoChart = 300;
		int anchoChart = 300;

		float xChart = (ancho - anchoChart) / 2;
		float yChart = (alto - altoChart - margin);
		PDXObjectImage ximage = null;
		PDPageContentStream content = new PDPageContentStream(doc, page);

		// create a new outStream
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Float passedPerc = (float) 1;
		Float failedPerc = (float) 2;
		Float total = passed + failed;
		if (total != 0) {
			passedPerc = (float) ((passed / total) * 100);
			failedPerc = (float) ((failed / total) * 100);
		}
		JFreeChart chart = generatePieChart(passedPerc, failedPerc);

		ChartUtilities.writeChartAsJPEG(out, chart, anchoChart, altoChart);// write to outstream
		// create a new inputstream
		InputStream in = new ByteArrayInputStream(out.toByteArray());
		ximage = new PDJpeg(doc, in);
		content.drawImage(ximage, xChart, yChart);
		content.close();

		// ---------------------------------------------
		// Initialize table 1
		String unidad = "";
		String time = "";

		long longVal = (getDuration() / 1000);
		int hours = (int) longVal / 3600;
		int remainder = (int) longVal - hours * 3600;
		int mins = remainder / 60;
		remainder = remainder - mins * 60;
		int secs = remainder;

		String hour, min, sec;

		if (10 > hours) {
			hour = "0" + Integer.toString(hours);
		} else {
			hour = Integer.toString(hours);
		}

		if (10 > mins) {
			min = "0" + Integer.toString(mins);
		} else {
			min = Integer.toString(mins);
		}

		if (10 > secs) {
			sec = "0" + Integer.toString(secs);
		} else {
			sec = Integer.toString(secs);
		}

		time = hour + ":" + min + ":" + sec;
		unidad = " - hh:mm:ss";

		float yStartNewPage1 = alto - altoChart - (2 * margin);
		float tableWidth1 = ancho - (8 * margin);
		boolean drawContent1 = true;
		float yStart1 = yStartNewPage1;
		float bottomMargin1 = 10;

		BaseTable table = new BaseTable(yStart1, yStartNewPage1, bottomMargin1, tableWidth1,
				((ancho - tableWidth1) / 2), doc, page, true, drawContent1);

		// Titulo
		Row headerRow = table.createRow(15f);
		Cell cell = headerRow.createCell(100, "Resultados");
		cell.setFont(PDType1Font.HELVETICA_BOLD);
		cell.setFillColor(Color.WHITE);
		cell.setFontSize(14);
		cell.setTextColor(Color.BLACK);
		table.setHeader(headerRow);

		// Duracion
		Row duracion = table.createRow(15f);
		cell = duracion.createCell(100, "Total duracion: " + time + unidad);
		cell.setFont(PDType1Font.HELVETICA);
		cell.setFontSize(12);
		cell.setFillColor(Color.WHITE);
		cell.setTextColor(Color.BLACK);

		// Total tests
		Row totalTests = table.createRow(15f);

		cell = totalTests.createCell(100, "Total tests: " + Math.round(total) + " (100%)");
		cell.setFont(PDType1Font.HELVETICA);
		cell.setFontSize(12);
		cell.setFillColor(Color.WHITE);
		cell.setTextColor(Color.BLACK);

		// Exitosos
		Row exitosos = table.createRow(15f);

		cell = exitosos.createCell(100, "Total exitosos: " + Math.round(passed) + " ("
				+ String.format("%.2f", ((passed / total) * 100)) + "%)");
		cell.setFont(PDType1Font.HELVETICA);
		cell.setFontSize(12);
		cell.setFillColor(Color.WHITE);
		cell.setTextColor(Color.BLACK);

		// Fallidos
		Row fallidos = table.createRow(15f);

		cell = fallidos.createCell(100, "Total fallidos: " + Math.round(failed) + " ("
				+ String.format("%.2f", ((failed / total) * 100)) + "%)");
		cell.setFont(PDType1Font.HELVETICA);
		cell.setFontSize(12);
		cell.setFillColor(Color.WHITE);
		cell.setTextColor(Color.BLACK);

		table.draw();

		// ---------------------------------------------

		File file = new File(fileNameResults);
		Files.createParentDirs(file);
		doc.save(fileNameResults);
		doc.close();
	}

	private static PDPage addNewPage(PDDocument doc) {
		PDPage page = new PDPage(PDPage.PAGE_SIZE_A4);
		doc.addPage(page);
		return page;
	}

	private void updateFailPDF(String error, String tcName) throws Exception {
		File f = new File(fileNameFallas);
		
		int a = error.indexOf("ui.UI");
		if (a != -1)
		{error=error.substring(a, a + 500);}
		
		if (f.exists()) {
			PDDocument doc = PDDocument.load(fileNameFallas);
			addPageFailPDF(doc, error, tcName);
		} else {
			PDDocument doc = new PDDocument();
			addPageFailPDF(doc, error, tcName);
		}
	}

	public static void addPageFailPDF(PDDocument doc, String error, String tcName) throws COSVisitorException {
		try {
			PDPage page = new PDPage(PDPage.PAGE_SIZE_A4);
			doc.addPage(page);

			List allPages = doc.getDocumentCatalog().getAllPages();
			PDPage lastPage = (PDPage) allPages.get(allPages.size() - 1);
			PDRectangle pageSize = lastPage.findMediaBox();

			PDFont font = PDType1Font.HELVETICA_BOLD;
			float fontSize = 12.0f;

			PDFont font2 = PDType1Font.HELVETICA;
			float fontSize2 = 10.0f;

			PDPageContentStream contentStream = new PDPageContentStream(doc, page, true, true);
			PDPageContentStream contentStream3 = new PDPageContentStream(doc, page, true, true);

			PDPage page2 = new PDPage(PDPage.PAGE_SIZE_A4);
		//	doc.addPage(page2);
			PDPageContentStream contentStream4 = new PDPageContentStream(doc, page2, true, true);

			contentStream.beginText();
			contentStream.setFont(font, fontSize);
			contentStream.moveTextPositionByAmount(30, page.findMediaBox().getHeight() - 30);
			contentStream.drawString("Nombre caso de prueba: " + tcName);
			contentStream.endText();
			contentStream.close();

			contentStream.beginText();
			contentStream.moveTextPositionByAmount(30, page.findMediaBox().getHeight() - 60);
			contentStream.drawString("Detalle del error:");
			contentStream.endText();
			contentStream.close();

			float margin = 30;
			PDRectangle mediabox = page.findMediaBox();
			float width = mediabox.getWidth() - 2 * margin;
			float startX = margin; // mediabox.getLowerLeftX() + margin;
			float startY = page.findMediaBox().getHeight() - 75; // mediabox.getUpperRightY() - margin;

			List<String> lines = new ArrayList<String>();
			int lastSpace = -1;
			while (error.length() > 0) {
				int spaceIndex = error.indexOf(' ', lastSpace + 1);
				if (spaceIndex < 0)
					spaceIndex = error.length();
				String subString = error.substring(0, spaceIndex);
				float size = fontSize * font2.getStringWidth(subString) / 1000;
				if (size > width) {
					if (lastSpace < 0)
						lastSpace = spaceIndex;
					subString = error.substring(0, lastSpace);
					lines.add(subString);
					error = error.substring(lastSpace).trim();
					lastSpace = -1;
				} else if (spaceIndex == error.length()) {
					lines.add(error);
					error = "";
				} else {
					lastSpace = spaceIndex;
				}
			}

			contentStream3.beginText();
			contentStream3.setFont(font2, fontSize2);
			contentStream3.moveTextPositionByAmount(startX, startY);

			float leading = 1.5f * fontSize2;

			int i = 0;
			for (String line : lines) {
				if (i == 48) {
					contentStream3.drawString(line);
					contentStream3.moveTextPositionByAmount(0, -leading);
					contentStream3.endText();
					contentStream3.close();
					contentStream4.beginText();
					contentStream4.setFont(font2, fontSize2);
					contentStream4.moveTextPositionByAmount(margin, page2.findMediaBox().getHeight() - margin);
				} else if (i > 48) {
					contentStream4.drawString(line);
					contentStream4.moveTextPositionByAmount(0, -leading);
				} else {
					contentStream3.drawString(line);
					contentStream3.moveTextPositionByAmount(0, -leading);
				}

				i = i + 1;
			}

			int j;

			if (i < 48) {
				contentStream3.endText();
				contentStream3.close();
				j = 30;
			} else {
				contentStream4.endText();
				contentStream4.close();
				j = (i - 48) * 15;
			}

	/*		PDPageContentStream contentStream5 = new PDPageContentStream(doc, page2, true, true);
			contentStream5.beginText();
			contentStream5.setFont(font, fontSize);
			contentStream5.moveTextPositionByAmount(margin, page2.findMediaBox().getHeight() - 20 - j);
			contentStream5.drawString("Captura:");
			contentStream5.endText();
			contentStream5.close();*/

			/*
			PDPageContentStream contentStream6 = new PDPageContentStream(doc, page2, true, true);

			PDXObjectImage pdImage = null;
			pdImage = new PDJpeg(doc, new FileInputStream((System.getProperty("user.dir") + "\\bufferedImage.jpg")));

			float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();
			float ancho = Math.round(page2.findMediaBox().getWidth() - (margin * 2));
			float alto = Math.round(ancho * proporcion);
			float centeredPosition = ((page2.findMediaBox().getWidth() - ancho) / 2f);
			contentStream6.drawXObject(pdImage, centeredPosition, page2.findMediaBox().getHeight() - alto - 30 - j,
					ancho, alto);
			contentStream6.close();*/
			
			String pp="";
			
			if (Frmwrk.validacion.equals("BIEN"))
			{pp = System.getProperty("user.dir") + "//ok.jpg";
			Frmwrk.validacion="";}
			else if (Frmwrk.validacion.equals("MAL"))
			{pp = System.getProperty("user.dir") + "//bad.jpg";
			Frmwrk.validacion="";}
			else
			{pp = System.getProperty("user.dir") + "//bufferedImage.jpg";}
			
			File aa = new File(pp);			
			BufferedImage ss = ImageIO.read(aa);
			
		    PDXObjectImage pdImage =  new PDPixelMap(doc, ss);
		/*    PDPageContentStream contentStream2 = new PDPageContentStream(doc, page2, true, true);
		    float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();
			float ancho = Math.round((page2.findMediaBox().getWidth()/2) - (margin * 2));
			float alto = Math.round(ancho * proporcion);
			float centeredPosition = ((page2.findMediaBox().getWidth() - ancho) / 2f);
			contentStream2.drawXObject(pdImage, centeredPosition, page2.findMediaBox().getHeight() - alto - 30 - j,
					ancho, alto);
			contentStream2.close();*/
			
			
			 PDPageContentStream contentStream2 = new PDPageContentStream(doc, page, true, true);
			    float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();
				float ancho = Math.round((page.findMediaBox().getWidth()/2) - (margin * 2));
				float alto = Math.round(ancho * proporcion);
				float centeredPosition = ((page.findMediaBox().getWidth() - ancho) / 2f);
				contentStream2.drawXObject(pdImage, centeredPosition, page.findMediaBox().getHeight() - alto - 150 - j,	ancho, alto);
				contentStream2.close();

			doc.save(fileNameFallas);
			doc.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

	public String calcularTiempo(Long duration) {
		long longVal = (duration / 1000000000);
		int hours = (int) longVal / 3600;
		int remainder = (int) longVal - hours * 3600;
		int mins = remainder / 60;
		remainder = remainder - mins * 60;
		int secs = remainder;

		String hour, min, sec;

		if (10 > hours) {
			hour = "0" + Integer.toString(hours);
		} else {
			hour = Integer.toString(hours);
		}

		if (10 > mins) {
			min = "0" + Integer.toString(mins);
		} else {
			min = Integer.toString(mins);
		}

		if (10 > secs) {
			sec = "0" + Integer.toString(secs);
		} else {
			sec = Integer.toString(secs);
		}

		return hour + ":" + min + ":" + sec + " - hh:mm:ss";
	}

	private void addRow2(String name ,String descrip,  Boolean passed, Long duration) {

		ArrayList<String> elementoCP = new ArrayList<String>();

		elementoCP.add(name);
		elementoCP.add(descrip);
		
		if (passed) {
			elementoCP.add("true");
		} else {
			elementoCP.add("false");
		}
		
		
		elementoCP.add(calcularTiempo(duration));

		detalleListaCP.add(elementoCP);
	}

	public void detailResultPDF() throws IOException, COSVisitorException {
		// Create a document and add a page to it
		PDDocument doc = new PDDocument();
		// PDPage page = addNewPage(doc);
		PDPage page = new PDPage();
		doc.addPage(page);

		// -----Add a chart
		float alto = page.findMediaBox().getHeight();
		float ancho = page.findMediaBox().getWidth();

		PDFont font = PDType1Font.HELVETICA_BOLD;
		float fontSize = 12.0f;

		PDPageContentStream contentStream = new PDPageContentStream(doc, page, true, true);

		contentStream.beginText();
		contentStream.setFont(font, fontSize);
		contentStream.moveTextPositionByAmount((page.findMediaBox().getWidth() - (margin * 2) - 26) / 2,
				page.findMediaBox().getHeight() - 30);
		contentStream.drawString("Detalles ejecucion de tests");
		contentStream.endText();
		contentStream.close();

		// ---------------------------------------------
		// Initialize table

		float yStartNewPage = alto - (margin);
		float tableWidth = ancho - (2 * margin);
		boolean drawContent = true;
		float yStart = yStartNewPage;
		float bottomMargin = 10;

		BaseTable table1 = new BaseTable(yStart, yStartNewPage, bottomMargin, tableWidth, margin, doc, page, true,
				drawContent);

		// Create Header row
		Row headerRow1 = table1.createRow(15f);
		Cell cell1 = headerRow1.createCell(25, "Test");
		cell1.setFont(PDType1Font.HELVETICA_BOLD);
		cell1.setFillColor(Color.DARK_GRAY);
		cell1.setTextColor(Color.WHITE);
		
		cell1 = headerRow1.createCell(50, "Descripcion");
		cell1.setFont(PDType1Font.HELVETICA_BOLD);
		cell1.setFillColor(Color.DARK_GRAY);
		cell1.setTextColor(Color.WHITE);

		cell1 = headerRow1.createCell(10, "Resultado");
		cell1.setFont(PDType1Font.HELVETICA_BOLD);
		cell1.setFillColor(Color.DARK_GRAY);
		cell1.setTextColor(Color.WHITE);
		
		cell1 = headerRow1.createCell(15, "Duracion");
		cell1.setFont(PDType1Font.HELVETICA_BOLD);
		cell1.setFillColor(Color.DARK_GRAY);
		cell1.setTextColor(Color.WHITE);

		table1.setHeader(headerRow1);

		// Create rows

		int i = detalleListaCP.size();
		int j = 0;
		while (i > 0) {

			Row row1 = table1.createRow(15f);
			cell1 = row1.createCell(25, detalleListaCP.get(j).get(0).toString());
			cell1.setFont(PDType1Font.HELVETICA);
/*			if (detalleListaCP.get(j).get(2).toString() == "true") {
				cell1.setFillColor(Color.GREEN);
			} else {
				cell1.setFillColor(Color.RED);
			}*/
			cell1.setTextColor(Color.BLACK);
			
			cell1 = row1.createCell(50, detalleListaCP.get(j).get(1).toString());
			cell1.setFont(PDType1Font.HELVETICA);
			cell1.setTextColor(Color.BLACK);

			if (detalleListaCP.get(j).get(2).toString() == "true") {
				cell1 = row1.createCell(10, "Exitoso");
				cell1.setFont(PDType1Font.HELVETICA);
				cell1.setFillColor(Color.GREEN);
				cell1.setTextColor(Color.BLACK);
			} else {
				cell1 = row1.createCell(10, "Fallido");
				cell1.setFont(PDType1Font.HELVETICA);
				cell1.setFillColor(Color.RED);
				cell1.setTextColor(Color.BLACK);
			}
			
			cell1 = row1.createCell(15, detalleListaCP.get(j).get(3).toString());
			cell1.setFont(PDType1Font.HELVETICA);
		/*	if (detalleListaCP.get(j).get(2).toString() == "true") {
				cell1.setFillColor(Color.GREEN);
			} else {
				cell1.setFillColor(Color.RED);
			}*/
			cell1.setTextColor(Color.BLACK);

			j++;
			i--;
		}

		table1.draw();
		// ---------------------------------------------

		File file = new File(fileNameResults);
		Files.createParentDirs(file);
		doc.save(fileNameResultsDetails);
		doc.close();
	}

	private static JFreeChart generatePieChart(Float passed, Float failed) {
		DefaultPieDataset dataSet = new DefaultPieDataset();
		dataSet.setValue("Exitosos", passed);
		dataSet.setValue("Fallidos", failed);
		JFreeChart chart = ChartFactory.createPieChart("TESTS", dataSet, true, true, false);
		PiePlot ColorConfigurator = (PiePlot) chart.getPlot();
		ColorConfigurator.setSectionPaint("Exitosos", Color.GREEN);
		ColorConfigurator.setSectionPaint("Fallidos", Color.RED);
		Plot plot = chart.getPlot();
		plot.setBackgroundPaint(Color.WHITE);
		return chart;
	}

	public void logTcResultPassed(long duration, String methodName) throws Exception {
		addPassed();
		addRow2(methodName.substring(methodName.indexOf(".") + 1),  Config.globalDescrip , true, duration );
		addDuration(duration / 1000000);
	}

	public void logTcResultFailed(long duration, String error, String methodName) throws Exception {		
		Frmwrk.tomarSS();
		addFailed();
		addRow2(methodName.substring(methodName.indexOf(".") + 1), Config.globalDescrip, false,  duration);
		addDuration(duration / 1000000);
		updateFailPDF(error, methodName);
	}
	
	public void logTcResultFailedSinPDF(long duration, String methodName) throws Exception {		
		addFailed();
		addRow2(methodName.substring(methodName.indexOf(".") + 1), Config.globalDescrip, false,  duration);
		addDuration(duration / 1000000);		
	}
	

	public void borrarBuffer() throws Exception {
		File imageFile = new File(System.getProperty("user.dir") + "//bufferedImage.jpg");
		if (imageFile.exists()) {
			imageFile.deleteOnExit();
		} // borrar la imagen buffer, si existe
	}

	public String logError(Exception ex) {
		final Writer writer = new StringWriter();
		final PrintWriter printWriter = new PrintWriter(writer);
		ex.printStackTrace(printWriter);
		return writer.toString();
	}
	
	public void updateEvidencePDF(String tcName, String tcStep) throws Exception {
		String fileEvidenceNameDest = Frmwrk.CARPETA_EVIDENCIAS + tcName + ".pdf";

		File f = new File(fileEvidenceNameDest);

		if (f.exists()) {
			PDDocument doc = PDDocument.load(fileEvidenceNameDest);
			addEvidencePagePDF(doc, tcStep, fileEvidenceNameDest);
		} else {
			PDDocument doc = new PDDocument();
			addEvidencePagePDF(doc, tcStep, fileEvidenceNameDest);
		}

		actualizarLog(fileEvidenceNameDest);
	}
	
	public void updateEvidencePDF2(String tcName, String tcStep,Integer id) throws Exception {
		String fileEvidenceNameDest = Frmwrk.CARPETA_EVIDENCIAS + tcName + ".pdf";

		File f = new File(fileEvidenceNameDest);

		if (f.exists()) {
			PDDocument doc = PDDocument.load(fileEvidenceNameDest);
			addEvidencePagePDF2(doc, tcStep, fileEvidenceNameDest,id);
		} else {
			PDDocument doc = new PDDocument();
			addEvidencePagePDF2(doc, tcStep, fileEvidenceNameDest,id);
		}

		actualizarLog(fileEvidenceNameDest);
	}

	public static void addEvidencePagePDF(PDDocument doc, String tcStep, String fileEvidenceNameDest) throws Exception {
		try {

			tcStep = Frmwrk.obtenerFecha() + " - " + tcStep;

			PDPage page = addNewPage(doc);
			PDFont font = PDType1Font.HELVETICA_BOLD;
			float fontSize = 12.0f;

			List allPages = doc.getDocumentCatalog().getAllPages();
			PDPage lastPage = (PDPage) allPages.get(allPages.size() - 1);
			PDRectangle pageSize = lastPage.findMediaBox();
			float stringWidth = font.getStringWidth(tcStep);
			float centeredPosition = (pageSize.getWidth() - (stringWidth * fontSize) / 1000f) / 2f;

			PDPageContentStream contentStream = new PDPageContentStream(doc, page, true, true);

			int ultimaLinea = 30;
			int cantidad = 10;
			int i = 0;

			contentStream.beginText();
			contentStream.setFont(font, fontSize);
			contentStream.endText();
			contentStream.close();

			if (tcStep.length() > 85) {
				cantidad = Math.round(tcStep.length() / 85);
				while (cantidad > 0) {
					contentStream.beginText();
					contentStream.moveTextPositionByAmount(50, page.findMediaBox().getHeight() - ultimaLinea);
					contentStream.drawString(tcStep.substring(i * 85, (i + 1) * 85));
					contentStream.endText();
					contentStream.close();
					i++;
					ultimaLinea = ultimaLinea + 20;
					cantidad--;
				}
				// -------
				contentStream.beginText();
				contentStream.moveTextPositionByAmount(50, page.findMediaBox().getHeight() - ultimaLinea);
				contentStream.drawString(tcStep.substring(i * 85, tcStep.length()));
				contentStream.endText();
				contentStream.close();
			} else {
				contentStream.beginText();
				contentStream.moveTextPositionByAmount(50, page.findMediaBox().getHeight() - ultimaLinea);
				contentStream.drawString(tcStep);
				contentStream.endText();
				contentStream.close();
			}

			String pp="";
			
			if (Frmwrk.validacion.equals("BIEN"))
			{pp = System.getProperty("user.dir") + "//ok.jpg";
			Frmwrk.validacion="";}
			else if (Frmwrk.validacion.equals("MAL"))
			{pp = System.getProperty("user.dir") + "//bad.jpg";
			Frmwrk.validacion="";}
			else
			{pp = System.getProperty("user.dir") + "//bufferedImage.jpg";}
			
			File aa = new File(pp);			
			BufferedImage ss = ImageIO.read(aa);
			
		    PDXObjectImage pdImage =  new PDPixelMap(doc, ss);
		    PDPageContentStream contentStream2 = new PDPageContentStream(doc, page, true, true);
			float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();
			float ancho = Math.round((page.findMediaBox().getWidth()/2) - (margin * 2));
			float alto = Math.round(ancho * proporcion);
			centeredPosition = ((pageSize.getWidth() - ancho) / 2f);
			contentStream2.drawXObject(pdImage, centeredPosition,
					page.findMediaBox().getHeight() - alto - 20 - ultimaLinea, ancho, alto);
			contentStream2.close();
		    
		    //-------------------------------------
			/*PDPageContentStream contentStream2 = new PDPageContentStream(doc, page);
			contentStream2.drawImage(pdImage, 70, 250);
			contentStream2.close();*/
		    //-----------------------
			/*
			 PDXObjectImage pdImage = null;
			 pdImage = new PDJpeg(doc, new FileInputStream((System.getProperty("user.dir") + "\\bufferedImage.jpg")));
			
			PDPageContentStream contentStream2 = new PDPageContentStream(doc, page, true, true);
			float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();
			float ancho = Math.round(page.findMediaBox().getWidth() - (margin * 2));
			float alto = Math.round(ancho * proporcion);
			centeredPosition = ((pageSize.getWidth() - ancho) / 2f);
			contentStream2.drawXObject(pdImage, centeredPosition,
					page.findMediaBox().getHeight() - alto - 20 - ultimaLinea, ancho, alto);
			contentStream2.close();*/			
			

			doc.save(fileEvidenceNameDest);
			doc.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

	public static void agregarFooter(String fileUrl) throws Exception {
		PDDocument doc = null;
		try {
			doc = PDDocument.load(fileUrl);

			List<?> allPages = doc.getDocumentCatalog().getAllPages();
			PDFont font = PDType1Font.HELVETICA_BOLD;
			float fontSize = 12.0f;
			for (int i = 0; i < allPages.size(); i++) {
				PDPage page = (PDPage) allPages.get(i);
				PDPageContentStream footercontentStream = new PDPageContentStream(doc, page, true, true);
				footercontentStream.beginText();
				footercontentStream.setFont(font, fontSize);
				footercontentStream.moveTextPositionByAmount((PDPage.PAGE_SIZE_A4.getUpperRightX() / 2),
						(PDPage.PAGE_SIZE_A4.getLowerLeftY() + 5));
				footercontentStream.drawString(String.valueOf(i + 1));
				footercontentStream.endText();
				footercontentStream.close();
			}
			doc.save(fileUrl);
		} finally {
			if (doc != null) {
				doc.close();
			}
		}
	}

	public static void actualizarReporteDetalleResultado() throws Exception {
		agregarFooter(fileNameResultsDetails);
	}

	public static void actualizarLog(String fileName) throws Exception {
		agregarFooter(fileName);
	}

	public static void actualizarReporteFallas() throws Exception {
		File f = new File(fileNameFallas);
		if (f.exists()) {
			agregarFooter(fileNameFallas);
		}
	}

	public static void crearTapaLogo() throws IOException, COSVisitorException {
		// Create a document and add a page to it
		PDDocument doc = new PDDocument();
		PDPage page = addNewPage(doc);

		float alto = page.findMediaBox().getHeight();
		float ancho = page.findMediaBox().getWidth();
		float centeredPosition = ((page.findMediaBox().getWidth()) / 2f);

		// ---------------------------------------------

		PDPageContentStream contentStream = new PDPageContentStream(doc, page, true, true);

		PDFont font = PDType1Font.HELVETICA_BOLD;
		float fontSize = 16.0f;

		File imageFile = new File(System.getProperty("user.dir") + "//logo.jpg");

		if (imageFile.exists()) {
			PDPageContentStream contentStream2 = new PDPageContentStream(doc, page, true, true);
			PDXObjectImage pdImage = null;
			pdImage = new PDJpeg(doc, new FileInputStream((System.getProperty("user.dir") + "//logo.jpg")));

			float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();

			ancho = Math.round(page.findMediaBox().getWidth() - (margin * 2));
			alto = Math.round(ancho * proporcion);

			contentStream2.drawXObject(pdImage, margin, page.findMediaBox().getHeight() - alto - 150, ancho, alto);
			contentStream2.close();
		}

		// ---------------------------------------------

		contentStream.beginText();
		contentStream.setFont(font, fontSize);
		contentStream.moveTextPositionByAmount(
		centeredPosition - ((font.getStringWidth("Suite ejecutada: " + Frmwrk.fecha) * 16 / 1000) / 2),
		page.findMediaBox().getHeight() - 450);
		contentStream.drawString("Suite ejecutada: " + Frmwrk.fecha);
		contentStream.endText();
		contentStream.close();
		// ---------------------------------------------
		
		contentStream.beginText();
		contentStream.moveTextPositionByAmount(
		centeredPosition - ((font.getStringWidth("Versi�n de App: " + Frmwrk.versionApp) * 16 / 1000) / 2),
		page.findMediaBox().getHeight() - 400);
		contentStream.drawString("Versi�n de App: " + Frmwrk.versionApp);
		contentStream.endText();
		contentStream.close();
		// ---------------------------------------------
		
		contentStream.beginText();
		contentStream.moveTextPositionByAmount(
		centeredPosition - ((font.getStringWidth("Sistema Operativo: " + Frmwrk.versionOS) * 16 / 1000) / 2),
		page.findMediaBox().getHeight() - 350);
		contentStream.drawString("Sistema Operativo: " + Frmwrk.versionOS);
		contentStream.endText();
		contentStream.close();
		// ---------------------------------------------

		File file = new File(fileNameTapaLogo);
		Files.createParentDirs(file);
		doc.save(fileNameTapaLogo);
		doc.close();
	}

	public static void unificarResultados() throws Exception {
		File file0 = new File(fileNameTapaLogo);
		PDDocument doc0 = PDDocument.load(file0);

		File file1 = new File(fileNameResults);
		PDDocument doc1 = PDDocument.load(file1);

		File file2 = new File(fileNameResultsDetails);
		PDDocument doc2 = PDDocument.load(file2);

		PDFMergerUtility PDFmerger = new PDFMergerUtility();
		PDFmerger.setDestinationFileName(fileNameTotal);
		PDFmerger.addSource(file0);
		PDFmerger.addSource(file1);
		PDFmerger.addSource(file2);

		PDFmerger.mergeDocuments();
		doc0.close();
		doc1.close();
		doc2.close();

		file0.delete();
		file1.delete();
		file2.delete();

		/*
		 * if(file0.delete()) { System.out.println("File1 deleted successfully"); } else
		 * { System.out.println("Failed to delete the file0"); }
		 * 
		 * if(file1.delete()) { System.out.println("File1 deleted successfully"); } else
		 * { System.out.println("Failed to delete the file1"); }
		 * 
		 * if(file2.delete()) { System.out.println("File2 deleted successfully"); } else
		 * { System.out.println("Failed to delete the file2"); }
		 */

	}

	public static void addEvidencePagePDF2(PDDocument doc, String tcStep, String fileEvidenceNameDest, Integer id) throws Exception {
		try {

			tcStep = Frmwrk.obtenerFecha() + " - " + tcStep;

			PDPage page = addNewPage(doc);
			PDFont font = PDType1Font.HELVETICA_BOLD;
			float fontSize = 12.0f;

			List allPages = doc.getDocumentCatalog().getAllPages();
			PDPage lastPage = (PDPage) allPages.get(allPages.size() - 1);
			PDRectangle pageSize = lastPage.findMediaBox();
			float stringWidth = font.getStringWidth(tcStep);
			float centeredPosition = (pageSize.getWidth() - (stringWidth * fontSize) / 1000f) / 2f;

			PDPageContentStream contentStream = new PDPageContentStream(doc, page, true, true);

			int ultimaLinea = 30;
			int cantidad = 10;
			int i = 0;

			contentStream.beginText();
			contentStream.setFont(font, fontSize);
			contentStream.endText();
			contentStream.close();

			if (tcStep.length() > 85) {
				cantidad = Math.round(tcStep.length() / 85);
				while (cantidad > 0) {
					contentStream.beginText();
					contentStream.moveTextPositionByAmount(50, page.findMediaBox().getHeight() - ultimaLinea);
					contentStream.drawString(tcStep.substring(i * 85, (i + 1) * 85));
					contentStream.endText();
					contentStream.close();
					i++;
					ultimaLinea = ultimaLinea + 20;
					cantidad--;
				}
				// -------
				contentStream.beginText();
				contentStream.moveTextPositionByAmount(50, page.findMediaBox().getHeight() - ultimaLinea);
				contentStream.drawString(tcStep.substring(i * 85, tcStep.length()));
				contentStream.endText();
				contentStream.close();
			} else {
				contentStream.beginText();
				contentStream.moveTextPositionByAmount(50, page.findMediaBox().getHeight() - ultimaLinea);
				contentStream.drawString(tcStep);
				contentStream.endText();
				contentStream.close();
			}

			String pp = System.getProperty("user.dir") + "//bufferedImage"+ id+".jpg";
			File aa = new File(pp);			
			BufferedImage ss = ImageIO.read(aa);
			
		    PDXObjectImage pdImage =  new PDPixelMap(doc, ss);
		    PDPageContentStream contentStream2 = new PDPageContentStream(doc, page, true, true);
			float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();
			float ancho = Math.round((page.findMediaBox().getWidth()/2) - (margin * 2));
			float alto = Math.round(ancho * proporcion);
			centeredPosition = ((pageSize.getWidth() - ancho) / 2f);
			contentStream2.drawXObject(pdImage, centeredPosition,
					page.findMediaBox().getHeight() - alto - 20 - ultimaLinea, ancho, alto);
			contentStream2.close();
		    
		    //-------------------------------------
			/*PDPageContentStream contentStream2 = new PDPageContentStream(doc, page);
			contentStream2.drawImage(pdImage, 70, 250);
			contentStream2.close();*/
		    //-----------------------
			/*
			 PDXObjectImage pdImage = null;
			 pdImage = new PDJpeg(doc, new FileInputStream((System.getProperty("user.dir") + "\\bufferedImage.jpg")));
			
			PDPageContentStream contentStream2 = new PDPageContentStream(doc, page, true, true);
			float proporcion = (float) pdImage.getHeight() / (float) pdImage.getWidth();
			float ancho = Math.round(page.findMediaBox().getWidth() - (margin * 2));
			float alto = Math.round(ancho * proporcion);
			centeredPosition = ((pageSize.getWidth() - ancho) / 2f);
			contentStream2.drawXObject(pdImage, centeredPosition,
					page.findMediaBox().getHeight() - alto - 20 - ultimaLinea, ancho, alto);
			contentStream2.close();*/			
			

			doc.save(fileEvidenceNameDest);
			doc.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}

	
	

}
