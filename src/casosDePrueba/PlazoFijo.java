package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Cuentas;
import ui.UI_Menu_Izq;
import ui.UI_Prestamos;

public class PlazoFijo {
		
	public static void consultar() throws Exception
	{long startTime=0;
	String paso="";	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Plazo Fijo - Consulta - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Consultamos un plazo fijo y vemos el filtro por fecha de movimientos"; 
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	//fp.home();
	fp.plazoFijo();
	paso = "Plazo fijo";
	Frmwrk.logEvidencia(Config.globalCP, paso);	
	
	UI_Cuentas cu = PageFactory.initElements(Config.driver, UI_Cuentas.class);
	
	cu.cuentaPF();
	paso = "Plazo fijo - Todos los movimientos";
	Frmwrk.logEvidencia(Config.globalCP, paso);	
	
	cu.cuentasFiltro();
	paso = "Plazo fijo - �ltimos movimientos - filtro";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);	
	
	cu.cuentasFiltroSelec7();
	paso = "Plazo fijo - �ltimos movimientos - selecci�n 7mo elemento listado";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasBack();
	paso = "Vuelve a tarjeta de Plazo fijo";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);		
	
	
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
	
	//----------------------------------------------------------	 	
	
	UI_Prestamos t = PageFactory.initElements(Config.driver, UI_Prestamos.class);
	t.pagar();
	
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
