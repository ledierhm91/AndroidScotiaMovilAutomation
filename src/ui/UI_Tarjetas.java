package ui;

import java.sql.ResultSet;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.Config;
import framework.Frmwrk;
import casosDePrueba.Tarjetas;
import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.WaitOptions;
import java.util.concurrent.TimeUnit;

public class UI_Tarjetas {
		 
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);

//	Config.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//  WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(120));
	
	public void irTarjAmex() throws Exception
	{Config.esperar("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]");
	
	 MobileElement tarjAmex = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]"));
	 tarjAmex.click();		 
	 }	
	
	
	public void irPagoTarjeta() throws Exception
	{
	Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup");
	Thread.sleep(5000);
	MobileElement tarj = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup"));
	tarj.click();	
		
	Frmwrk.logEvidencia(Config.globalCP, "Detalle Tarjeta");
	
	Thread.sleep(2000);
	MobileElement pagoTarj = (MobileElement) Config.driver.findElement(By.id("btnPayCreditCard"));
	pagoTarj.click();	
	
	
	 }	
	
	public void irPagoTarjetaXMEnuarriba() throws Exception
	{
		Config.esperar("btnPayCreditCard");
	
		MobileElement pagoTarj;
	
/*	 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
	 {
	 pagoTarj = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewSwitcher/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button"));
	 }
	 else
	 {	
	 pagoTarj = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewSwitcher/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
	 }*/
		c.swipeV();c.swipeV();
		
	 pagoTarj = (MobileElement)  Config.driver.findElement(By.id("btnPayCreditCard"));
	 pagoTarj.click();		
	
	 Config.esperar("switchPayUYU");
	
	 MobileElement btnpesos = (MobileElement) Config.driver.findElement(By.id("switchPayUYU"));
	 btnpesos.click();	 

	 MobileElement btnpesosTot = (MobileElement) Config.driver.findElement(By.id("switchPayUYUTotal"));
	 btnpesosTot.click();	
	 
	 MobileElement btnusd = (MobileElement) Config.driver.findElement(By.id("switchPayUSD"));
	 btnusd.click();
	 
	 MobileElement btnusdTot = (MobileElement) Config.driver.findElement(By.id("switchPayUSDTotal"));
	 btnusdTot.click();	
	
	 Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de tarjeta con todos los pagos totales");
	 
	 c.swipeV();
	 
	// MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
	// btn_pagar.click(); 
	 
	 }	
	
	
	 public void irPagoTarjTerc() throws Exception
		{	
		// Config.esperar("btnPayThirdCard");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Bot�n pago tarjeta a terceros");
		 Thread.sleep(7000); //aumente de 2000 a 7000
		 MobileElement pagoTarjTerc = (MobileElement) Config.driver.findElement(By.id("btnPayThirdCard"));
		 pagoTarjTerc.click();		 
		 }	 	 
	 
	 public void seleccPagoTarjTerc() throws Exception
		{	
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner/android.widget.TextView");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Combo tarjetas");
		 MobileElement pagoTarjTerc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner/android.widget.TextView"));
		 pagoTarjTerc.click();	
		 
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");
		
		 MobileElement ctapesosSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
		 ctapesosSel.click();
		 
		 }	
	 
	 public void seleccTarj() throws Exception
		{	
		 Frmwrk.logEvidencia(Config.globalCP, "Combo tarjetas");
		 MobileElement pagoTarjTerc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner/android.widget.TextView"));
		 pagoTarjTerc.click();	
		 
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement ctapesosSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 ctapesosSel.click();
		 
		 }	
	
	 public void completarPago() throws Exception
		{	
		 Config.esperar("switchPayUYU");
		 c.swipeV(); c.swipeV();
		 Thread.sleep(2000); 
		 Config.esperar("btnPay");
		 
		 Thread.sleep(2000); 
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		// c.clickOK();
		 Thread.sleep(2000); 
		 
		 Config.esperar("btnPositive");
		 Frmwrk.logEvidencia(Config.globalCP, "Mensaje");
		 
		 MobileElement btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 
		 MobileElement btnpesos = (MobileElement) Config.driver.findElement(By.id("switchPayUYU"));
		 btnpesos.click();	 
		 
		 MobileElement importeUYU = (MobileElement) Config.driver.findElement(By.id("etUYUAmountToPay"));
		 importeUYU.click();   
		 importeUYU.setValue(Config.getRandomNumber(20, 30));
		 Tarjetas.montoPagoPesos=importeUYU.getText();
		 
		 MobileElement btnusd = (MobileElement) Config.driver.findElement(By.id("switchPayUSD"));
		 btnusd.click();	
		 
		 MobileElement importeUSD = (MobileElement) Config.driver.findElement(By.id("etUSDAmountToPay"));
		 importeUSD.click();   
		 importeUSD.setValue(Config.getRandomNumber(35, 45));	
		 Tarjetas.montoPagoDolares=importeUSD.getText();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario a enviar");
		 
		 }	 	 
	 
	 public void enviarPago() throws Exception
		{		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click();  
		 
		 Config.esperar("etPin");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar pago?");
		 
		 
		 MobileElement confirmar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 confirmar.click();  
		 
		 Thread.sleep(15000);
		// Frmwrk.logEvidencia(Config.globalCP, "Ticket");
		 
		 c.clickOK();
		 
		 Thread.sleep(5000); 
		 
		 if(Frmwrk.tarj3ro==false)
		 { MobileElement volver = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
		 volver.click();
		 }
		 Frmwrk.tarj3ro=false;
		 Thread.sleep(2000); 
		 
		 UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
		 fp2.ini();
		 
		 Thread.sleep(2000);
	//	 MobileElement atras = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
	//	 atras.click();
		 
		 
		 
	/*	 Config.esperar("btn_cancel");
		 
		 MobileElement btn_cancel = (MobileElement) Config.driver.findElement(By.id("btn_cancel"));
		 btn_cancel.click(); 
		 
		 btn_pagar.click(); */
		 
	/*	 Config.esperar("btn_accept");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar pago?");		 
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 btn_confirmar.click(); */
		 
		///codigo para cuando SI funciona el pago de tarjetas
		//------------------------------------------------------------------
		// Config.esperar("txt_creation_date"); ///espero por boton cerrar del ticket
		// Frmwrk.logEvidencia(Config.globalCP, "Ticket");	
		//------------------------------------------------------------------
		 
		 ///codigo modificado para cuando no funciona el pago de tarjetas		 
		 //------------------------------------------------------------------	
/*		 Config.esperar("home");
		 MobileElement home = (MobileElement) Config.driver.findElement(By.id("home"));
		 home.click();
		 
		 Config.esperar("btn_accept"); 
		 btn_confirmar.click(); 
		 
		 Config.esperar("home"); //clickeo en el boton home
		 home.click();
		//------------------------------------------------------------------*/
		}	
	 
	 public void enviarPago2() throws Exception
		{		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click();  
		 
		 Config.esperar("etPin");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar pago?");
		 
		 btn_pagar.click();  
		 
		 c.clickOK();
		 
		 Thread.sleep(2000); 
		 
		 UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
		 fp2.ini();
		 
		 Thread.sleep(2000);

		}	
	 
	 
	 public static boolean validarPago() throws Exception
		{
		 Boolean OK1=false;
		 Boolean OK2=false;
		//-------------------------------------------------------------------------------------------------------
		 if (Double.valueOf(Tarjetas.montoPagoPesos) >0)			 
		 { String query1 = "SELECT max(asiento) as ASIENTO  FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal = 82\r\n" + 
		 		"AND mc.operacion  = 9931\r\n" + 
		 		"AND mc.producto  IN (2101,2201)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.moneda=0 AND mc.debitocredito = 'D'\r\n" + 
		 		"AND mc.operacion_cuenta ='0' \r\n" + 
		 		"AND mc.cliente ='2685272'\r\n" + 
		 		"AND mc.capitalrealizado = '" + Tarjetas.montoPagoPesos + "'\r\n" + 
		 		"AND mc.asiento   IN\r\n" + 
		 		"  (SELECT asiento\r\n" + 
		 		"  FROM banking.asientos asi\r\n" + 
		 		"  WHERE asi.operacion  IN (9931)\r\n" + 
		 		"  AND asi.estado        = 77\r\n" + 
		 		"  AND asi.iniusr        = 'S82'\r\n" + 
		 		"  AND asi.fechaproceso >= sysdate -1\r\n" + 
		 		"  )";
		 
		// System.out.println(query1);
		 ResultSet datosDB1 = Frmwrk.consultarBD(query1);
		 String Asiento1="";
		 while (datosDB1.next()) {{Asiento1 = datosDB1.getString("ASIENTO");}}				 
		 datosDB1.close();
		// System.out.println("1 -"+ Asiento1);
		 
		 String query2 = "SELECT max(asiento) as ASIENTO FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal    = 82\r\n" + 
		 		"AND mc.operacion     = 9931\r\n" + 
		 		"AND mc.producto   IN (4160,4260,4360)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.moneda=0 AND mc.debitocredito = 'C'\r\n" + 
		 		"AND mc.operacion_cuenta       ='6259246'\r\n" + 
		 		"AND capitalrealizado = '" + Tarjetas.montoPagoPesos + "'\r\n" + 
		 		"AND mc.asiento      IN\r\n" + 
		 		"  (SELECT asiento\r\n" + 
		 		"  FROM banking.asientos asi\r\n" + 
		 		"  WHERE asi.operacion  IN (9931)\r\n" + 
		 		"  AND asi.estado        = 77\r\n" + 
		 		"  AND asi.iniusr        = 'S82'\r\n" + 
		 		"  AND asi.fechaproceso >= sysdate -1\r\n" + 
		 		"  )";		 
		 
		 ResultSet datosDB2 = Frmwrk.consultarBD(query2);		 	
		 //System.out.println(query2);
		 String Asiento2="";
		 while (datosDB2.next()) {{Asiento2 = datosDB2.getString("ASIENTO");}}				 
		 datosDB2.close();
		 //System.out.println("2 -"+ Asiento2);
		 //Asiento2="1";
		 
		 if (Asiento1.equals(Asiento2))
		 {Frmwrk.validacion="BIEN";
			 Frmwrk.logEvidencia(Config.globalCP, "Se valid� el pago en pesos en la base de datos. Asiento: " 
		 + Asiento1 + " Cuenta Tarjeta: 6259246 Cliente: 2685272 Monto: " + Tarjetas.montoPagoPesos);
		 OK1=true;
		 }
		 else
		 {Frmwrk.validacion="MAL";
			 Frmwrk.logEvidencia(Config.globalCP, "Por alguna raz�n no se pudo validar el pago con el importe $" + Tarjetas.montoPagoPesos 
		 + ". Por favor validar manualmente. Asientos: Debito: "+ Asiento1 + " - Credito: " + Asiento2 );	
		 OK1=false;}
		 }
		 //-------------------------------------------------------------------------------------------------------
		 if (Double.valueOf(Tarjetas.montoPagoDolares) >0)			 
		 { String query3 = "SELECT max(asiento) as ASIENTO  FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal = 82\r\n" + 
		 		"AND mc.operacion  = 9931\r\n" + 
		 		"AND mc.producto  IN (2101,2201)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.moneda=2225 AND mc.debitocredito = 'D'\r\n" + 
		 		"AND mc.operacion_cuenta ='0' \r\n" + 
		 		"AND mc.cliente ='2685272'\r\n" + 
		 		"AND mc.capitalrealizado = '" + Tarjetas.montoPagoDolares + "'\r\n" + 
		 		"AND mc.asiento   IN\r\n" + 
		 		"  (SELECT asiento\r\n" + 
		 		"  FROM banking.asientos asi\r\n" + 
		 		"  WHERE asi.operacion  IN (9931)\r\n" + 
		 		"  AND asi.estado        = 77\r\n" + 
		 		"  AND asi.iniusr        = 'S82'\r\n" + 
		 		"  AND asi.fechaproceso >= sysdate -1\r\n" + 
		 		"  )";
		 
		 ResultSet datosDB3 = Frmwrk.consultarBD(query3);
		 String Asiento3="";
		 while (datosDB3.next()) {{Asiento3 = datosDB3.getString("ASIENTO");}}				 
		 datosDB3.close();
		 
		 String query4 = "SELECT max(asiento) as ASIENTO FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal    = 82\r\n" + 
		 		"AND mc.operacion     = 9931\r\n" + 
		 		"AND mc.producto   IN (4160,4260,4360)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.moneda=2225 AND mc.debitocredito = 'C'\r\n" + 
		 		"AND mc.operacion_cuenta       ='6259246'\r\n" + 
		 		"AND capitalrealizado = '" + Tarjetas.montoPagoDolares + "'\r\n" + 
		 		"AND mc.asiento      IN\r\n" + 
		 		"  (SELECT asiento\r\n" + 
		 		"  FROM banking.asientos asi\r\n" + 
		 		"  WHERE asi.operacion  IN (9931)\r\n" + 
		 		"  AND asi.estado        = 77\r\n" + 
		 		"  AND asi.iniusr        = 'S82'\r\n" + 
		 		"  AND asi.fechaproceso >= sysdate -1\r\n" + 
		 		"  )";		 
		 
		 ResultSet datosDB4 = Frmwrk.consultarBD(query4);
		 String Asiento4="";
		 while (datosDB4.next()) {{Asiento4 = datosDB4.getString("ASIENTO");}}				 
		 datosDB4.close();
		 //Asiento4="1";
		 
		 if (Asiento3.equals(Asiento4))
		 {Frmwrk.validacion="BIEN";
			 Frmwrk.logEvidencia(Config.globalCP, "Se valid� el pago en d�lares en la base de datos. Asiento: " 
		 + Asiento4 + " Cuenta Tarjeta: 6259246 Cliente: 2685272 Monto: " + Tarjetas.montoPagoDolares);	
		 OK2=true;}
		 else
		 {Frmwrk.validacion="MAL";
		 Frmwrk.logEvidencia(Config.globalCP, "Por alguna raz�n no se pudo validar el pago con el importe USD" + Tarjetas.montoPagoDolares 
		 + ". Por favor validar manualmente. Asientos: Debito: "+ Asiento3 + " - Credito: " + Asiento4 );	
		 OK2=false;}
		 }
		 
		//-------------------------------------------------------------------------------------------------------
		 
		 if ((OK1 == true) && (OK2 == true))
		 {return true; }
		 else
		 {return false;}
		 }
	 
	 
	 public void completarPagoTercero() throws Exception
		{	
	/*	 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner/android.widget.TextView");
		 MobileElement cbo_tarj = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner/android.widget.TextView"));
		 cbo_tarj.click(); 
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 MobileElement sel_tarj = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 sel_tarj.click(); */
		 Thread.sleep(4000);
		 c.swipeV();
		 Thread.sleep(2000); 
		 Config.esperar("btnPay");
		 
		 Thread.sleep(2000); 
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		// c.clickOK();
		 Thread.sleep(2000); 
		 
		 Config.esperar("btnPositive");
		 Frmwrk.logEvidencia(Config.globalCP, "Mensaje");
		 
		 MobileElement btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 MobileElement btntj = (MobileElement) Config.driver.findElement(By.id("etCreditCardNumber"));
		 btntj.click(); 
		 btntj.sendKeys("43079973");
		 
		 MobileElement btnmes = (MobileElement) Config.driver.findElement(By.id("etMonthDue"));
		 btnmes.click(); 
		 btnmes.sendKeys("1");
		 
		 MobileElement btnanio = (MobileElement) Config.driver.findElement(By.id("etYearDue"));
		 btnanio.click(); 
		 btnanio.sendKeys("2025");
		 
		 MobileElement btnpesos = (MobileElement) Config.driver.findElement(By.id("switchPayUYU"));
		 btnpesos.click();	 
		 
		 MobileElement importeUYU = (MobileElement) Config.driver.findElement(By.id("etUYUAmountToPay"));
		 importeUYU.click();   
		 importeUYU.setValue(Config.getRandomNumber(20, 30));
		 Tarjetas.montoPagoPesos=importeUYU.getText();
		 
		 MobileElement btnusd = (MobileElement) Config.driver.findElement(By.id("switchPayUSD"));
		 btnusd.click();	
		 
		 MobileElement importeUSD = (MobileElement) Config.driver.findElement(By.id("etUSDAmountToPay"));
		 importeUSD.click();   
		 importeUSD.setValue(Config.getRandomNumber(35, 45));	
		 Tarjetas.montoPagoDolares=importeUSD.getText();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario a enviar");
		 }	 	 
	 
	 public void enviarPlantilla() throws Exception
		{	
		 Thread.sleep(3000); 
		 Config.esperar("edt_UYU_amount");
		 
		 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("edt_pin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 MobileElement menu = (MobileElement) Config.driver.findElement(By.id("layout_btns"));
		 menu.click(); 
		 
		 MobileElement loadPlant = (MobileElement) Config.driver.findElement(By.id("btn_load_template"));
		 loadPlant.click(); 
		 
		 Config.esperar("btn_exit");
		 
		 MobileElement selPlant = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]"));
		 selPlant.click(); 

		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 pin.click();  
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 Thread.sleep(3000); 
		 
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btn_pay_card"));
		 btn_pagar.click(); 
				 
		 Config.esperar("btn_accept");
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar pago?");		 
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 btn_confirmar.click(); 
		 
		 	///codigo para cuando SI funciona el pago de tarjetas
			//------------------------------------------------------------------
			// Config.esperar("txt_creation_date"); ///espero por boton cerrar del ticket
			// Frmwrk.logEvidencia(Config.globalCP, "Ticket");	
			//------------------------------------------------------------------
			 
			 ///codigo modificado para cuando no funciona el pago de tarjetas		 
			 //------------------------------------------------------------------
			 Config.esperar("home");
			 MobileElement home = (MobileElement) Config.driver.findElement(By.id("home"));
			 home.click();
			 
			 Config.esperar("btn_accept"); 
			 btn_confirmar.click(); 
			 
			 Config.esperar("home"); //clickeo en el boton home
			 home.click();
			//------------------------------------------------------------------
		 
		 }	 	 
	 
	 
	 public void guardarPlantilla() throws Exception
		{	
		 Thread.sleep(3000); 
		 Config.esperar("edt_UYU_amount");
		 
		 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("edt_pin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 MobileElement menu = (MobileElement) Config.driver.findElement(By.id("layout_btns"));
		 menu.click(); 
		 
		 MobileElement loadPlant = (MobileElement) Config.driver.findElement(By.id("btn_load_template"));
		 loadPlant.click(); 
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]");
		 MobileElement selPlant = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]"));
		 selPlant.click(); 	
		 
		 Thread.sleep(3000); 
		 
		// Config.driver.
		 
		 c.swipeV();
		 c.swipeV();
		 
		 pin.click();  
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 
		 MobileElement savePlant = (MobileElement) Config.driver.findElement(By.id("btn_save_template"));
		 savePlant.click(); 
		 
		 MobileElement nomP = (MobileElement) Config.driver.findElement(By.id("edt_template_name"));
		 nomP.click();    
		 nomP.setValue("A_Nom_" + Frmwrk.obtenerFecha());
		 Frmwrk.logEvidencia(Config.globalCP, "Plantilla a guardar");	
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 btn_confirmar.click(); 
		 
		 loadPlant.click(); 
		 
		 Config.esperar("btn_exit");
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa plantilla recien guardada");
		 
		 MobileElement btn_exit = (MobileElement) Config.driver.findElement(By.id("btn_exit"));
		 btn_exit.click(); 
		 
		 MobileElement guardBorra = (MobileElement) Config.driver.findElement(By.id("btn_save_draft"));
		 guardBorra.click(); 
		 
		 Config.esperar("txt_title");
		 
		 MobileElement pendientes = (MobileElement) Config.driver.findElement(By.id("btn_pending"));
		 pendientes.click();
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa el borrador guardado");	 
		 
		 }	 	 
	 
	 
}
