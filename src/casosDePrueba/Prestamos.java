package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Menu_ArribaAbajo;
import ui.UI_Menu_Izq;
import ui.UI_Prestamos;

public class Prestamos {
		
	public static void ingresar() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Prestamos - Consulta - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Vemos el detalle de movimientos de un prestamo"; 
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.prestamos();
	Frmwrk.logEvidencia(Config.globalCP, "Prestamo");	
	
	UI_Prestamos t = PageFactory.initElements(Config.driver, UI_Prestamos.class);
	t.verDetalle();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void pagar() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Prestamos - Pagar - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Pagamos una cuota de un prestamo"; 
	//----------------------------------------------------------	 	
	Thread.sleep(5000);
	UI_Prestamos t = PageFactory.initElements(Config.driver, UI_Prestamos.class);
	t.pagar();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	fp2.prestamosBack();
	
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
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Prestamos - Enviar plantilla - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.prestamos();
	
	UI_Prestamos t = PageFactory.initElements(Config.driver, UI_Prestamos.class);
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
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Prestamos - Guardar plantilla-borrador - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.prestamos();
	
	UI_Prestamos t = PageFactory.initElements(Config.driver, UI_Prestamos.class);
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
