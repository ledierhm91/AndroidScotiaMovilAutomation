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
import framework.ConfigParalelo;
import framework.Frmwrk;


public class AndroidSuitePrincipalHUMOParalelo{	
		
/*	public void execute() throws Exception
	{try
		{
		    Runnable r1 = new ConfigParalelo("4723", "42007aa7d3b1a57b"); //device id of first mobile device
	        System.out.println ("1er config main");
	        Runnable r2 = new ConfigParalelo("5000", "ad0a16036888f1122f"); //device id of second mobile device
	        System.out.println ("2do config main");
	        new Thread(r1).start();
	        System.out.println ("1er start main");
		    new Thread(r2).start();
		    System.out.println ("2do start main");
			
			}		
	catch(Exception ex) 	
	{	Config.terminarSesion();
		Frmwrk.cerrarConexionBD();
	    System.out.println(Frmwrk.logError(ex));	    
	    fail("Verificar el stack trace en la Consola");}	
	}
	*/
	//public void ejecutar(String portNumber, String udid) throws Exception
	
	@Test
	public void executa() throws Exception
	{try
		{		
		ConfigParalelo.main();
			}		
	catch(Exception ex) 	
	{	Config.terminarSesion();
		Frmwrk.cerrarConexionBD();
	    System.out.println(Frmwrk.logError(ex));	    
	    fail("Verificar el stack trace en la Consola");}	
	}
}
	