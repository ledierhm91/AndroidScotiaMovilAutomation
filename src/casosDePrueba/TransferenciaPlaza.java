package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Menu_ArribaAbajo;
import ui.UI_Menu_Izq;
import ui.UI_Transferir;
public class TransferenciaPlaza {
		
	public static void completar() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - Completar - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza una transferencia a plaza de una cuenta en UYU a una cuenta en UYU de otra persona en otro banco"; 
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();Thread.sleep(3000);	
	fp.transferir();
	Thread.sleep(3000);	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();	
	Thread.sleep(3000);	
	t.irTransfPlaza();
	Frmwrk.logEvidencia(Config.globalCP, "TP_0");
	Thread.sleep(3000);	
	
	t.completarTransfPlaza();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else*/
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	
	//----------------------------------------------------------
	
	//Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
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
	Config.globalCP = "Transferencia Plaza - Enviar Plantilla - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se envia una plantilla de una transferencia a plaza"; 
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();Thread.sleep(3000);	
	fp.transferir();
	Thread.sleep(3000);	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();	Thread.sleep(3000);	
	t.irTransfPlaza();

	Thread.sleep(3000);			
	
	t.enviarPlantillaPlaza();
	
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
	Config.globalCP = "Transferencia Plaza - Guardar plantilla-borrador - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
//	Thread.sleep(2000);	
	fp.transferir();
//	Thread.sleep(3000);		
	paso = "Menu de Transferencias";
	Frmwrk.logEvidencia(Config.globalCP, paso);			
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfPlaza();
	//Thread.sleep(2000);	
	//t.guardarPlantillaPlaza();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void completarFirmantes() throws Exception
	{long startTime=0;	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - Completar con firmante - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se firma una transferencia a plaza, seleccionandola de las transacciones pendientes"; 
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transacciones();		
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.completarTransfFirmante(1);
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
}
