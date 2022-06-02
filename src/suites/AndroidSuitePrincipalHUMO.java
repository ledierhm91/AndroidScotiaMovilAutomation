/*
 * Classname: Suite  
 * Version information: 1.0
 * Date: September 17 2018 
 * Copyright notice
 */

package suites;

import static org.junit.Assert.*;
import org.junit.Test;

import framework.Config;
import framework.Frmwrk;


public class AndroidSuitePrincipalHUMO{	
		
	@Test
	public void execute() throws Exception
	{try
		{
			AndroidSuiteModular suite = new AndroidSuiteModular();
			
		    Config.iniciar("4723","R28M415FXEX"); // S7	
		//	Config.iniciar("4723","42007aa7d3b1a57b"); // J4
			
		//	Frmwrk.conectarBD();			
		    Frmwrk.iniReportes();
		    
		//    java.awt.Toolkit.getDefaultToolkit().beep();
			
		 		suite.modInicio(); //Incluye Splash screen y Tutorial		
		 		
		 		 // comentar esta secci�n que es la que se utiliza para ejecutar loops en homologacion
			    //--------------------------------------------------------------
	/*		    int i=1;		    
			    while (i<25)
			   		{		    	
			    	suite.modLogIn("D", 1); 	    	
				    suite.modLogOut();				    	
				    suite.modLogIn("D", 8); 			    
					suite.modLogOut();	
					System.out.println("Se ejecut� el loop " + i + " veces");
					i++;}*/
			  //--------------------------------------------------------------
			   
		 	 //Config.conClaveDigital=true;
		 				
//		 		  if (Config.conClaveDigital==true)
//		 		  {
//		 	   
//				  suite.modLogIn("D", 2); ///41337169	
//				
//		 		  }
//		 		  else
//		 		  {	
//		 			  suite.modLogIn("D", 8);
//		 		  }
		 		
                
		 		suite.modLogIn("D", 2);         //OK
		 		suite.modOpcionesMenu();        //OK
                suite.modSolChequera();       //OK
                suite.modPagoTarjetaTercero(); //OK	  
            //  suite.modTransferInterna("UYU");  //OK
//		        suite.modTransferInterna("USD"); //Al localizar la moneda usd no es loclizable por el robot.Ver con desarrolollo el tema 16/03
//		  	    suite.modTransferPlaza();	//OK	  	  
//			    suite.modTransferExtras();  //OK		
			    suite.modLogOut();  

		 		
//	 		
//    		    	suite.modLogIn("D", 8);
//    				suite.modPagoTarjeta();				
//    				suite.modLogOut();  
//				  
				/*suite.modLogIn("D", 11);
				suite.modPagoTarjeta();				
				suite.modLogOut();*/
	    	
//    	   	     suite.modLogIn("D", 10);
//		    	suite.modPlazoFijo();	
//				suite.modLogOut(); 
	
			//ejecutar solamente una vez por mes ya que no permite adelantar cuotas
//				suite.modLogIn("D", 5); 
//			  	suite.modPrestamos();   //OK
//			  	suite.modLogOut();		
	    				  	
			  	//---Transferencias con firmantes
//		    	suite.modLogIn("D", 6);
//		  	    suite.modTransferFirmas(0);
//		    	suite.modLogOut();
//		    	suite.modLogIn("D", 7);
//		  	    suite.modTransferFirmas(1);
//		    	suite.modLogOut(); 
		    	//-------------------------------
		    	
		    	/////////////////////////////////////////////////////////
		  	
		 	//	suite.modFase2();
		   
			//----------------------------------------------------------	
			Frmwrk.generarReportesResultado();
			Config.terminarSesion();
			Frmwrk.cerrarConexionBD();
			}		
	catch(Exception ex) 	
	{//	System.out.println(Frmwrk.logError(ex));
		Config.terminarSesion();		
//		Frmwrk.cerrarConexionBD();
	    System.out.println(Frmwrk.logError(ex));	    
	    fail("Verificar el stack trace en la Consola");}	
	}
	}
	