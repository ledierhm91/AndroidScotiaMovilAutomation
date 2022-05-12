package casosDePrueba;

import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Menu_ArribaAbajo;
import ui.UI_Menu_Izq;
import ui.UI_Transferir;
public class TransferenciaScotia {
		
	public static String ctaDeb="";
	public static String ctaCred="";
	public static String montoTransferencia="0";
	public static String moneda="0";
	
	public static void completar(String moneda) throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Scotia - Completar - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza una transferencia interna de una cuenta UYU a una cuenta " + moneda + " de otro usuario del banco, el monto en " + moneda; 
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	//fp2.ini();
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();Thread.sleep(3000);	
	fp.transferir();	Thread.sleep(3000);	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();Thread.sleep(3000);	
	t.irTransfScotiaTerc();
	
	Thread.sleep(3000);
	
	t.completarTransfScotia(moneda);
	t.enviarTransfScotia();
	
	
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
		*/
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
	Config.globalCP = "Transferencia Scotia - Enviar plantilla - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza una transferencia interna seleccionando una plantilla y enviandola"; 
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	//fp2.ini();
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
//	t.irTransfScotia();
//	t.irTransfScotiaTerc();
	t.enviarPlantillaTransfScotia();
	
//	t.completarTransfScotia(moneda);
	Frmwrk.plantilla=true;
	t.enviarTransfScotia();
	Frmwrk.plantilla=false;	
	
	fp2.ini();
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
		*/
	//----------------------------------------------------------	 
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
	Config.globalCP = "Transferencia Scotia - Guardar plantilla-borrador - " + Frmwrk.obtenerFecha();
	
	//----------------------------------------------------------	 	
	//----------------------------------------------------------	 	
		UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
		fp2.ini();
		
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
		fp.home();
		fp.transferir();	
		
		UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
		t.irTransfScotia();
		t.irTransfScotiaTerc();
		
		Thread.sleep(3000);
		
		t.completarTransfScotia("UYU");
//		t.enviarTransfScotia();
		
		
		fp2.ini();
		
	/*	if(UI_Transferir.validarPago()==false)
		{Frmwrk.validacion="MAL";
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
				+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
		}
		else
		{//Frmwrk.validacion="BIEN"; 
			Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
		}
			*/
		//----------------------------------------------------------	
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}	
	
	public static void completarFirmantes() throws Exception
	{long startTime=0;	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Scotia - Completar con firmante - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se firma una transferencia interna, seleccionandola de la lista de transacciones pendientes"; 
	UI_Menu_ArribaAbajo f = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	f.ini();
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transacciones();		
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.completarTransfFirmante(2);
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
}
