package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Menu_ArribaAbajo;
import ui.UI_Menu_Izq;
import ui.UI_SolCheq;
public class SolicitudChequera {
		
	public static void completar() throws Exception
	{long startTime=0;
	String paso="";
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Solicitud chequera - Completar - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza una solicitud de chequera"; 
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.solicChequera();	
	
	paso = "Formulario de solicitud de chequeras";
	Frmwrk.logEvidencia(Config.globalCP, paso);			
	
	UI_SolCheq t = PageFactory.initElements(Config.driver, UI_SolCheq.class);
	t.completar();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void enviarPlantilla() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Solicitud chequera - Enviar Plantilla - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.solicChequera();	
	paso = "Formulario de solicitud de chequeras";
	Frmwrk.logEvidencia(Config.globalCP, paso);			
	
	UI_SolCheq t = PageFactory.initElements(Config.driver, UI_SolCheq.class);
	t.enviarPlantilla();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void guardarPlantilla() throws Exception
	{long startTime=0;
	String paso="";
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Solicitud chequera - Guardar plantilla-borrador - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.solicChequera();	
	paso = "Formulario de solicitud de chequeras";
	Frmwrk.logEvidencia(Config.globalCP, paso);			
	
	UI_SolCheq t = PageFactory.initElements(Config.driver, UI_SolCheq.class);
	t.guardarPlantilla();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
}
