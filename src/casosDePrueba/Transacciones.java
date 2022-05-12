package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Menu_Izq;
public class Transacciones {
		
	public static void pendientes() throws Exception
	{long startTime=0;	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transacciones pendientes - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.transaccionesPendientes();	
		
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	
}
