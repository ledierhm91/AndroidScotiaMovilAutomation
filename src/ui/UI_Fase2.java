package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import casosDePrueba.Tarjetas;
import io.appium.java_client.MobileElement;

public class UI_Fase2 {
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	UI_Login l = PageFactory.initElements(Config.driver, UI_Login.class);
	 	
	public void InLoginP1 (String user, String pinn) throws Exception
	{
		
		Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN vacios");
		
		l.obtenerVersion ();
		
		Config.esperar("btn_login");
		
		MobileElement continuar = (MobileElement)  Config.driver.findElement(By.id("btn_login"));
		continuar.click();  
		
		Thread.sleep(2000);
		 
		Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de datos incompletos");
		
		//MobileElement ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	  //  ok.click(); 
		
		MobileElement usuario = (MobileElement) Config.driver.findElement(By.id("number_id_et"));
		
	    usuario.click();
	    usuario.clear();
	    usuario.setValue("12345678901234567890");    
	        
	    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("et_password"));
	    Config.globalPin=pinn;
	    pin.clear();
	    pin.setValue(Config.globalPin);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Usuario inexistente y PIN correcto");
	    
	    continuar = (MobileElement)  Config.driver.findElement(By.id("btn_login"));
	    continuar.click();    
		
	    Thread.sleep(2000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de Usuario inexistente");
	    
	    MobileElement   ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	    ok.click();   
		
	    usuario.click();
	    usuario.clear();
	    usuario.setValue(user);    
        
	    pin.clear();
	    pin.setValue("1234567890");
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Usuario correcto y PIN incorrecto");
	    
	    continuar.click();   
	    
	    Thread.sleep(2000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de PIN incorrecto");
	    
	    ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	    ok.click();   
	    
	    pin.clear();
	    pin.setValue(Config.globalPin);
    
	    Frmwrk.logEvidencia(Config.globalCP, "Usuario correcto y PIN correcto");
    
	    continuar.click();    
	    Thread.sleep(5000);    		
	}	
	
	public void InLoginP2 (String password) throws Exception
	{
	Thread.sleep(8000);
	
	Frmwrk.logEvidencia(Config.globalCP, "Contrase�a vacia");
	
	MobileElement continuar = (MobileElement)  Config.driver.findElement(By.id("btn_login2"));
	continuar.click();  
	
	Thread.sleep(2000);
	 
	Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de datos incompletos");
	
	//MobileElement ok = (MobileElement) Config.driver.findElement(By.name("OK"));
   // ok.click(); 
	
	MobileElement pass = (MobileElement) Config.driver.findElement(By.id("etPassword"));
    pass.click();
    pass.clear();
    pass.setValue("bvchdjmski98543687384756");
        
    Frmwrk.logEvidencia(Config.globalCP, "Password incorrecto ingresado");      
       
//    MobileElement done = (MobileElement) Config.driver.findElement(By.name("Done"));
  //  done.click();  
    
    MobileElement ingresar = (MobileElement) Config.driver.findElement(By.id("btn_login2"));
    ingresar.click();    
    
    Thread.sleep(3000);  
    
    Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de Password incorrecto");
    
    MobileElement   ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
    ok.click(); 
    
    pass.click();
    pass.clear();
    pass.setValue(password);
        
    Frmwrk.logEvidencia(Config.globalCP, "Password correcto ingresado");      
       
 //   done = (MobileElement) Config.driver.findElement(By.name("Done"));
 ///   done.click();  
    
    ingresar = (MobileElement)  Config.driver.findElement(By.id("btn_login2"));
    ingresar.click();    
    
    Thread.sleep(20000);
    
    //Si es el S7, clickeamos en el boton cancelar del mensaje que nos informa sobre la huella
    
    if( Config.driver.getCapabilities().getCapability("udid") != null)
    { 	String celular=(String) Config.driver.getCapabilities().getCapability("udid");
    if (celular.equals("ad0a16036888f1122f"))
    { 
   // 	System.out.println (Frmwrk.first);  
    	if (Frmwrk.first==false)
    	{Frmwrk.logEvidencia(Config.globalCP, "Mensaje huella");  
    	// Codigo para S7 u otros con huella digital
    	Config.esperar("cancel_button");    
    	MobileElement cancelar = (MobileElement) Config.driver.findElement(By.id("cancel_button"));
    	cancelar.click();}
    	}}
    Frmwrk.first=true;
   // System.out.println (Frmwrk.first);  
    
	}	


	 public void validacionesPagoTarjetaTerceroVaciosErroneosCtaBloq() throws Exception
		{
		 Thread.sleep(2000); 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		
		 Thread.sleep(2000); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Mensaje datos vacios");
		 
		 MobileElement btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 MobileElement btntj = (MobileElement) Config.driver.findElement(By.id("etCreditCardNumber"));
		 btntj.click(); 
		 btntj.sendKeys("1234567890123456789012345678901234567890");
		 
		 MobileElement btnmes = (MobileElement) Config.driver.findElement(By.id("etMonthDue"));
		 btnmes.click(); 
		 btnmes.sendKeys("8");
		 
		 MobileElement btnanio = (MobileElement) Config.driver.findElement(By.id("etYearDue"));
		 btnanio.click(); 
		 btnanio.sendKeys("2020");
		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //-----------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de tipos de pago incompleto");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 
		 //-------------
		 
		 
		 MobileElement btnpesos = (MobileElement) Config.driver.findElement(By.id("switchPayUYU"));
		 btnpesos.click();	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de seleccion de cuenta");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de falta de monto");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement importeUYU = (MobileElement) Config.driver.findElement(By.id("etUYUAmountToPay"));
		 importeUYU.click();   
		 importeUYU.setValue(Config.getRandomNumber(20, 30));
		 Tarjetas.montoPagoPesos=importeUYU.getText();
		 
		
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 btnpesos.click();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de falta de forma de pago");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 
		 MobileElement btnusd = (MobileElement) Config.driver.findElement(By.id("switchPayUSD"));
		 btnusd.click();	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de seleccionar moneda USD");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		// c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de ingresar importe USD");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement importeUSD = (MobileElement) Config.driver.findElement(By.id("etUSDAmountToPay"));
		 importeUSD.click();   
		 importeUSD.setValue(Config.getRandomNumber(35, 45));	
		 Tarjetas.montoPagoDolares=importeUSD.getText();
		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario a enviar");
		 
		 c.swipeV();
			 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click();  
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error tarjeta incorrecta");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 
		 btntj.clear();
		 btntj.click(); 
		 btntj.sendKeys("43079973");
		 
		 
		 btnmes.clear();
		 btnmes.click(); 
		 btnmes.sendKeys("1");
		 
	/*	 btnanio.clear();
		 btnanio.click(); 
		 btnanio.sendKeys("202");
		 
				 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de a�oo invalido");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 btnanio.clear();
		 btnanio.click(); 
		 btnanio.sendKeys("1990");
		 
		
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de a�o invalido");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 */
		 
		 btnanio.clear();
		 btnanio.click(); 
		 btnanio.sendKeys("2020");
		 
		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 //----------------
		 
		 //-----------
		 
		 Config.esperar("btnBack");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		// btn_pagar = (MobileElement) Config.driver.findElement(By.name("Confirmar Pago"));
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click();  
		 
		 Thread.sleep(7000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error sin PIN");
		 
		 MobileElement btnok2 = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok2.click(); 
		 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 pin.click();    
		 pin.setValue("33277877856874899");
		 
			 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar.click(); 
		 
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error PIN incorrecto");
		 
		 btnok2 = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnok2.click();
		 
		 pin.clear();
		 pin.click();    
		 pin.setValue(Config.globalPin);
	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar.click(); 
		 
		 Thread.sleep(6000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de cuenta bloqueada");
		 
		 c.clickOK();
		 
		 Thread.sleep(2000); 
		 
		 MobileElement cerrar = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 cerrar.click(); 
		 
		 Thread.sleep(2000); 
		 
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
		 back.click(); 
	
		}	
	 
	
	 public void validacionesPagoTarjetaTerceroCtaSSaldo() throws Exception
		{
		 
		 
		 MobileElement btntj = (MobileElement) Config.driver.findElement(By.id("etCreditCardNumber"));
		 btntj.click(); 
		 btntj.sendKeys("43079973");
		 
		 MobileElement btnmes = (MobileElement) Config.driver.findElement(By.id("etMonthDue"));
		 btnmes.click(); 
		 btnmes.sendKeys("1");
		 
		 MobileElement btnanio = (MobileElement) Config.driver.findElement(By.id("etYearDue"));
		 btnanio.click(); 
		 btnanio.sendKeys("2020");
		 
	//	 MobileElement done = (MobileElement) Config.driver.findElement(By.name("Done"));
	//	 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 
		 MobileElement btnpesos = (MobileElement) Config.driver.findElement(By.id("switchPayUYU"));
		 btnpesos.click();	
		 
		 MobileElement ctapesos = (MobileElement) Config.driver.findElement(By.id("spinnerUYUAccount"));
		 ctapesos.click();
		 
		 Thread.sleep(2000);
		 
		 //c.swipeVsuc3();
		// c.swipeVsuc3();
		 
		 Thread.sleep(1000);
		 MobileElement ctapesosSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 ctapesosSel.click();
		 
		 Thread.sleep(1000);
		 
		 MobileElement importeUYU = (MobileElement) Config.driver.findElement(By.id("etUYUAmountToPay"));
		 importeUYU.click();   
		 importeUYU.setValue(Config.getRandomNumber(20, 30));
		 Tarjetas.montoPagoPesos=importeUYU.getText();
		 
		// MobileElement done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		// done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 //-----------
		 
		 Config.esperar("textView40");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnPay"));
		
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 
		 pin.clear();
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		// done = (MobileElement) Config.driver.findElement(By.name("Done"));
		// done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar.click(); 
		 
		 Thread.sleep(6000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de cuenta sin saldo");
		 
		 c.clickOK();
		 
		 Thread.sleep(2000); 
		 
		 MobileElement back = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 back.click(); 
		 
		 Thread.sleep(2000); 
		 
		 MobileElement back2 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
		 back2.click(); 
		 
	
		}	
	 
	 public void validacionesSolCheqVaciosErroneosCtaBloq() throws Exception
		{	
		 Config.esperar("btnRequestCheckbook");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //------------
		 MobileElement btn_solic = (MobileElement) Config.driver.findElement(By.id("btnRequestCheckbook"));
		 btn_solic.click();
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement ctacbo = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.TextView"));
		 ctacbo.click(); 
		 Thread.sleep(2000);
		 MobileElement selctacbo = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 selctacbo.click();
		 
		 MobileElement ctdadCheq = (MobileElement) Config.driver.findElement(By.id("etCheckbookQty"));
		 ctdadCheq.click();   
		 ctdadCheq.setValue("1");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//------------
		 btn_solic = (MobileElement) Config.driver.findElement(By.id("btnRequestCheckbook"));
		 btn_solic.click();
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSendRequest"));
		 btn_confirmar.click(); 
		 
		 Thread.sleep(2000);
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error sin PIN");
		 
				 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 pin.click();    
		 pin.setValue("8374569345792843523574");	
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSendRequest"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("btnPositive");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error PIN incorrecto");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click();
		 
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
				 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");	
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSendRequest"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("btnPositive");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta bloqueada");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_volver= (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_volver.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 ctacbo = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[1]/android.widget.TextView"));
		 ctacbo.click(); 
		 Thread.sleep(2000);
		 selctacbo = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 selctacbo.click();
		 Frmwrk.logEvidencia(Config.globalCP, "");		
		 
		 ctdadCheq = (MobileElement) Config.driver.findElement(By.id("etCheckbookQty"));
		 ctdadCheq.click(); 
		 ctdadCheq.clear(); 
		 ctdadCheq.setValue("12345678901234567890");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_solic = (MobileElement) Config.driver.findElement(By.id("btnRequestCheckbook"));
		 btn_solic.click(); 
		 
		 Thread.sleep(2000);
		 
		 pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");	
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSendRequest"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("btnPositive");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error mucha cantidad de chequeras");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_volver= (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_volver.click(); 
		 
		 Thread.sleep(2000);
		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 ctdadCheq = (MobileElement) Config.driver.findElement(By.id("etCheckbookQty"));
		 ctdadCheq.click(); 
		 ctdadCheq.clear(); 
		 ctdadCheq.setValue("1");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_solic = (MobileElement) Config.driver.findElement(By.id("btnRequestCheckbook"));
		 btn_solic.click(); 
		 
		 Thread.sleep(2000);
		 
		 pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");	
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSendRequest"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("btnPositive");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Transaccion exitosa");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
	/*	 btn_volver= (MobileElement) Config.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
		 btn_volver.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");*/
		 }	 	 
	
	 public void validacionesPrestamosVaciosErroneos() throws Exception
		{	
		 Thread.sleep(5000);
		 
		 MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.id("btnPayLoan"));
		 btn_pay_loan.click();  		 
		 
		// Config.esperar("spnDues");
		 Thread.sleep(15000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de prestamo");	 
	
		 //----------------
		 
		 MobileElement cbocuotas = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.Spinner[2]"));
		 cbocuotas.click(); 
		 Thread.sleep(2000);
		 c.swipeV();c.swipeV();c.swipeV();c.swipeV();
		 
		 MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[9]"));
		 sel.click();  
		 
		 Config.esperar("btnPositive");
		 
		 
		//---------------

		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 cbocuotas = (MobileElement) Config.driver.findElement(By.id("spnDues"));
		 cbocuotas.click(); 
		 Thread.sleep(2000);
		 c.swipeVDown();c.swipeVDown();c.swipeVDown();c.swipeVDown();
		 
		 sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 sel.click();  
		 
		 Thread.sleep(15000);		 
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.Button"));
		 btn_pagar.click(); 
		 
		 Config.esperar("btnConfirmLoanPay");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	 		
		 
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnConfirmLoanPay"));
		 btn_pagar.click(); 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error sin PIN");
		 
		 MobileElement  btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		//--------------		 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinLoan"));
		 pin.click();    
		 pin.setValue("8237456823457g87234658237645");		 
			 
		//---------------

		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.id("btnConfirmLoanPay"));
		 btn_pagar.click(); 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error PIN muy largo");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		//--------------
		 
		 
		 pin = (MobileElement) Config.driver.findElement(By.id("etPinLoan"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar Pago?");
		 
		 MobileElement btn_volver = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_volver.click(); 
		 
		 
		 /*	 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnConfirmLoanPay"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("vTitle");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); */
		 
		 Thread.sleep(5000);
		 
		 }	 	
	 
	 public void combinacionesTransferenciasPropiasUYUUYUUYU() throws Exception
		{	    	    
		    Thread.sleep(4000);
		    c.swipeV();
		    c.swipeVDown();
		 // UYU UYU UYU
		   		    
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.id("spnToAccount"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		   
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
		    sel.click();	    
		    		    
		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		   		    
		    c.swipeV();
		    
		    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		    sel_ref.click();
		    sel_ref.sendKeys("UYU UYU UYU");
		 
		    Frmwrk.logEvidencia(Config.globalCP, "");			    
		    
		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Config.esperar("textView40");
		    
		    c.swipeV();
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		    pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    
		 }	
		    //-----------------------
		    

		    
		    // USD USD USD
			 
/*		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		     cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc3();
		    
		     sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	    
		    
		    cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    
		  //  c.swipeVsuc2();
		    c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		     sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		     done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    c.swipeV();
		    
		    sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		      sel_ref.click();
		    sel_ref.sendKeys("USD USD USD");
		    
		     done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	


		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
			   btn_transf.click();
		    
		    
			   Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
			     
		    c.swipeV();
		    
		    pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
			     pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		     done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		     btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		     btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		    btn_ok.click();
	*/	    
		    //-----------------------
	
		    public void combinacionesTransferenciasPropiasUSDUYUUYU() throws Exception
			{
		    // USD UYU UYU
			 
		    MobileElement  cbo_cta_deb = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		     
		    MobileElement  sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
		    sel.click();
		    
		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    c.swipeV();
		    
		    MobileElement  sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		     sel_ref.click();
		    sel_ref.sendKeys("USD UYU UYU");
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	


		    MobileElement    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
			btn_transf.click();
		    
		    Config.esperar("etPinTransfer");
			     
		    c.swipeV();
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
			pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement    btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement   btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
			 }	
		    //-----------------------
		 
		    public void combinacionesTransferenciasPropiasUSDUYUUSD() throws Exception
			{
		    // USD UYU USD
			 
		     MobileElement   cbo_cta_deb = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		     cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
		    sel.click();
		    Thread.sleep(1000);
		  
		    MobileElement  cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner/android.widget.TextView"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		    sel.click();
		    Thread.sleep(1000);
		    MobileElement   sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		  
		    c.swipeV();
		    
		    MobileElement   sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		    sel_ref.click();
		    sel_ref.sendKeys("USD UYU USD");
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    
		    MobileElement   btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
			btn_transf.click();
		   
			Config.esperar("etPinTransfer");
			     
		    c.swipeV();
		    
		    MobileElement   pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
			pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement  btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement     btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    //-----------------------
		    
		 }	
	 
	 public void combinacionesTransferenciasPropiasUSDUSDUSD() throws Exception
		{	    	    
		    Thread.sleep(4000);
		    c.swipeV();
		    c.swipeVDown();
		    
		    // USD USD USD
			 
		    MobileElement cbo_cta_deb = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		     cbo_cta_deb.click();		    
		    Thread.sleep(2000);		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
		    sel.click();
		    Thread.sleep(1000);
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.id("spnToAccount"));
		    cbo_cta_cred.click();
		    Thread.sleep(1000);
		    sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
		    sel.click();	    
		    Thread.sleep(1000);		  
		    
		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    c.swipeV();
		    
		    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		    sel_ref.click();
		    sel_ref.sendKeys("USD USD USD");		
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	

		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
			btn_transf.click();
		    
		    Config.esperar("btnSubmitTransfer");
			     
		    c.swipeV();
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
			pin.click();
		    pin.sendKeys(Config.globalPin);		    
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
	   
		    //-----------------------
		    
		}
	 
	 public void validacionesTransferenciasPropiasVaciosErroneos() throws Exception
		{	    	    
		    Thread.sleep(4000);
		    c.swipeV();
		    c.swipeV();
		    
		    //----------------
		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Thread.sleep(2000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    //----------------
		  
		    //----------------
		    Frmwrk.logEvidencia(Config.globalCP, "");

		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys("0");	
		    
		    MobileElement   cbo_cta_deb = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		     cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));
		    sel.click();
		  
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Thread.sleep(2000);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    		  
		   // c.swipeVDown();
		    
		    //----------------
		    
		    sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.clear();
		    sel_importe.sendKeys("934569348593847598374958374598");		    
		   
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Config.esperar("etPinTransfer");
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();   
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		    pin.click();
		    pin.sendKeys(Config.globalPin);		    
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "Error por monto muy grande");
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    
		  //---------------
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.clear();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));		    
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //----------------
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();

		    Config.esperar("etPinTransfer");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		    btn_ok.click();
		    
		    Thread.sleep(3000);
		    
		    c.swipeV();
		    
		    //----------------
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		    sel_ref.click();
		    sel_ref.sendKeys("UYU UYU UYU prueba larrrrgaaaa");		    
		     
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Config.esperar("btnPositive");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Error referencia muy larga");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		    
		    sel_ref.clear();
		    sel_ref.click();
		    sel_ref.sendKeys("UYU UYU UYU");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    //------------------------------------------------------------------------------
		    
		    Config.esperar("btnSubmitTransfer");
		    
		    c.swipeV();
		    
		  //----------------
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		     btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    

		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "Error envio de formulario sin PIN");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    Thread.sleep(1000);
		    c.swipeV();
		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    //----------------
		    c.swipeV();
		    Config.esperar("etPinTransfer");
		    pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		    pin.click();
		    pin.sendKeys("8347658374658937465937846958639458639458");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    c.swipeV();
		  //----------------
		    btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    

		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "Error envio de formulario PIN incorrecto");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    Thread.sleep(1000);
		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    c.swipeV();
		    //----------------
		    Config.esperar("etPinTransfer");
		    pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		    pin.click();
		    pin.clear();
		    pin.sendKeys(Config.globalPin);
		   
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //-----------------------
			}
	 
	 
	 public void validacionesTransferenciasPropiasCtasBloq() throws Exception
		{	    	    
		    Thread.sleep(4000);
		  
		    MobileElement cbo_cta_deb;
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
		    sel.click();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");

		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		 
		    c.swipeV();

		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Config.esperar("btnPositive");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Error por cuenta debito bloqueada");
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    //-----------------------
		    
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		    sel.click();
		    
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.id("spnToAccount"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);		   
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		    sel.click();	

		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Config.esperar("btnPositive");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Error por cuenta credito bloqueada");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    
			}
	 
	 public void validacionesTransferenciasPropiasCtaDebSSaldo() throws Exception
		{	    	    
		    Thread.sleep(4000);
		  
		    MobileElement cbo_cta_deb;
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeV(); c.swipeV();
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]"));
		    sel.click();
		    		    
		    Thread.sleep(1000);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		     
		    //----------------
		    c.swipeV();
		   
		    Frmwrk.logEvidencia(Config.globalCP, "");

		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();

		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		    Config.esperar("btnSubmitTransfer");
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		    pin.click();
		    pin.sendKeys(Config.globalPin);		    
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		    MobileElement  btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("btnPositive");
		    Frmwrk.logEvidencia(Config.globalCP, "Error por cuenta debito sin saldo");
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		   
		    
			}
	 
	 
	 public void validacionesTransferenciasInternasVaciosyPIN() throws Exception
		{
		 Thread.sleep(5000);
		 
		 //-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click(); 
		 
	//	 Config.esperar("btnPositive");
	//	 Frmwrk.logEvidencia(Config.globalCP, "Error por datos vac�os");
		    
	//	 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	//	 btn_ok.click();
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error por datos vac�os");
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
				 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click(); 
		 
		 Config.esperar("btnPositive");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 MobileElement	 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click();
		 
	//	 Config.esperar("btnPositive");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
//		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
//		 btn_ok.click();
		 
		 Config.esperar("btnTransfer");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 		 
	//	 c.swipeVDown();
	//	 c.swipeVDown();
	//	 c.swipeVDown();
	//	 c.swipeVDown();
		 //--------------------------------------
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		 CtaDest.sendKeys("375888500");
		 
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click(); 
		 
		 Config.esperar("btnPositive");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click();
		 
		 
	//	 Config.esperar("btnPositive");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
	//	 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	//	 btn_ok.click();
		 
		 Config.esperar("btnTransfer");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
	//	 c.swipeVDown();
	//	 c.swipeVDown();
	//	 c.swipeVDown();
	//	 c.swipeVDown();
		 //--------------------------------------
		  
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
		 cbosuc.click();
		 
		 Thread.sleep(3000);	
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
		 sucSel.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click(); 
		 
		 Config.esperar("btnBack");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_ok.click();
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 //--------------------------------------
		 //--------------------------------------
		 
		 MobileElement swSave = (MobileElement) Config.driver.findElement(By.id("swSaveTransfer"));
		 swSave.click();    
		 
		 Thread.sleep(1000);
		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
		 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_confirmar.click(); 
		 
	//	 Config.esperar("btnPositive");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
	//	 MobileElement btn_confirm = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	//	 btn_confirm.click(); 
		 
		 Config.esperar("btnBack");
		 
		 c.swipeV();c.swipeV();
		 
		 MobileElement btn_volver= (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_volver.click(); 
		 
		 Config.esperar("btnTransfer");
		 Thread.sleep(2000);
		 
		 swSave = (MobileElement) Config.driver.findElement(By.id("swSaveTransfer"));
		 swSave.click();  
		 
		 Thread.sleep(2000);
		 
		 MobileElement txt = (MobileElement) Config.driver.findElement(By.id("etTransferName"));
		 txt.click(); 
		 txt.sendKeys(Frmwrk.obtenerFecha());
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
	//	 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
	//	 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	//	 btn_confirmar.click(); 	 
		
		 
	//	 Config.esperar("textView40");	
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(2000);
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
	//	 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
	//	 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	//	 btn_confirmar.click(); 	 
		
		 Config.esperar("textView40");	
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue("98457603547603875460837456083456");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 }	
	 
	 
	 public void validacionesTransferenciasInternasBloqRef() throws Exception
		{
		 Thread.sleep(5000);
		 
		 //-----------------------
		 
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 cboctao.click();
		 
		 Thread.sleep(1000);
		
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
		 ctaoSel.click(); 
				 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 	
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
		 sucSel.click(); 	
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		 CtaDest.sendKeys("375888500");	
		 
		 c.swipeV();
		 c.swipeV();
				 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();    
		 refe.setValue("Prueba1");
			 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");

		 
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
		 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta debito bloqueada");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		//-----------------------------------------------------------------------
		 
		 Config.esperar("spnFromAccount");
		 
		 cboctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 cboctao.click();
		 
		 Thread.sleep(1000);
		 
		 ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 ctaoSel.click(); 
		 Thread.sleep(1000);
		 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Spinner[1]/android.widget.TextView"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 mndSel.click(); 
		 Thread.sleep(1000);
		 MobileElement cbotc = (MobileElement) Config.driver.findElement(By.id("spnAccountType"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement tcSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 tcSel.click(); 
		 Thread.sleep(1000);
		 CtaDest = (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		 CtaDest.clear();
		 CtaDest.sendKeys("364455300");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
		 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta credito bloqueada");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 
		 //-----------------------------------------------------------------------
	////	 c.swipeVDown();
	//	 c.swipeVDown();
	//	 c.swipeVDown();
		 
		 cbomnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 mndSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 mndSel.click(); 
		 
		 cbotc = (MobileElement) Config.driver.findElement(By.id("spnAccountType"));
		 cbotc.click();
		 Thread.sleep(1000);
		 tcSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 tcSel.click(); 
		 
		 CtaDest = (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		 CtaDest.clear();
		 CtaDest.sendKeys("375888500");
	 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
/*		 monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();  
		 monto.clear();  
		 monto.sendKeys("93457869384576038475600");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 c.swipeV();
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error por monto muy grande");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(4000);
		 
		 monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click(); 
		 monto.clear();   
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 */
		 
		 c.swipeV();
		 c.swipeV();
		 
		 refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();  
		 refe.clear();
		 refe.setValue("Prueba1zxcvsadahoeiughkewhjgleskglksjflgkjsdlfgkjsdlfkgjlskdfjglksdjfglksdfg");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
		 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error referencia muy larga");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(3000);
		 
		 refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();  
		 refe.clear();
		 refe.setValue("Prueba1");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
		 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("btnSubmitTransfer");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 			 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		
		 
		 }	
	 
	 
	 public void validacionesTransferenciasInternasDebSSaldoMontoGde() throws Exception
		{
		 Thread.sleep(5000);
		 
		 //-----------------------
		 
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 cboctao.click();
		 
		 Thread.sleep(1000);
		 c.swipeV();c.swipeV();
		 
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]"));
		 ctaoSel.click(); 
		 Thread.sleep(1000);		 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys("934856793845769945689456");		 
		 		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
		 sucSel.click(); 
		 Thread.sleep(1000);
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		 CtaDest.sendKeys("375888500");		
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
			 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();    
		 refe.setValue("Prueba1");
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");

		 
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
	//	 Config.esperar("btnPositive");		 
		 
	//	 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
	//	 Thread.sleep(1000);
	//	 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	//	 btn_confirmar.click(); 
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 Config.esperar("btnSubmitTransfer");
		 
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error monto muy grande");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 	 
		 
		 monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
	
		 btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  
		 
//		 Config.esperar("btnPositive");		 
//		 
	//	 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
//		 btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
//		 btn_confirmar.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 Config.esperar("btnSubmitTransfer");
		 
		 c.swipeV();
		 
		 pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
	
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta debito sin saldo");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 
		 }	
	 
	 
	 public void combinacionesTransfScotiaUYUUSDUYU() throws Exception
		{
		 UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
		 
		 
		 //-----------------UYU USD UYU-----------------
		 
	 
			 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView"));
			 cbomnd.click();
			 Thread.sleep(1000);
			 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
			 mndSel.click(); 
			 Thread.sleep(1000);
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
		 sucSel.click(); 
		 
		 Thread.sleep(1000);
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		 CtaDest.sendKeys("375888500");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();				
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(18, 56));	
				 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();    
		 refe.setValue("UYU USD UYU");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	 
		 
		 t.enviarTransfScotia();;
		 
		 
		 }	
		 
		 public void combinacionesTransfScotiaUSDUSDUSD() throws Exception
			{
			 UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
//-----------------USD USD USD-----------------
		 
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 cboctao.click();
		 Thread.sleep(1000);
		 MobileElement   ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
		 ctaoSel.click(); 
		 
		 Thread.sleep(1000);
		 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 mndSel.click(); 
		 Thread.sleep(1000);
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
		 sucSel.click(); 
		 Thread.sleep(1000);
		 MobileElement  CtaDest =  (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		  CtaDest.sendKeys("375888500");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();		
		 
		 Thread.sleep(1000);
		 
	/*	 MobileElement  cbomnd2 = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 MobileElement   mndSel2= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 mndSel2.click(); */
		 Thread.sleep(1000);
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(18, 60));		 
		 Thread.sleep(1000);		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();    
		 refe.setValue("USD USD USD");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
		 t.enviarTransfScotia();;
		 		 
			 }	
		 
		 public void combinacionesTransfScotiaUSDUYUUYU() throws Exception
			{UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
		 //-----------------USD UYU UYU-----------------
			 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
			 cboctao.click();
			 Thread.sleep(1000);
			 MobileElement   ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
			 ctaoSel.click(); 
			 Thread.sleep(1000);
			 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
			 cbosuc.click();
			 Thread.sleep(1000);
			 
			 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
			 sucSel.click(); 
			 Thread.sleep(1000);
			 MobileElement  CtaDest =  (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
			 CtaDest.click();
			// CtaDest.sendKeys("364455300");
			  CtaDest.sendKeys("375888500");		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(18, 70));
			 
		 Thread.sleep(1000);
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();    
		 refe.setValue("USD UYU UYU");		 
			 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 		 
		 t.enviarTransfScotia();;
		 
		 //--------------------------------------------------------
		
			 }	
		 
		 public void combinacionesTransfScotiaUSDUYUUSD() throws Exception
			{UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
		 //-----------------USD UYU USD-----------------
		 
			 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
			 cboctao.click();
			 Thread.sleep(1000);
			 MobileElement   ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
			 ctaoSel.click(); 
			 Thread.sleep(1000);		 
			 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
			 cbosuc.click();
			 Thread.sleep(1000);
			 
			 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
			 sucSel.click(); 
			 Thread.sleep(1000);
			 MobileElement  CtaDest =  (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
			 CtaDest.click();
			// CtaDest.sendKeys("364455300");
			  CtaDest.sendKeys("375888500");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement  cbomnd2 = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 MobileElement  mndSel2= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 mndSel2.click(); 
		 Thread.sleep(1000);
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(18, 80));		 	
		 Thread.sleep(1000);
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();    
		 refe.setValue("USD UYU USD");
			 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
		 t.enviarTransfScotia();;
		 
		 //--------------------------------------------------------
		 
		 }	
	 
	 
	 public void combinacionesTransfPlazaUYUEUR() throws Exception
		{	
		 Frmwrk.logEvidencia(Config.globalCP, "TP 0");
		 Thread.sleep(1000);
	/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 c.swipeVDown();c.swipeVDown();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
		 c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 Thread.sleep(1000);c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 Thread.sleep(3000);
		 
		 //-------------------UYU EUR-----------------------------
		 MobileElement cta = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 cta.click();   
		 Thread.sleep(2000);
		 MobileElement ctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 ctasel.click(); 
				 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 Thread.sleep(1000);
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 Thread.sleep(1000);
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 Thread.sleep(1000);		 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("UYU EUR");	
		 Thread.sleep(1000);
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 motSel.click();  
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnSubmitTransfer");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 		 
 //--------------------------------------------------------------------
		
		}
	 
	 public void combinacionesTransfPlazaUYUUSD() throws Exception
		{
		 Frmwrk.logEvidencia(Config.globalCP, "TP 0");
		 Thread.sleep(1000);
	/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 c.swipeVDown();c.swipeVDown();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
		 c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 Thread.sleep(1000);c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 Thread.sleep(3000);
		 
		//-------------------UYU USD-----------------------------
		 MobileElement cta = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 cta.click();   
		 Thread.sleep(2000);
		 MobileElement ctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 ctasel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 Thread.sleep(1000);
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 Thread.sleep(1000);
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 Thread.sleep(1000);	
		 
		 MobileElement moneda = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
		 moneda.click();    
		 Thread.sleep(1000);
		 MobileElement monsel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 monsel.click();    
		 Thread.sleep(1000);
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 c.swipeV();
		 Thread.sleep(1000);
		 c.swipeV();
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 motSel.click();  
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("UYU USD");	
		 Thread.sleep(1000);
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnSubmitTransfer");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 		 
}
	 
	 public void combinacionesTransfPlazaUSDUSD() throws Exception
		{Frmwrk.logEvidencia(Config.globalCP, "TP 0");
		 Thread.sleep(1000);
	/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 c.swipeVDown();c.swipeVDown();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
		 c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 Thread.sleep(1000);c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 Thread.sleep(3000);
		 
//-------------------USD USD-----------------------------
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 ctao.click();    
		 Thread.sleep(1000);
		 MobileElement ctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 ctasel.click();    
		 Thread.sleep(1000);
		 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 Thread.sleep(1000);
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 Thread.sleep(1000);
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 Thread.sleep(1000);	
		 
		 MobileElement moneda = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
		 moneda.click();    
		 Thread.sleep(1000);
		 MobileElement monsel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 monsel.click();    
		 Thread.sleep(1000);
		 
		 c.swipeV();
		 Thread.sleep(1000);
		 c.swipeV();
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
		 motSel.click();  
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("USD USD");	
		 Thread.sleep(1000);
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnSubmitTransfer");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 		 
		 }	 
	 
	 public void combinacionesTransfPlazaUSDUYU() throws Exception
		{
		//-------------------USD UYU-----------------------------
		 
		 Thread.sleep(4000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 0");
		 Thread.sleep(1000);
	/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 c.swipeVDown();c.swipeVDown();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
		 c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 Thread.sleep(1000);c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 Thread.sleep(3000);
		 
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 ctao.click();    
		 Thread.sleep(1000);
		 MobileElement ctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 ctasel.click();    
		 Thread.sleep(1000);
		 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 Thread.sleep(1000);
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 Thread.sleep(1000);
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 Thread.sleep(1000);	
		 
		 MobileElement moneda = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
		 moneda.click();    
		 Thread.sleep(1000);
		 MobileElement monsel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 monsel.click();    
		 Thread.sleep(1000);
		 
		 c.swipeV();
		 Thread.sleep(1000);
		 c.swipeV();
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
		 motSel.click();  
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("USD UYU");	
		 Thread.sleep(1000);
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnSubmitTransfer");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 		 
		 }
	 
	 
	 public void combinacionesTransfPlazaUSDEUR() throws Exception
		{
		 Frmwrk.logEvidencia(Config.globalCP, "TP 0");
		 Thread.sleep(1000);
	/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 c.swipeVDown();c.swipeVDown();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
		 c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 Thread.sleep(1000);c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 Thread.sleep(3000);
		 
		//-------------------USD EUR-----------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 ctao.click();    
		 Thread.sleep(1000);
		 MobileElement ctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 ctasel.click();    
		 Thread.sleep(1000);
		 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 Thread.sleep(1000);
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 Thread.sleep(1000);
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 Thread.sleep(1000);	
		 
		/* MobileElement moneda = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
		 moneda.click();    
		 Thread.sleep(1000);
		 MobileElement monsel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 monsel.click();    
		 Thread.sleep(1000);*/
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
				 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("USD EUR");	
		 Thread.sleep(1000);
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));
		 motSel.click();  
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnSubmitTransfer");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 Thread.sleep(1000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 		 
		 
		 }	
	 
	 public void combinacionesTransfPlazaEUREUR() throws Exception
		{	
		 Frmwrk.logEvidencia(Config.globalCP, "TP 0");
		 Thread.sleep(1000);
	/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 c.swipeV();c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 c.swipeVDown();c.swipeVDown();
		 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
		 c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
		 Thread.sleep(1000);c.tapTRP1();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 Thread.sleep(3000);
		 //-------------------EUR EUR-----------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 ctao.click();    
		 Thread.sleep(2000);
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 ctaoSel.click(); 
		 Thread.sleep(2000);
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);	 
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");		
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 		 
			 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 c.swipeV();c.swipeV();	
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 motSel.click();  
			 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("EUR EUR");	
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("098123456");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("textView40");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);	
		 
		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		}	
		 
		 
		 public void combinacionesTransfPlazaEURUSD() throws Exception
			{	 Frmwrk.logEvidencia(Config.globalCP, "TP 0");
			 Thread.sleep(1000);
				/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
					 c.swipeV();c.swipeV();
					 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
					 c.swipeVDown();c.swipeVDown();
					 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
					 c.tapTRP1();
					 Thread.sleep(1000);
					 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
					 Thread.sleep(1000);c.tapTRP1();
					 Thread.sleep(1000);
					 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
					 Thread.sleep(3000);
			 
		//-------------------EUR USD-----------------------------
		 
			 MobileElement ctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
			 ctao.click();    
			 Thread.sleep(2000);
			 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
			 ctaoSel.click(); 
			 Thread.sleep(2000);
			 
			 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
			 bco.click();  
			 Thread.sleep(2000);	 
			 
			 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
			 bcoSel.click(); 
			 
			 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
			 bcocta.click();  
			 bcocta.sendKeys("1234569870");
			
			 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
			 nom.click();  
			 nom.sendKeys("Juan Perez");		
			 
			 MobileElement mnd = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
			 mnd.click();   
			 Thread.sleep(2000);
			 MobileElement mndsel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
			 mndsel.click(); 

			 
			 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
			 monto.click();    
			 monto.setValue(Config.getRandomNumber(27, 46)); 		 
				 
			 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
			 
			 c.swipeV();c.swipeV();	
			 
			 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
			 mot.click();  
			 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
			 motSel.click();  
				 
			 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
			 ref.click();    
			 ref.setValue("EUR USD");	
			 
			 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
			 tel.click();  
			 tel.sendKeys("098123456");		 
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
			 
			 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
			 btn.click();   
			 
			 Config.esperar("btnPositive");
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
			 
			 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
			 btnOK.click();   
			 
			 Config.esperar("textView40");
			  
			 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
			 pin.click(); 
			 pin.setValue(Config.globalPin);	
			 
			 c.swipeV();
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
			 
			 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
			 btn_tr.click(); 		 
			 
			 Config.esperar("btnPositive");
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
			 
			 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
			 btn_ok.click(); 
			 
	 //--------------------------------------------------------------------
			 
			 Thread.sleep(1000);
			}	
		 
		 public void combinacionesTransfPlazaEURUYU() throws Exception
			{	
			 Frmwrk.logEvidencia(Config.globalCP, "TP 0");
			 Thread.sleep(1000);
		/*	 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
			 c.swipeV();c.swipeV();
			 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
			 c.swipeVDown();c.swipeVDown();
			 Frmwrk.logEvidencia(Config.globalCP, "TP 3");*/
			 c.tapTRP1();
			 Thread.sleep(1000);
			 Frmwrk.logEvidencia(Config.globalCP, "TP 1");
			 Thread.sleep(1000);c.tapTRP1();
			 Thread.sleep(1000);
			 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
			 Thread.sleep(3000);
//-------------------EUR UYU-----------------------------
			 Config.esperar("spnFromAccount");
			 MobileElement ctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
			 ctao.click();    
			 Thread.sleep(2000);
			 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
			 ctaoSel.click(); 
			 Thread.sleep(2000);
			 
			 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
			 bco.click();  
			 Thread.sleep(2000);	 
			 
			 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
			 bcoSel.click(); 
			 
			 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
			 bcocta.click();  
			 bcocta.sendKeys("1234569870");
			
			 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
			 nom.click();  
			 nom.sendKeys("Juan Perez");		
			 
			 MobileElement mnd = (MobileElement) Config.driver.findElement(By.id("spnCurrency"));
			 mnd.click();   
			 Thread.sleep(2000);
			 MobileElement mndsel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
			 mndsel.click(); 

			 
			 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
			 monto.click();    
			 monto.setValue(Config.getRandomNumber(27, 46)); 		 
				 
			 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
			 
			 c.swipeV();c.swipeV();		 
			
			 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
			 mot.click();  
			 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
			 motSel.click();  
			 
			 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
			 ref.click();    
			 ref.setValue("EUR UYU");	
			 
			 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
			 tel.click();  
			 tel.sendKeys("098123456");		 
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
			 
			 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
			 btn.click();   
			 
			 Config.esperar("btnPositive");
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
			 
			 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
			 btnOK.click();   
			 
			 Config.esperar("textView40");
			  
			 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
			 pin.click(); 
			 pin.setValue(Config.globalPin);	
			 
			 c.swipeV();
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
			 
			 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
			 btn_tr.click(); 		 
			 
			 Config.esperar("btnPositive");
			 
			 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
			 
			 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
			 btn_ok.click(); 
			 
	 //--------------------------------------------------------------------
			 
			 Thread.sleep(1000);
		 
		 }	
	 
	
	 
	 public void validacionesTransfPlazaValoresErroneos() throws Exception
		{	
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click(); 
		 
		 Config.esperar("btnPositive");		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error monto no ingresado");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();  
		 
		 Config.esperar("btnPositive");		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error monto no ingresado 2");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();
		 
		 Thread.sleep(1000);		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue("569739456873045689304958"); 
		 
		 Thread.sleep(1000);
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Campos incompletos");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 Thread.sleep(1000);		 
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error tel�fono no ingresado");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("09812345693485769385476983745968734958673948567934857693847569837456983749568734958679348567");
		
		 Thread.sleep(1000);
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta no ingresada");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569879345867903485679038457609384576038475608374956873495769347569834576");
		 Thread.sleep(1000);
		 
		 Thread.sleep(1000);
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta cuenta inv�lida");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 bcocta.click(); 
		 bcocta.clear();
		 bcocta.sendKeys("12345698793");
		 Thread.sleep(1000);
		 
		 Thread.sleep(1000);
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error nombre y apellido no ingresado");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez dflj dflh dflkh ldfkgh ldfkjgh lkdfj ghl kjdfghklj dflkh ldkfjghl kjfgkhjooofd fghk diotr ");
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error nombre y apellido inv�lido");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 nom.click();  
		 nom.clear();
		 nom.sendKeys("Juan Perez");
		 
		 Thread.sleep(1000);
		 
		 c.swipeVDown();c.swipeVDown();
		 
		 
		 MobileElement btncta = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 btncta.click();
		 Thread.sleep(1000);
		 
		 MobileElement btnctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 btnctasel.click();
		 
		 c.swipeV();c.swipeV();
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();
		 Thread.sleep(1000);
		 
		 MobileElement motsel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 motsel.click();	
		 Thread.sleep(1000);
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnSubmitTransfer");
		 
		 c.swipeV();c.swipeV();
		 
		 MobileElement btnsend = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btnsend.click();   
		 		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error monto muy grande");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.clear();
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 Thread.sleep(1000);
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("btnSubmitTransfer");
		 
		 c.swipeV();c.swipeV();
		 
		 btnsend = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btnsend.click(); 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error sin PIN");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);		 
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("etPinTransfer"); 
		 
		 c.swipeV();c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click();
		 pin.setValue("349762305687394568739048769034");
		 
		 Thread.sleep(1000);
		 btnsend = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btnsend.click(); 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error PIN erroneo");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Thread.sleep(1000);
		 
		 btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();  
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("etPinTransfer");
		 
		 c.swipeV();c.swipeV();
		 
		 pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click();
		 pin.setValue(Config.globalPin);
		 
		 Thread.sleep(1000);
		 btnsend = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btnsend.click(); 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "OK");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		}
	 
	 public void validacionesTransferenciasPlazaCtaDebSinSaldo() throws Exception
		{	
		 
		 //------------------------------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 ctao.click();    
		 Thread.sleep(2000);
		 c.swipeV();c.swipeV();c.swipeV();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]"));
		 ctaoSel.click(); 
		 Thread.sleep(2000);
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();  
		 Thread.sleep(2000);		 
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 bcoSel.click(); 
		 Thread.sleep(2000);
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
			 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");		 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46));		 
			 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 c.swipeV(); c.swipeV();		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("EUR EUR");	
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]"));
		 motSel.click();  
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();   
		 
		 Config.esperar("textView40");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);

		 c.swipeV();c.swipeV();	 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta sin saldo");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(1000);
		}

}

