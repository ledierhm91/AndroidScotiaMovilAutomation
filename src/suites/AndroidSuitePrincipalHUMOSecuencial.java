/*
 * Classname: Suite  
 * Version information: 1.0
 * Date: September 17 2018 
 * Copyright notice
 */

package suites;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import framework.Config;
import framework.ConfigParalelo;
import framework.Frmwrk;


public class AndroidSuitePrincipalHUMOSecuencial{	
	
	@Test
	public void executa() throws Exception
	{try
		{
		String puerto = null; String udid = null;
		
		List<String> listA = new ArrayList<String>();

		listA.add("4723 42007aa7d3b1a57b"); // Samsung J4
		listA.add("4723 ad0a16036888f1122f"); // Samsung S7
		
		for (String element : listA) {
		
		puerto = (String) element.substring(0, 4);
		udid = (String) element.substring(5, element.length());
		
		Config.iniciar(puerto, udid); 
		
		AndroidSuiteModular suite = new AndroidSuiteModular();		
		
	 	Frmwrk.conectarBD();
	    Frmwrk.iniReportes();
		//----------------------------------------------------------  		     		    					
			//*	
	    	suite.modLogIn("D", 2);//3
	    	suite.modPagoTarjeta();
	    	suite.modLogOut();
	    
/*	    	suite.modLogIn("D", 1);
	  	    suite.modTransacciones();
	        suite.modTransferInterna();
	        suite.modTransferPlaza();
	    	suite.modConsultarCuenta();
	    	suite.modSolChequera();
	    	suite.modLogOut(); 	*/
		    
	 /*   	suite.modLogIn("D", 5);
		  	suite.modPrestamos();
		  	suite.modLogOut();
		  	
		  	//---Transferencias con firmantes
			suite.modLogIn("D", 6);
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
		
			}		
	catch(Exception ex) 	
	{	Config.terminarSesion();
		Frmwrk.cerrarConexionBD();
	    System.out.println(Frmwrk.logError(ex));	    
	    fail("Verificar el stack trace en la Consola");}	
	}
}
	