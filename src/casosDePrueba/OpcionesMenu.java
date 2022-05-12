package casosDePrueba;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Comun;
import ui.UI_Cuentas;
import ui.UI_Menu_ArribaAbajo;
import ui.UI_Menu_Izq;

public class OpcionesMenu {	
		
	static UI_Menu_ArribaAbajo ma = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);	
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	
	public static void cuentas() throws Exception
	{long startTime=0;
	String paso="";	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Opciones de Menu - Cuentas - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Consultamos las cuentas a traves del menu de la izquierda. Vemos detalles de la cuenta y filtramos por fechas"; 
	//----------------------------------------------------------		
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);
	UI_Cuentas cu = PageFactory.initElements(Config.driver, UI_Cuentas.class);
	
	c.swipeHLR();
	fp.cuentas();		
	paso = "Cuentas";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);	
	
	cu.cuentasFA1();	
	cu.cuentasFAUltMovWait();
	paso = "Cuenta 1 detalle";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFA1();
	paso = "Cuenta 1 colapsada";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFA2();	
	cu.cuentasFAUltMovWait();
	paso = "Cuenta 2 detalle";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFAUltMov();
	cu.cuentasUltMovWait();
	paso = "Cuenta 2 ultimos movimientos";
	Thread.sleep(5000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFiltro();
	paso = "Cuenta 2 ultimos movimientos - filtro";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFiltroSelec5();
	paso = "Cuenta 2 ultimos movimientos - selecciun 5to elemento listado";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasBack();
	paso = "Vuelve a listado de cuentas";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);	
	
	cu.cuentasFA1();	
	cu.cuentasFAUltMovWait();
	paso = "Cuenta 1 detalle";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFAUltMov();
	cu.cuentasUltMovWait();
	paso = "Cuenta 1 ultimos movimientos";
	Thread.sleep(5000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFiltro();
	paso = "Cuenta 1 ultimos movimientos - filtro";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	
	cu.cuentasFiltroSelec5();
	paso = "Cuenta 1 ultimos movimientos - selecciun 5to elemento listado";
	Thread.sleep(2000);
	Frmwrk.logEvidencia(Config.globalCP, paso);
	cu.cuentasBack();
	
	//----------------------------------------------------------
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
	}
	catch(Exception ex) 		{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}	
	
		public static void transferencias() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Transferencias - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos al formulario de transferencias a traves del menu de la izquierda"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		//c.swipeHLR();
		fp.home();
		fp.transferir();		
		paso = "Transferencias";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}	
		
		public static void tarjetas() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Tarjetas - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos al menu de tarjetas a traves del menu de la izquierda"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		c.swipeHLR();
		fp.tarjetas();		
		paso = "Tarjetas";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void prestamos() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Prestamos - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos al formulario de pago de prestamos a traves del menu de la izquierda"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		fp.home();
		//c.swipeHLR();
		fp.prestamos();		
		paso = "Prestamos";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		
		public static void solicChequera() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Solicitud Chequeras - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos al formulario de solicitud de chequeras a traves del menu de la izquierda"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		//c.swipeHLR();
		fp.home();
		fp.solicChequera();		
		paso = "Solicitud Chequeras";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}	
		
		
		
		
		public static void sucYcajeros() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Sucursales y cajeros - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos a la seccion Sucursales y Cajeros. Validamos que se listen correctamente y que se visualicen en el mapa"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		//c.swipeHLR();
		fp.home();
		fp.sucursalesYcajeros();		
		paso = "Sucursales y cajeros";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.sycBtnOpenMap();
		paso = "Sucursales - Mapa";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		fp.sycBtnback();
		Thread.sleep(2000);
		fp.sycBtnFiltro();
		paso = "Sucursales - Filtro";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.sycBtnFiltroMdeo();
		paso = "Sucursales - Montevideo";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.sycBtnlistaItem3();
		paso = "Sucursales - Montevideo - 3er sucursal de la lista";
		Thread.sleep(4000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		fp.sycBtnback();
		Thread.sleep(2000);
		fp.sycBtnFiltro();Thread.sleep(2000);
		fp.sycBtnFiltroInt();
		paso = "Sucursales - Interior";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.sycBtnlistaItem4();
		paso = "Sucursales - Interior - 4ta sucursal de la lista";
		Thread.sleep(4000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		fp.sycBtnback();
		Thread.sleep(2000);
		fp.sycBtnFiltro();Thread.sleep(2000);
		fp.sycBtnFiltroTodos();
		paso = "Sucursales - Todas";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.sycBtnCaj();
		paso = "Cajeros";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.sycBtnOpenMap();
		paso = "Cajeros - Mapa";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		fp.sycBtnback();
		Thread.sleep(2000);
		fp.sycBtnFiltro();
		paso = "Cajeros - Filtro";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.sycBtnFiltroMdeo();
		paso = "Cajeros - Montevideo";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.sycBtnlistaItem4();
		paso = "Cajeros - Montevideo - 4to cajero de la lista";
		Thread.sleep(4000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		fp.sycBtnback();
		Thread.sleep(2000);
		fp.sycBtnFiltro();Thread.sleep(2000);
		fp.sycBtnFiltroInt();
		paso = "Cajeros - Interior";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.sycBtnlistaItem3();
		paso = "Cajeros - Interior - 3er cajero de la lista";
		Thread.sleep(4000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		fp.sycBtnback();
		Thread.sleep(2000);
		fp.sycBtnFiltro();Thread.sleep(2000);
		fp.sycBtnFiltroTodos();
		paso = "Cajeros - Todos";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		
		public static void mensajes() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Mensajes - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos a la seccion Mensajes. Verificamos que se listen los mensajes, respondemos los mensajes, enviamos mensajes nuevos y probamos los filtros"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		//c.swipeHLR();
		fp.home();
		fp.mensajes();		
		paso = "Mensajes";
		Thread.sleep(20000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		//Config.driver.wait(15);
		
		fp.mensajesSelec1();		
		paso = "Detalle primer mensaje de la lista";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.mensajesSelec1Reply();		
		paso = "Responder primer mensaje de la lista";
		Thread.sleep(30000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.mensajesSelec1ReplyandSend();		
		paso = "Responder primer mensaje de la lista y enviar";
		Thread.sleep(30000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.mensajesSelec1Replyback();		
		paso = "Volvemos al listado";
		Thread.sleep(30000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.mensajesTipos();		
		paso = "Vemos filtro de tipo de mensajes";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.mensajesTiposEnv();		
		paso = "Se listan los mensajes enviados";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.mensajesTipos();		
		paso = "Volvemos a ver el filtro de tipo de mensajes";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.mensajesTiposRec();		
		paso = "Se listan los mensajes recibidos";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		fp.mensajeNuevo();		
		paso = "Vamos a enviar un mensaje nuevo";
		Thread.sleep(30000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void pendientes() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Transacciones - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos al listado de transacciones Pendientes"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		fp.home();
		//c.swipeHLR();
		fp.transacciones();		
		paso = "Transacciones";
		Thread.sleep(20000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.transaccionesCombo();		
		paso = "Combo estados de Transacciones";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);			
		
		fp.transaccionesFiltrar();		
		paso = "Estados de Transacciones";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);			
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void configuracion() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Configuracion - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos al formulario de activacion de huellas. Activamos y desactivamos el switch"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
		//c.swipeHLR();
		fp.home();
		fp.configuracion();		
		paso = "Configuracion";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		fp.configuracionVerificar();		
		paso = "Verificamos si funciona el switch de Configuracion";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Hcuentas() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Cuentas - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Consultamos las cuentas a traves del boton de arriba. Vemos detalles de la cuenta y filtramos por fechas"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		UI_Cuentas cu = PageFactory.initElements(Config.driver, UI_Cuentas.class);
		
		//Thread.sleep(1000);
		//c.swipeHLR();
		Thread.sleep(1000);
		fp.inicio();
		
		ma.cuentas();
		paso = "Cuentas";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		paso = "Cuenta 1";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		c.swipeHRLcorto();		
		paso = "Cuenta 2";
		Thread.sleep(10000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		c.swipeHRLcorto();		
		paso = "Cuenta 3";
		Thread.sleep(10000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		c.swipeHLRcorto();
		Thread.sleep(1000);
		c.swipeHLRcorto();
		
		cu.cuentasCuadro();
		paso = "Cuenta ultimos movimientos";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		cu.cuentasFiltro();
		paso = "Cuenta ultimos movimientos - filtro";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		cu.cuentasFiltroSelec5();
		paso = "Cuenta ultimos movimientos - selecciun 5to elemento listado";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		cu.cuentasBack();
		paso = "Vuelve a listado de cuentas";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);			
		
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Htarjetas() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Tarjetas - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos a la seccion Tarjetas a traves del boton de arriba"; 
		//---------------------------------------------------------		
		
		ma.tarjetas();		
		paso = "Tarjetas";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);		
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Hubicacion() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Ubicacion - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos a la seccion Ubicacion"; 
		//---------------------------------------------------------		
		
		ma.ubicacion();		
		paso = "Ubicacion";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Hprestamos() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Prestamos - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos a la seccion Prestamos a traves del boton de arriba"; 
		//---------------------------------------------------------		
		
		ma.prestamos();		
		paso = "Prestamos";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Hcotizaciones() throws Exception
		{long startTime=0;
		String paso="";	
		Config.globalDescrip = "Ingresamos a la seccion Cotizaciones. Vemos los valores de las monedas."
				+ "Realizamos compra y venta de USD ingresando al formulario de transferencias a traves del boton disponible en cotizaciones"; 
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Cotizaciones - " + Frmwrk.obtenerFecha();
		
		//---------------------------------------------------------		
		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		ma.cotizaciones();		
		paso = "Cotizaciones";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		c.swipeV();
		c.swipeV();
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		c.swipeV();
		c.swipeV();
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		ma.cotizacionesCompra();		
		paso = "Cotizaciones Compra";
		Thread.sleep(5000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		ma.cotizacionesVenta();		
		paso = "Cotizaciones Venta";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}

		public static void Hinicio() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Inicio - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Presionamos el boton Inicio"; 
		//---------------------------------------------------------		
		
		ma.ini();
		paso = "Inicio";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Hcontactos() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Contactos - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos a la seccion Contactos y probamos las diferentes opciones disponibles"; 
		//---------------------------------------------------------		
		
		ma.contactos();		
		paso = "Contactos";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Hpromos() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Promociones - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos a la seccion Promociones y vemos los filtros y visualizacion del mapa"; 
		//--------------------------------------------------
		//ma.ini();
		ma.promociones();		
		paso = "Promociones";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoFiltro();
		Thread.sleep(1000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoOPJoyeria();
		paso = "Promociones - Opcion 1";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoFiltro();
		Thread.sleep(1000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoOPCines();
		paso = "Promociones - Opcion 2";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoFiltro();
		Thread.sleep(1000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoOPTodoparabebes();
		paso = "Promociones - Opcion 3";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoFiltro();
		Thread.sleep(1000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		ma.promoOPTodos();
		paso = "Promociones - Todos";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);
		
		ma.promo1();
		paso = "Promocion 1";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		/*ma.promoLlamarSuc();
		paso = "Llamar sucursal";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	*/
		
		ma.promoBack();
		Thread.sleep(2000);
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}

		public static void Htransferencias() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Transferencias - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Ingresamos al formulario de transferencias a traves del boton de abajo"; 
		//---------------------------------------------------------		
		//Thread.sleep(1000);
		Thread.sleep(5000);
		ma.transferir();		
		paso = "Transferencias";
		Thread.sleep(4000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void Hscotiapagos() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu horizontal - Scotiapagos - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Verificamos el redireccionamiento a la app Scotiapagos"; 
		//---------------------------------------------------------		
		
		ma.scotiapagos();		
		paso = "ScotiaPagos";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}
		
		public static void seleccionPerfil() throws Exception
		{long startTime=0;
		String paso="";	
		
		try{startTime = System.nanoTime();
		Config.globalCP = "Opciones de Menu - Seleccion de perfil - " + Frmwrk.obtenerFecha();
		Config.globalDescrip = "Seleccionamos un ambiente y esperamos a que carguen todos sus datos"; 
		//----------------------------------------------------------		
		UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		UI_Menu_Izq fp = PageFactory.initElements(Config.driver, UI_Menu_Izq.class);	
		
	//	c.swipeHLR();
		fp.seleccionPerfil();		
		paso = "Seleccion de perfil";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Thread.sleep(2000);
		
	/*	c.swipeVPerfilUP();	
		// System.out.println("ejecutu un swipe");	
		c.swipeVPerfilUP();	
	//	System.out.println("ejecutu un swipe");
		c.swipeVPerfilUP();	
	//	System.out.println("ejecutu un swipe");
		c.swipeVPerfilUP();	
	//	System.out.println("ejecutu un swipe");
		c.swipeVPerfilUP();	
	//	System.out.println("ejecutu un swipe");
		c.swipeVPerfilUP();	
	//	System.out.println("ejecutu un swipe");
		*/
		paso = "Seleccionamos otro ambiente";
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		fp.seleccionAmbiente();	
		
		Thread.sleep(15000);
		
		paso = "Cargo el ambiente";
		Frmwrk.logEvidencia(Config.globalCP, paso);	
		
		Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);	
		}
		catch(Exception ex) 		{	
			Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
		}
		}	
		
		
		
}
