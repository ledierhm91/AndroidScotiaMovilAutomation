package framework;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import framework.Config;

public class Frmwrk {	
		
	//------------------------- Reportes ----------------------------
	
	static DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
	static Date date = new Date();	
	public static String fecha = dateFormat.format(date);	
	public static String versionApp="xx";	
	public static String versionOS="xx";
	public static String versionOSNum="xx";
	public static String ejecucion="";
	public static String tipoPrueba="";
	public static String validacion="";
	public static String celu="";
	public static Boolean ini=false;
	public static Boolean first=false;
	public static Boolean plantilla=false;
	public static Boolean tarj3ro=false;
	
	private static File srcFile1;
	private static File srcFile2;
	private static File srcFile3;
	
	//public static String CARPETA = System.getProperty("user.dir") + "\\";
	public static String CARPETA =  "//Users//ledier.hernandez//Documents//";
	public static String CARPETA_REPORTES = CARPETA + fecha + " - Android " + Config.driver.getCapabilities().getCapability("platformVersion") +"//";
	//public static String CARPETA_REPORTES = CARPETA + "Reportes//";
	//public static String CARPETA_REPORTES = CARPETA + fecha + " - Android " +"//";
	public static String CARPETA_EVIDENCIAS = CARPETA_REPORTES + "//" + "Evidencia" + "//";
	static File dir = new File(CARPETA_EVIDENCIAS);	
	
	static Reportes rprts = new Reportes();		
	
	static Connection con = null;
	static Statement stmt = null;
	public static ResultSet rs = null;
	
	public static void iniReportes() throws Exception
	{
		dir.mkdirs();// -- Solo crea la carpeta de evidencias
	
	if (ejecucion.equals("")) {generarmensaje();}	
	logBD("Inicio de ejecucion", ejecucion , "INICIO");
	} 
	
	public static void generarReportesResultado() throws Exception
	{rprts.setupResultPDF();
	dir.mkdirs();
	rprts.detailResultPDF();
	Reportes.actualizarReporteDetalleResultado();
	Reportes.actualizarReporteFallas();
	Reportes.crearTapaLogo();
	Reportes.unificarResultados();
	}
		
	public static void tomarSS() throws Exception
	{
		File srcFile=Config.driver.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir") + "//bufferedImage.jpg");
        FileUtils.copyFile(srcFile,targetFile);	
	}
	
	public static String logError(Exception ex)
	{return rprts.logError(ex);}
	
	public static void logResultadoPassed(long duracion, String nombreCP) throws Exception
	{rprts.logTcResultPassed(duracion, nombreCP);
	logBD(nombreCP, "Funcion� correctamente", "OK");
	}
	
	public static void logResultadoFailed(long duracion,String error, String nombreCP) throws Exception
	{rprts.logTcResultFailed(duracion, error, nombreCP);
	//-----Codigo para agregar mensaje en BD-------
	String mensajeBD="";
	int indice = error.indexOf("ui.UI");
	if (indice != -1) {mensajeBD = error.substring(indice, indice + 100);}
	else  
	{mensajeBD="Ha fallado en alguna clase no perteneciente a UI, revisar reporte de fallas";}
	//-----//-----//-----//-----//-----//-----//-----
	logBD(nombreCP, mensajeBD, "Falla");
	}
	
	public  static void borrarBuffer() throws Exception
	{rprts.borrarBuffer();}	
	
	public static void logEvidencia(String nombreCP, String nombrePaso) throws Exception
	{Thread.sleep(1000);
		tomarSS();		
		rprts.updateEvidencePDF(nombreCP.substring( nombreCP.indexOf(".") +1 ), nombrePaso);		
		logBD(nombreCP, nombrePaso, "OK");
	}	
	
	public static void logBD(String nombreCP, String nombrePaso, String resultado) throws Exception	{	
		//------------------------LOG en BD-----------		
	/*	 String query = "Insert into automatic.log_ejec (fecha_proceso, caso_de_prueba, resultado, detalle,version_hb , id_ejecucion) values\r\n" + 
		 "(sysdate,'" + nombreCP.substring( nombreCP.indexOf(".") +1 ) + "'," + "'" + resultado + "'" + ",'" + nombrePaso + "','" + versionApp + "','" + fecha + "')";
		// System.out.println (query);  
		 Frmwrk.consultarBD(query);	*/
	}		
	
		//---------------------- Gen�rico ------------------------
		
		public static String obtenerFecha() throws Exception
		{DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss");
		Date date = new Date();
		return dateFormat.format(date);}
		
		//---------------------------------------------------------------		
		
		public static void conectarBD() throws SQLException {				
			    try {Properties connectionProps = new Properties();
			        connectionProps.put("user", "robot");
			        connectionProps.put("password", "Pandemia2020");
			        con = DriverManager.getConnection("jdbc:oracle:thin:@//oraixtes-scan.unx.nbc.com.uy:1521/banking_tes.unx.nbc.com.uy",connectionProps);
			        stmt = con.createStatement();
			    ////---------------------------
			    } catch (SQLException e ) {
			    	System.out.println (e);
			    } //finally { if (stmt != null) { stmt.close(); }} 
			} 
		
		public static void cerrarConexionBD() throws SQLException {				
		    try {
		    if (con != null) { stmt.close(); }
		    if (stmt != null) { stmt.close(); }
		    ////---------------------------
		    } catch (SQLException e ) {
		    	System.out.println (e);
		    } //finally { if (stmt != null) { stmt.close(); }} 
		} 
			
		
		public static ResultSet consultarBD(String query)
			    throws SQLException {					
			    try {ResultSet rs = stmt.executeQuery(query);
			      	return rs;} 
			    catch (SQLException e ) {
			    	System.out.println (e);}
			    return rs;}
		
		private static void generarmensaje(){	    	
	    	String navega="xxxxx"; 
	    	String datosDesde="xxxxx";
	    	String pruebas="xxxxx";
	    	
	        if (Config.globalJD.equals("T")) {datosDesde="desde la Base de datos";} 
	        else if (Config.globalJD.equals("D")) {datosDesde="Default (incluidos en el paquete)";}	  	
	     		        	        
	        
	        if (tipoPrueba.equals("T")) {pruebas="todas las pruebas";} 
	        else if (tipoPrueba.equals("H")) {pruebas="pruebas de Humo";}		    	
	    	
	        ejecucion="<html>Se ejecutar�n " + pruebas + " utilizando datos de prueba "  + datosDesde + "<br/>en el navegador " +  navega + " </html>";
	    	 }
		
		
		public static void logEvidenciaX3(String nombreCP, String nombrePaso) throws Exception
		{tomarSS2(1);		
		tomarSS2(2);
		tomarSS2(3);
		guardarSS(1);		
		guardarSS(2);
		guardarSS(3);
		rprts.updateEvidencePDF2(nombreCP.substring( nombreCP.indexOf(".") +1 ), nombrePaso + " 1",1);	
		rprts.updateEvidencePDF2(nombreCP.substring( nombreCP.indexOf(".") +1 ), nombrePaso + " 2",2);
		rprts.updateEvidencePDF2(nombreCP.substring( nombreCP.indexOf(".") +1 ), nombrePaso + " 3",3);
			
		}	
		
		public static void tomarSS2(Integer id) throws Exception
		{
			if (id==1)
			{srcFile1=Config.driver.getScreenshotAs(OutputType.FILE);}
			if (id==2)
			{srcFile2=Config.driver.getScreenshotAs(OutputType.FILE);}	
			if (id==3)
			{srcFile3=Config.driver.getScreenshotAs(OutputType.FILE);}					
			
		}

		public static void guardarSS(Integer id) throws Exception
		{
			if (id==1)
			{File targetFile=new File(System.getProperty("user.dir") + "//bufferedImage" + id + ".jpg");
	        FileUtils.copyFile(srcFile1,targetFile);	}
			if (id==2)
			{File targetFile=new File(System.getProperty("user.dir") + "//bufferedImage" + id + ".jpg");
	        FileUtils.copyFile(srcFile2,targetFile);	}	
			if (id==3)
			{File targetFile=new File(System.getProperty("user.dir") + "//bufferedImage" + id + ".jpg");
	        FileUtils.copyFile(srcFile3,targetFile);	}					
		
		}
		

				
}

