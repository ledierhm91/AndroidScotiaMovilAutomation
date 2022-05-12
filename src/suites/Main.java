package suites;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


import framework.Config;
import framework.Frmwrk; 

public class Main extends Frame {
	
	 private JFrame mainFrame;
	 private static JLabel statusLabel;
	 private Label tipoPruebasLabel;
	 private Label origenDatospruebaLabel;
	 private JPanel controlPanel2;
	 private JPanel controlPanel3;
	 
	 private int ejecutar=1;
	 private static String mensaje="";
	 
	public Main() throws IOException{prepareGUI();}

	public static void main(String[] args) throws IOException {
		Config.globalBrowser="C";
	 	   Config.globalJD="T";
	 	  
	 Main  swingControlDemo = new Main();     
	 swingControlDemo.showRadioButtonDemo();}

	 private void prepareGUI() throws IOException{
		 	   Frmwrk.tipoPrueba="H";
		       mainFrame = new JFrame("Opciones para la ejecuci�n de la Suite de pruebas (mobile Android)");		
		       mainFrame.setSize(650,250);
		       
//		       URL resource = mainFrame.getClass().getResource("/logo-app.png");
//	           BufferedImage icono = ImageIO.read(resource);
//	           mainFrame.setIconImage(icono);
		       
		       mainFrame.setLayout(new GridLayout(5, 1));		
		       mainFrame.addWindowListener(new WindowAdapter() 
		       {public void windowClosing(WindowEvent windowEvent){System.exit(0);}});   
		
		       JButton myButton = new JButton("Comenzar");
		       
		       statusLabel = new JLabel("", SwingConstants.CENTER);	
		       Border border = BorderFactory.createLineBorder(Color.RED, 3);
		       statusLabel.setBorder(border);

		       tipoPruebasLabel = new Label("Seleccione el tipo de pruebas que desee realizar:", JLabel.CENTER);
		       origenDatospruebaLabel = new Label("Seleccione origen de los datos de prueba:", JLabel.CENTER);		       
		       
		       controlPanel2 = new JPanel();		 
		       controlPanel2.setLayout(new GridLayout(1, 4));
		       
		       controlPanel3 = new JPanel();		 
		       controlPanel3.setLayout(new GridLayout(1, 4));
		       
//		       ImageIcon image = new ImageIcon(System.getProperty("user.dir") + "\\logo-mini.jpg");		   
//		       JLabel imagen = new JLabel(image);	       
		       
//		       mainFrame.add(imagen);		     
		       mainFrame.add(controlPanel2);
		       mainFrame.add(controlPanel3);
		       mainFrame.add(statusLabel);	
		       mainFrame.add(myButton);
		       
		       mainFrame.setVisible(true); 
		       mainFrame.setResizable(false); // para quitar boton maximizar
		       mainFrame.setLocationRelativeTo(null); //Para centrar en pantalla
		       
		       myButton.addActionListener(new ActionListener() {		 
			          public void actionPerformed(ActionEvent e) {			        	 
			        	  if (ejecutar==1)
			        	  {Object[] options = {"Confirmar","Cancelar"};
						int n = JOptionPane.showOptionDialog(mainFrame,	"Est� seguro de ejecutar lo siguiente? \n" + mensaje,
						    "Confirmar acci�n", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						    null,     //do not use a custom Icon
						    options,  //the titles of buttons
						    options[0]); //default button title						
						
						if (n==0)
						{
						Frmwrk.ejecucion=mensaje;
						
						statusLabel.setText("Comenz� la ejecuci�n, por favor no cerrar esta ventana.");
						mainFrame.setVisible(true);
						
						try {Thread.sleep(2000);} 
						catch (InterruptedException e1) {e1.printStackTrace();}	
						  
							
			        	  if (Frmwrk.tipoPrueba.equals("H")) {
			              	JUnitCore junit = new JUnitCore();
			      	  		  junit.addListener(new TextListener(System.out));
			      	  		  Result result = junit.run(AndroidSuitePrincipalHUMO.class); 
			      	  		  if (result.getFailureCount() > 0) {
			      	  			JOptionPane.showMessageDialog(mainFrame, "Se encontraron fallas en las pruebas (consultar documentaci�n)");
			      	  		    System.exit(1);
			      	  		  } else {
			      	  			JOptionPane.showMessageDialog(mainFrame, "Se completaron las pruebas");
			      	  		    System.exit(0);
			      	  		  }
			              } else if (Frmwrk.tipoPrueba.equals("T")) {
			              	 JUnitCore junit2 = new JUnitCore();
			      	  		  junit2.addListener(new TextListener(System.out));
			      	  		  Result result2 = junit2.run(ASPrincipalPaquete.class); 
			      	  		  if (result2.getFailureCount() > 0) {
			      	  			JOptionPane.showMessageDialog(mainFrame, "Se encontraron fallas en las pruebas (consultar documentaci�n)");
			      	  		    System.exit(1);
			      	  		  } else {
			      	  			JOptionPane.showMessageDialog(mainFrame, "Se completaron las pruebas");
			      	  		    System.exit(0);
			      	  		  }
			              } 
							
						ejecutar=0;}}
			        	  else 
			        	  {JOptionPane.showMessageDialog(mainFrame,	"Ya se est� ejecutando la suite");}			        	    
			          }	
			          });		
		    }
		
		    private void showRadioButtonDemo(){
		 
		       //------------------------------------------------------------------
		       final JRadioButton radBD = new JRadioButton("Base de datos", true);	
		       final JRadioButton radDefault = new JRadioButton("Default");	
		       //------------------------------------------------------------------	       
		       final JRadioButton radHumo = new JRadioButton("Pruebas de humo", true);
		       final JRadioButton radTodos = new JRadioButton("Todas las pruebas");
		       //------------------------------------------------------------------
		       radBD.addItemListener(new ItemListener() {		
			          public void itemStateChanged(ItemEvent e) {Config.globalJD="T";
			          if (e.getStateChange()==1) {generarmensaje();}}});
			  		
		       radDefault.addItemListener(new ItemListener() {
			          public void itemStateChanged(ItemEvent e) {Config.globalJD="D";
			          if (e.getStateChange()==1) {generarmensaje();}}});
		     //------------------------------------------------------------------ 		       
		       radHumo.addItemListener(new ItemListener() {		
			          public void itemStateChanged(ItemEvent e) {Frmwrk.tipoPrueba="H";
			          if (e.getStateChange()==1) {generarmensaje();}}});
			  		
		       radTodos.addItemListener(new ItemListener() {
			          public void itemStateChanged(ItemEvent e) {Frmwrk.tipoPrueba="T";
			          if (e.getStateChange()==1) {generarmensaje();}}});
		     //------------------------------------------------------------------
		       //agrupar radio buttons para comportamiento
		
		       ButtonGroup group2 = new ButtonGroup();	
		       ButtonGroup group3 = new ButtonGroup();	
		       
		       group2.add(radBD);		
		       group2.add(radDefault);		
		       
		       group3.add(radHumo);
		       group3.add(radTodos);
		
		       Panel panel2 = new Panel();
		       Panel panel3 = new Panel();
		       panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		       panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		       
		       controlPanel2.add(panel2);
		       controlPanel3.add(panel3);		       
		       
		       panel2.add(origenDatospruebaLabel);
		       panel2.add(radBD);		
		       panel2.add(radDefault);	
		       
		       panel3.add(tipoPruebasLabel);	
		       panel3.add(radHumo);		       
		       panel3.add(radTodos);				       
		       
		       mainFrame.setVisible(true);  
		       
		      generarmensaje();
		
		    }
		    
		    private static void generarmensaje(){
		    	
		    	String datosDesde="xxxxx";
		    	String pruebas="xxxxx";
		    	
		        if (Config.globalJD.equals("T")) {datosDesde="desde la Base de datos";} 
		        else if (Config.globalJD.equals("D")) {datosDesde="Default (inclu�dos en el paquete)";}	
		        
		        if (Frmwrk.tipoPrueba.equals("T")) {pruebas="todas las pruebas";} 
		        else if (Frmwrk.tipoPrueba.equals("H")) {pruebas="pruebas de Humo";}		    	
		    	
		    	mensaje="<html>Se ejecutar�n " + pruebas + " utilizando datos de prueba "  + datosDesde + " </html>";
		    	
		        statusLabel.setText(mensaje);
		    	
		    }

	   }



