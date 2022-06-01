package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import framework.Reportes;
import ui.UI_Menu_ArribaAbajo;
import ui.UI_Menu_Izq;
import ui.UI_Tarjetas;

public class Tarjetas {
		
	public static String montoPagoPesos="0";
	public static String montoPagoDolares="0";
	
	static Reportes rpt=new Reportes();
	
	public static void completarPago() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Pago Tarjeta propia - Pagar - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza un pago en UYU y USD de tarjeta propia"; 
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.tarjetas();		
	
	UI_Tarjetas t = PageFactory.initElements(Config.driver, UI_Tarjetas.class);
	
	t.irPagoTarjeta();
	t.completarPago();
	t.enviarPago();
	/*if(UI_Tarjetas.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	*/
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void completarPagoTercero() throws Exception
	{long startTime=0;	
	
	try{startTime = System.nanoTime();
		
	Config.globalCP = "Pago Tarjeta a terceros - Pagar - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza un pago de tarjeta de tercero. Se paga la cuota en UYU y USD"; 
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.tarjetas();		
	
//	Thread.sleep(3000);
	UI_Tarjetas t = PageFactory.initElements(Config.driver, UI_Tarjetas.class);
	t.irPagoTarjTerc();
	t.completarPagoTercero();
	Frmwrk.tarj3ro=true;
	t.enviarPago();
	/*if(UI_Tarjetas.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
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
	Config.globalCP = "Pago Tarjeta propia - Enviar plantilla - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	Thread.sleep(3000);	
	fp.tarjetas();		
	Thread.sleep(3000);	
	
	UI_Tarjetas t = PageFactory.initElements(Config.driver, UI_Tarjetas.class);
	//t.irTarjAmex();
	
	t.irPagoTarjeta();
	Thread.sleep(3000);	
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
	Config.globalCP = "Pago Tarjeta propia - Guardar plantilla-borrador - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	Thread.sleep(3000);	
	fp.tarjetas();
	Thread.sleep(3000);	
	
	UI_Tarjetas t = PageFactory.initElements(Config.driver, UI_Tarjetas.class);
	//t.irTarjAmex();
	
	t.irPagoTarjeta();
	Thread.sleep(3000);	
	t.guardarPlantilla();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void detalles() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Tarjeta - A traves de boton menu arriba - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza un pago de tarjeta propia, ingresando por el boton del menu de arriba. Se pagan los totales en UYU y USD"; 
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();	
	
	fp2.tarjetas();
	Frmwrk.logEvidencia(Config.globalCP, "Tarjeta");	
	
	/*
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.tarjetas();*/
	
	UI_Tarjetas t = PageFactory.initElements(Config.driver, UI_Tarjetas.class);
	
	t.irPagoTarjetaXMEnuarriba();
	
	t.enviarPago2();
	
	//Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de Tarjetas con switches activados");	
	///t.guardarPlantilla();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
}
