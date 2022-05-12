package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Menu_Izq;
public class Logout {
		
	public static void salir() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Logout - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se cierra la sesion de la aplicacion"; 
	//----------------------------------------------------------	
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();	
	Thread.sleep(2000);
	fp.salir();	
	paso = "Salir";
	Frmwrk.logEvidencia(Config.globalCP, paso);		
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		//Frmwrk.logEvidencia(cp, "Falla en -- " + paso);
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
}
