/*
 * Classname: Settings 
 * 
 * Version information: 1.0
 *
 * Date: April 22nd 2015
 * 
 * Copyright notice
 */

package framework;

import static org.junit.Assert.fail;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import suites.AndroidSuiteModular;
import suites.AndroidSuitePrincipalHUMOParalelo;


public class ConfigParalelo  implements Runnable {
	
	 public static MobileElement mobileElement;	 

	  public static String port;
	  public static String udid;
	   
	    public ConfigParalelo(String portNumber, String udid) {
	        this.port = portNumber;
	        this.udid = udid;	    }	   
	  	  
	  // @Test
		 public static void main() throws InterruptedException {
			 System.out.println ("entr� main");
			 System.out.println ("1er config main");
		        Runnable r1 = new ConfigParalelo("4723", "42007aa7d3b1a57b"); //device id of first mobile device
		        
		        new Thread(r1).start();
		        System.out.println ("1er start main");
		        
		       Thread.sleep(900000);
		        
		        Runnable r2 = new ConfigParalelo("5000", "ad0a16036888f1122f"); //device id of second mobile device
		        System.out.println ("2do config main");
		        
		      new Thread(r2).start();
		       System.out.println ("2do start main");
		       
		       Thread.sleep(1000000);
		       
		    }
		 
		 public void run() {
				try {
					System.out.println ("inici� run");
					//Config.iniciar(port,udid);
					execute();
				} catch (Exception e) {
					System.out.println ("revent� run");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}// TODO Auto-generated method stub
			}
		  
	 

	 
		
		public static void execute() throws Exception
		{try
			{		
				Config.iniciar(port,udid);
				AndroidSuiteModular suite = new AndroidSuiteModular();
				
				System.out.println ("por conectar a BD");
				
			 	Frmwrk.conectarBD();
			 	System.out.println ("conect� a BD, ini reportes");
			    Frmwrk.iniReportes();
			    
			    System.out.println ("inici� reportes");
				//----------------------------------------------------------  		     		    					
					//*	
			    	suite.modLogIn("D", 3);
			    	suite.modPagoTarjeta();
			    	suite.modLogOut();
			    
			    	suite.modLogIn("D", 1);
			  	    suite.modTransacciones();
			      //  suite.modTransferInterna();
			        suite.modTransferPlaza();
			    	suite.modSolChequera();
			    	suite.modLogOut(); 	
				    
			    	suite.modLogIn("D", 5);
				  	suite.modPrestamos();
				  	suite.modLogOut();
				  	
				  	//---Transferencias con firmantes
				/*	suite.modLogIn("D", 6);
			  	    suite.modTransferFirmas(0);
			    	suite.modLogOut();
			    	suite.modLogIn("D", 7);
			  	    suite.modTransferFirmas(1);
			    	suite.modLogOut(); */
			    	//-------------------------------
			   
				//----------------------------------------------------------	
				Frmwrk.generarReportesResultado();
				Config.terminarSesion();
				Frmwrk.cerrarConexionBD();
				}		
		catch(Exception ex) 	
		{	Config.terminarSesion();
			Frmwrk.cerrarConexionBD();
		    System.out.println(Frmwrk.logError(ex));	    
		    fail("Verificar el stack trace en la Consola");}	
		}
		
		 public void terminarSesion() throws Exception { if (Config.driver != null) {
	          Config.driver.quit();
	      } } 
		
	}		

	 	  
	  