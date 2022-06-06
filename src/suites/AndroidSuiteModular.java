/*
 * Classname: Suite  Modular
 * Version information: 1.0
 * Date: 14 de septiembre 2018
 * Copyright notice
 * 
 * modTranferInterna
 * modTranferPlaza
 */


package suites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import casosDePrueba.Fase2;
import casosDePrueba.Login;
import casosDePrueba.Logout;
import casosDePrueba.OpcionesMenu;
import casosDePrueba.PlazoFijo;
import casosDePrueba.Tarjetas;
import casosDePrueba.Prestamos;
import casosDePrueba.SolicitudChequera;
import casosDePrueba.Transacciones;
import casosDePrueba.TransferenciaPlaza;
import casosDePrueba.TransferenciaScotia;
import datosDePruebas.DP_Login;
import io.appium.java_client.MobileElement;
/*
import datosDePruebas.DP_Colegios;
import datosDePruebas.DP_Gastos;
import datosDePruebas.DP_Prestamos;
import datosDePruebas.DP_Proveedores;
import datosDePruebas.DP_SolicitudChequera;
import datosDePruebas.DP_Sueldos;
import datosDePruebas.DP_Tarjetas;
import datosDePruebas.DP_TranfExterior;
import datosDePruebas.DP_TranfInterna;
import datosDePruebas.DP_TranfLote;
import datosDePruebas.DP_TranfPlaza;
import _configuraciones.DatosDePrueba;*/
import ui.UI_Login;

public class AndroidSuiteModular{	
	Config stgs = new Config();			
	
	public void modInicio () throws Exception
	{
//	Config.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	long startTime=0;	
	try{startTime = System.nanoTime();
	
/*	Config.esperar("btnNegative");
	MobileElement ini = (MobileElement) Config.driver.findElement(By.id("btnNegative"));	
    ini.click();	
	*/
	
	///----------------Splash screen-------------------------
	Config.globalCP = "Splash - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Imprimimos la pantalla de splash para verificar si se muestra correctamente"; 
	Frmwrk.logEvidenciaX3(Config.globalCP, "Splash");
	//-------------------------------------------------------
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
//	Thread.sleep(3000);
	//------------------Tutorial-----------------------------  
	UI_Login L = PageFactory.initElements(Config.driver, UI_Login.class);		    
    Config.globalCP = "Tutorial - " + Frmwrk.obtenerFecha();
    Config.globalDescrip = "Recorremos el tutorial para verificar las diferentes pantallas"; 
    L.tutorial();	
    //-------------------------------------------------------- 
    Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}   	
}
	
	
	 	public void modLogOut () throws Exception
		{Logout.salir();}
	 		 	
		public void modLogIn (String Origen, Integer juegoDatos) throws Exception
		{
//		 Config.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 DP_Login datos = new DP_Login();
		 datos.obtenerDatos(Origen, juegoDatos);
		 Login.iniciar(datos.usuario, datos.pin, datos.password);	
		// Frmwrk.logBD(Config.globalCP, datos.todos, "--");
		 }		
	
	 public void modTransferInterna (String moneda) throws Exception
		{	
		  TransferenciaScotia.completar(moneda);	
		 // TransferenciaScotia.enviarPlantilla();	
		 // TransferenciaScotia.guardarPlantilla(); 	 
		  }	
	 
	 public void modTransferExtras() throws Exception
		{	
		
		  TransferenciaScotia.enviarPlantilla();
		  TransferenciaPlaza.enviarPlantilla();	
		  
		  //TransferenciaScotia.guardarPlantilla();
		  
		  
		  }	
	
	 public void modTransferPlaza() throws Exception
		{	
		 TransferenciaPlaza.completar();	
		 }
	  
	 public void modTransferFirmas (Integer opcion)  throws Exception
		{if (opcion==1)
		 { 	TransferenciaPlaza.completarFirmantes();
			 TransferenciaScotia.completarFirmantes();	
		  	}
		 else
		 {	TransferenciaScotia.completar("UYU");
		 	TransferenciaPlaza.completar();
		}}	
		 
	 public void modSolChequera() throws Exception
		{	
		 SolicitudChequera.completar();
		// SolicitudChequera.enviarPlantilla();	
		// SolicitudChequera.guardarPlantilla(); 
		}
	 
	 public void modPagoTarjeta() throws Exception
		{
	 	 Tarjetas.completarPago();
	 	 
	 	 Tarjetas.detalles();
		/* Tarjetas.enviarPlantilla();	
		 Tarjetas.guardarPlantilla(); 
		 
		 Tarjetas.completarPagoTercero();*/
		 } 
	 public void modPagoTarjetaTercero() throws Exception
		{
		 //Config.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	 Tarjetas.completarPagoTercero();	
	 	// Tarjetas.detalles();
		/* Tarjetas.enviarPlantilla();	
		 Tarjetas.guardarPlantilla(); 
		 
		 Tarjetas.completarPagoTercero();*/
		 } 
	 
	
	 public void modTransacciones() throws Exception
		{			 		
		Transacciones.pendientes();
		}
	
	 public void modPrestamos() throws Exception
		{			 		
		Prestamos.ingresar();
		Prestamos.pagar();
		//Prestamos.enviarPlantilla();	
		//Prestamos.guardarPlantilla(); 
		}
	 
	 public void modOpcionesMenu() throws Exception
		{	
		/* OpcionesMenu.mensajes();
		 OpcionesMenu.sucYcajeros();
		 
		 
	     OpcionesMenu.seleccionPerfil();
	     OpcionesMenu.cuentas();
		 OpcionesMenu.transferencias();
		 OpcionesMenu.tarjetas();
		 OpcionesMenu.prestamos();
		 OpcionesMenu.solicChequera();
		
		 OpcionesMenu.pendientes();
		 OpcionesMenu.configuracion();*/
		 OpcionesMenu.Hcuentas();
		 OpcionesMenu.Htarjetas();
		 OpcionesMenu.Hubicacion();
		 OpcionesMenu.Hprestamos();
		 //OpcionesMenu.Hcotizaciones();
	     OpcionesMenu.Hinicio();
		 OpcionesMenu.Hcontactos();
		 OpcionesMenu.Hpromos();
		 OpcionesMenu.Htransferencias();
		 OpcionesMenu.Hscotiapagos();
		}
	 
	 public void modPlazoFijo() throws Exception
		{			 		
		PlazoFijo.consultar();
		}
	 
	 
	 public void modFase2() throws Exception
		{
		 String Origen="D";
		 Integer juegoDatos=1;
		 
		 DP_Login datos = new DP_Login();
		
		//----------------------------------------------------------
		 datos.obtenerDatos(Origen, juegoDatos);
		Fase2.iniciarF2(datos.usuario, datos.pin, datos.password);	
		// Login.iniciar(datos.usuario, datos.pin, datos.password);	
		 
	    Fase2.validacionesPagoTarjetaTerceroVaciosErroneosCtaBloq(); /////bieeeeen
	 	 
	     Fase2.validacionesSolCheqVaciosErroneosCtaBloq();	/////bieeeeen
	 
		 Fase2.combinacionesTransferenciasPropiasUYUUYUUYU();
	     Fase2.combinacionesTransferenciasPropiasUSDUYUUSD();
	 	 Fase2.combinacionesTransferenciasPropiasUSDUYUUYU();
	// 	 Fase2.validacionesTransferenciasPropiasVaciosErroneos();
//	 	 Fase2.validacionesTransferenciasPropiasCtasBloq(); /////bieeeeen
	 	 
//	 	 Fase2.validacionesTransferenciasInternasVaciosyPIN(); /////mal
//	 	 Fase2.validacionesTransferenciasInternasBloqRef();    /////mal
		
		 Fase2.combinacionesTransferenciasInternasUYUUSDUYU();
		 Fase2.combinacionesTransferenciasInternasUSDUSDUSD();
		 Fase2.combinacionesTransferenciasInternasUSDUYUUYU();
		 Fase2.combinacionesTransferenciasInternasUSDUYUUSD();
		 
	 	 Fase2.combinacionesTransferenciasPlazaUYUEUR();
	 	 Fase2.combinacionesTransferenciasPlazaUYUUSD();
	 	 Fase2.combinacionesTransferenciasPlazaUSDUSD();
	 	 Fase2.combinacionesTransferenciasPlazaUSDUYU();
	 	 Fase2.combinacionesTransferenciasPlazaUSDEUR();
	 	 Fase2.validacionesTransfPlazaValoresErroneos(); 
	 	
	 	 modLogOut(); 
	 	//----------------------------------------------------------
	 	 

		 Origen="D";
		 juegoDatos=8; /// Cuenta sin saldo
		 
		 datos.obtenerDatos(Origen, juegoDatos);
		 Login.iniciar(datos.usuario, datos.pin, datos.password);	
		 Thread.sleep(5000);
		 
		 Fase2.combinacionesTransferenciasPropiasUSDUSDUSD();
		 Fase2.validacionesTransferenciasPropiasCtaDebSSaldo();
	    
		 Fase2.validacionesTransferenciasInternasDebSSaldoMontoGde(); 

		 Fase2.validacionesPagoTarjetaTerceroCtaSSaldo(); //de tarjeta
	     
	 	 Fase2.validacionesTransferenciasPlazaCtaDebSinSaldo(); 
		
		 modLogOut();  
		//----------------------------------------------------------
/*		 Origen="D"; ////////////////No ejecutar por falta de prestamos
		 juegoDatos=5;
		 
		 datos.obtenerDatos(Origen, juegoDatos);
		 Login.iniciar(datos.usuario, datos.pin, datos.password);	
		 
		 Prestamos.ingresar();
		 Fase2.validacionesPrestamosVaciosErroneos();		 
		 
		 modLogOut();*/
		//----------------------------------------------------------
		 Origen="D";
		 juegoDatos=9;
		 
		 datos.obtenerDatos(Origen, juegoDatos);
		 Login.iniciar(datos.usuario, datos.pin, datos.password);	
		 
		 Fase2.combinacionesTransferenciasPlazaEUREUR();
		 Fase2.combinacionesTransferenciasPlazaEURUSD();
		 Fase2.combinacionesTransferenciasPlazaEURUYU();		 
		 
		 modLogOut(); 
		//----------------------------------------------------------
		 
		 } 
	 
	 
	 
}