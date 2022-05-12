package casosDePrueba;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Fase2;
import ui.UI_Menu_ArribaAbajo;
import ui.UI_Menu_Izq;
import ui.UI_Prestamos;
import ui.UI_SolCheq;
import ui.UI_Tarjetas;
import ui.UI_Transferir;

public class Fase2 {	
	
	public static void iniciarF2(String usr, String pin, String pwd) throws Exception
	{long startTime=0;
	String paso="";	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Login - Validaciones - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza el login ingresando valores vacios y erroneos de Usuario, PIN y contraseña";
	//----------------------------------------------------------	
	
	Frmwrk.versionOS= Config.driver.getCapabilities().getCapability("platformName") + " - " + Config.driver.getCapabilities().getCapability("platformVersion");
	
	Frmwrk.versionOSNum= (String) Config.driver.getCapabilities().getCapability("platformVersion");
	
	UI_Fase2 fp = PageFactory.initElements(Config.driver, UI_Fase2.class);	
	
	Thread.sleep(10000);
	
	fp.InLoginP1(usr,pin);	
	fp.InLoginP2(pwd);
	
	Thread.sleep(18000);
	paso = "Se muestra pantalla principal";
	Frmwrk.logEvidencia(Config.globalCP, paso);	
			
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}	
	
	public static void validacionesPagoTarjetaTerceroVaciosErroneosCtaBloq() throws Exception
	{long startTime=0;	
	
	try{startTime = System.nanoTime();
		
	Config.globalCP = "Pago Tarjeta a terceros - Validaciones campos vacios, valores erroneos y cuenta bloqueada - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "En el formulario de pago de tarjeta de terceros, se prueban los campos vacios, valores erroneos y cuenta bloqueada";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.tarjetas();		
	
	UI_Tarjetas t = PageFactory.initElements(Config.driver, UI_Tarjetas.class);
	t.irPagoTarjTerc();
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.validacionesPagoTarjetaTerceroVaciosErroneosCtaBloq();
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesPagoTarjetaTerceroCtaSSaldo() throws Exception
	{long startTime=0;	
	
	try{startTime = System.nanoTime();
		
	Config.globalCP = "Pago Tarjeta a terceros - Validaciones cuenta debito sin saldo - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "En el formulario de pago de tarjeta de terceros, seleccionamos diferentes tarjetas y probamos con una cuenta de debito sin saldo";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.tarjetas();		
	
	UI_Tarjetas t = PageFactory.initElements(Config.driver, UI_Tarjetas.class);
	t.irPagoTarjeta();
	t.seleccPagoTarjTerc();
	t.seleccTarj();
	t.seleccPagoTarjTerc();
	
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.validacionesPagoTarjetaTerceroCtaSSaldo();
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesSolCheqVaciosErroneosCtaBloq() throws Exception
	{long startTime=0;
	String paso="";
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Solicitud chequera - Validaciones campos vacios, valores erroneos y cta bloqueada - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "En el formulario de solicitud de chequeras, probamos campos vacios, valores erroneos y cuenta a debitar bloqueada";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.solicChequera();	
	
	paso = "Formulario de solicitud de chequeras";
	Frmwrk.logEvidencia(Config.globalCP, paso);			
	
	UI_Fase2 t = PageFactory.initElements(Config.driver, UI_Fase2.class);
	t.validacionesSolCheqVaciosErroneosCtaBloq();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	//fp2.promoBack();
	//Thread.sleep(2000);
	
	//fp2.ini();
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesPrestamosVaciosErroneos() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Prestamos - Validaciones campos vacios y valores erroneos - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "En el formulario de pago de prestamos, probamos campos vacios y valores erroneos";
	//----------------------------------------------------------	 	
	
	UI_Fase2 t = PageFactory.initElements(Config.driver, UI_Fase2.class);
	t.validacionesPrestamosVaciosErroneos();
	
	Thread.sleep(3000);
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
//	fp2.prestamosBack();
	Thread.sleep(2000);
	fp2.promoBack();
	Thread.sleep(2000);
	fp2.ini();
	Thread.sleep(2000);
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPropiasUYUUYUUYU() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias cuentas propias - Combinaciones UYU UYU UYU - " + Frmwrk.obtenerFecha();
	Config.globalDescrip="Se realiza una transferencia a cuentas propias, de una cuenta debito en UYU a una cuenta credito en UYU un monto en UYU";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	//t.irTransfPropias();
	
	Thread.sleep(3000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	f.combinacionesTransferenciasPropiasUYUUYUUYU();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPropiasUSDUYUUYU() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias cuentas propias - Combinaciones USD UYU UYU - " + Frmwrk.obtenerFecha();
	Config.globalDescrip="Se realiza una transferencia a cuentas propias, de una cuenta debito en USD a una cuenta credito en UYU un monto en UYU";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	//t.irTransfPropias();
	
	Thread.sleep(3000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	f.combinacionesTransferenciasPropiasUSDUYUUYU();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPropiasUSDUYUUSD() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias cuentas propias - Combinaciones USD UYU USD - " + Frmwrk.obtenerFecha();
	Config.globalDescrip="Se realiza una transferencia a cuentas propias, de una cuenta debito en USD a una cuenta credito en UYU un monto en USD";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	//t.irTransfPropias();
	
	Thread.sleep(3000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	f.combinacionesTransferenciasPropiasUSDUYUUSD();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	
	public static void combinacionesTransferenciasPropiasUSDUSDUSD() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias cuentas propias - Combinaciones USD USD USD - " + Frmwrk.obtenerFecha();
	Config.globalDescrip="Se realiza una transferencia a cuentas propias, de una cuenta debito en USD a una cuenta credito en USD un monto en USD";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	//t.irTransfPropias();
	
	Thread.sleep(3000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	f.combinacionesTransferenciasPropiasUSDUSDUSD();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesTransferenciasPropiasVaciosErroneos() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias cuentas propias - Validaciones vacios y erroneos - " + Frmwrk.obtenerFecha();
	Config.globalDescrip="En el formulario de transferencias entre cuentas propias se validan los campos vacios y valores erroneos";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	//t.irTransfPropias();
	
	Thread.sleep(3000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	f.validacionesTransferenciasPropiasVaciosErroneos();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesTransferenciasPropiasCtasBloq() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias cuentas propias - Validaciones cuentas bloqueadas - " + Frmwrk.obtenerFecha();
	Config.globalDescrip= "En el formulario de transferencias a cuentas propias, se valida que no se pueda realizar cuando las cuentas debito o credito estan bloqueadas";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	//t.irTransfPropias();
	
	Thread.sleep(3000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	f.validacionesTransferenciasPropiasCtasBloq();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesTransferenciasPropiasCtaDebSSaldo() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias cuentas propias - Validaciones cuenta sin saldo - " + Frmwrk.obtenerFecha();
	Config.globalDescrip= "En el formulario de transferencias a cuentas propias, se valida que no se pueda realizar cuando la cuenta debito no tiene saldo";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	//t.irTransfPropias();
	
	Thread.sleep(3000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	f.validacionesTransferenciasPropiasCtaDebSSaldo();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	
	public static void validacionesTransferenciasInternasVaciosyPIN() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias Scotia - Validaciones campos vacios y valor errono en PIN - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se valida formulario de transferencia interna: campos vacios y valor errono en PIN";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	Thread.sleep(1000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
		
	Thread.sleep(2000);
	
	t.irTransfScotiaTerc();
	
	Thread.sleep(2000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.validacionesTransferenciasInternasVaciosyPIN();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesTransferenciasInternasBloqRef() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias Scotia - Validaciones cuentas bloqueadas y referencia erronea - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se valida formulario de transferencia interna: cuentas credito y debito bloqueadas. Referencia erronea";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	Thread.sleep(1000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
		
	Thread.sleep(2000);
	
	t.irTransfScotiaTerc();
	
	Thread.sleep(2000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.validacionesTransferenciasInternasBloqRef();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void validacionesTransferenciasInternasDebSSaldoMontoGde() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias Scotia - Validaciones cuenta debito sin saldo y monto muy grande - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se valida formulario de transferencia interna: cuentas debito sin saldo. Monto muy grande";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	Thread.sleep(2000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	
	Thread.sleep(2000);
	
	t.irTransfScotiaTerc();
	Thread.sleep(2000);	
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.validacionesTransferenciasInternasDebSSaldoMontoGde();
	
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasInternasUYUUSDUYU() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias Scotia - Combinaciones UYU USD UYU - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia interna. De una cuenta debito en UYU a una cuenta credito en USD, un monto en UYU";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	Thread.sleep(2000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
		
	Thread.sleep(2000);
	
	t.irTransfScotiaTerc();
	Thread.sleep(2000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.combinacionesTransfScotiaUYUUSDUYU();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	public static void combinacionesTransferenciasInternasUSDUSDUSD() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias Scotia - Combinaciones USD USD USD - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia interna. De una cuenta debito en USD a una cuenta credito en USD, un monto en USD";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	Thread.sleep(2000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	
	Thread.sleep(2000);
	
	t.irTransfScotiaTerc();
	Thread.sleep(2000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.combinacionesTransfScotiaUSDUSDUSD();
	
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	public static void combinacionesTransferenciasInternasUSDUYUUYU() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias Scotia - Combinaciones USD UYU UYU - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia interna. De una cuenta debito en USD a una cuenta credito en UYU, un monto en UYU";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	Thread.sleep(2000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	
	Thread.sleep(2000);
	
	t.irTransfScotiaTerc();
	Thread.sleep(2000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.combinacionesTransfScotiaUSDUYUUYU();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	public static void combinacionesTransferenciasInternasUSDUYUUSD() throws Exception
	{long startTime=0;
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencias Scotia - Combinaciones USD UYU USD - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia interna. De una cuenta debito en USD a una cuenta credito en UYU, un monto en USD";
	//----------------------------------------------------------	 	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	Thread.sleep(2000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	
	Thread.sleep(2000);
	
	t.irTransfScotiaTerc();
	Thread.sleep(2000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	f.combinacionesTransfScotiaUSDUYUUSD();
	
	fp2.ini();

	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPlazaUYUEUR() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - UYU a EUROS - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia a plaza. De una cuenta debito en UYU, un monto en EUROS";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	Thread.sleep(1000);
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(1000);
	t.irTransfPlaza();

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaUYUEUR();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPlazaUYUUSD() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - UYU a USD - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia a plaza. De una cuenta debito en UYU, un monto en USD";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	Thread.sleep(2000);
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(1000);
	t.irTransfPlaza();

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaUYUUSD();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	public static void combinacionesTransferenciasPlazaUSDUSD() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - USD a USD - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia a plaza. De una cuenta debito en USD, un monto en USD";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	Thread.sleep(2000);
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(1000);
	t.irTransfPlaza();

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaUSDUSD();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPlazaUSDEUR() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - USD a EUR - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia a plaza. De una cuenta debito en USD, un monto en EUR";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	
	Thread.sleep(2000);fp.home();Thread.sleep(2000);
	fp.transferir();	
	Thread.sleep(2000);
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(1000);
	t.irTransfPlaza();

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaUSDEUR();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPlazaUSDUYU() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - USD a UYU - " + Frmwrk.obtenerFecha();
	Config.globalDescrip ="Se realiza una Transferencia a plaza. De una cuenta debito en USD, un monto en UYU";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	Thread.sleep(2000);
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(1000);
	t.irTransfPlaza();

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaUSDUYU();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	
	public static void combinacionesTransferenciasPlazaEUREUR() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - Euro a Euro - " + Frmwrk.obtenerFecha();
	
	Config.globalDescrip = "Se realiza una Transferencia Plaza con debito Euro y credito Euro";
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	

	Thread.sleep(2000);	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(2000);
	t.irTransfPlaza();
	Thread.sleep(2000);
	
	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaEUREUR();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPlazaEURUSD() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - Euro a USD - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza una Transferencia Plaza con debito Euro y credito USD";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	

	Thread.sleep(2000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(2000);
	t.irTransfPlaza();
	Thread.sleep(2000);

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaEURUSD();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	public static void combinacionesTransferenciasPlazaEURUYU() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - Euro a UYU - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza una Transferencia Plaza con debito Euro y credito UYU";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	

	Thread.sleep(2000);
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(2000);
	t.irTransfPlaza();
	Thread.sleep(2000);

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.combinacionesTransfPlazaEURUYU();
	
	//t.completarTransfScotia(moneda);
	//t.enviarTransfScotia();
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	
	public static void validacionesTransfPlazaValoresErroneos() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - Validaciones valores erroneos en campos - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realizan validaciones en el formulario Transferencia Plaza. Campos vac�os y valores erroneos";
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	Thread.sleep(2000);
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	t.irTransfScotia();
	Thread.sleep(1000);
	t.irTransfPlaza();

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	Thread.sleep(3000);	
	
	f.validacionesTransfPlazaValoresErroneos();
	
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
	
	public static void validacionesTransferenciasPlazaCtaDebSinSaldo() throws Exception
	{long startTime=0;
	String paso="";
	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Transferencia Plaza - Validacion cuenta debito sin saldo - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza una Transferencia Plaza seleccionando una cuenta debito sin saldo";
	
	//----------------------------------------------------------	 	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	fp.home();
	fp.transferir();	
	
	UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
	Thread.sleep(2000);	
	t.irTransfScotia();
	Thread.sleep(2000);	
	t.irTransfPlaza();

	UI_Fase2 f = PageFactory.initElements(Config.driver, UI_Fase2.class);
	
	
	Thread.sleep(3000);	
	
	f.validacionesTransferenciasPlazaCtaDebSinSaldo();
	
	
	UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
	fp2.ini();
	
/*	if(UI_Transferir.validarPago()==false)
	{Frmwrk.validacion="MAL";
	Frmwrk.logResultadoFailed((System.nanoTime() - startTime), "Fallo en la validaci�n entre datos enviados y los registrados en la base de datos. "
			+ "Revisar los archivos de evidencia (contienen detalles para poder realizar la validaci�n manual)", Config.globalCP);	
	}
	else
	{//Frmwrk.validacion="BIEN"; 
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}*/
	
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}
	
}
