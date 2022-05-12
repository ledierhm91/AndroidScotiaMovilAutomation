package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Menu_ArribaAbajo {	
	
	 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	 
	 public void inicio() throws Exception
		{
	    c.swipeHLR();
	    
	    c.swipeVDown();
	 	// Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
	    MobileElement btn_inicio = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Inicio\"]/android.widget.ImageView"));
	    btn_inicio.click(); 
	    
	    }	 	
	 
	 public void cuentas () throws Exception
		{
		 ini();
		// Config.esperar("//android.support.v7.app.ActionBar.Tab[@content-desc=\"First Tab\"]/android.widget.LinearLayout/android.widget.ImageView");
	    //MobileElement btn_cuentas = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"First Tab\"]/android.widget.LinearLayout/android.widget.ImageView"));
		// este xpath es nuevo. 28 de oct
		 
		 MobileElement btn_cuentas = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"First Tab\"]/android.widget.LinearLayout/android.widget.TextView"));
	    btn_cuentas.click(); 
	    }
	 
	 public void tarjetas () throws Exception
		{ini();
		 
		  //Config.esperar("//android.support.v7.app.ActionBar.Tab[@content-desc=\"Second Tab\"]/android.widget.LinearLayout/android.widget.ImageView");
	    
		//MobileElement btn_tarj = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Second Tab\"]/android.widget.LinearLayout/android.widget.ImageView"));
		// este xpath es nuevo. 28 de oct
		MobileElement btn_tarj = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Second Tab\"]/android.widget.LinearLayout/android.widget.TextView"));
		
		
		
	    btn_tarj.click(); 
	    
	/*    Config.esperar("com.android.packageinstaller:id/permission_deny_button");
	    MobileElement btn_deny = (MobileElement) Config.driver.findElement(By.xpath("com.android.packageinstaller:id/permission_deny_button"));
	    btn_deny.click(); */
	    
	   // 
	   //Config.driver.switchTo().alert().accept();
	    }	
	 
	 public void ubicacion () throws Exception
		{
		 ini();
	 	 //Config.esperar("(//android.support.v7.app.ActionBar.Tab[@content-desc=\"Third Tab\"])[1]/android.widget.LinearLayout/android.widget.ImageView");
		 
	   //MobileElement btn_ubicacion = (MobileElement) Config.driver.findElement(By.xpath("	\r\n" + "(//android.widget.LinearLayout[@content-desc=\"Third Tab\"])[1]/android.widget.LinearLayout/android.widget.ImageView"));
		// este xpath es nuevo. 28 de oct
	    MobileElement btn_ubicacion = (MobileElement) Config.driver.findElement(By.xpath("(//android.widget.LinearLayout[@content-desc=\"Third Tab\"])[1]/android.widget.LinearLayout/android.widget.TextView"));
	    btn_ubicacion.click();  
	    }
	 
	 
	 
	 public void prestamos () throws Exception
		{ini();
	 	 Config.esperar("(//android.widget.LinearLayout[@content-desc=\"Third Tab\"])[2]/android.widget.LinearLayout/android.widget.TextView");
	    MobileElement btn_loan = (MobileElement) Config.driver.findElement(By.xpath("(//android.widget.LinearLayout[@content-desc=\"Third Tab\"])[2]/android.widget.LinearLayout/android.widget.TextView"));
	    btn_loan.click();  
	    }	
	 
	 public void prestamosBack () throws Exception
		{
		 MobileElement btn_loan;
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
		     btn_loan = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton"));
		 }
		 else
		 { 
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
	     btn_loan = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
		 }
	    
	    btn_loan.click();  
	    }	
	 
	 
	 public void cotizaciones () throws Exception
		{ini();
	 	 Config.esperar("(//android.support.v7.app.ActionBar.Tab[@content-desc=\"Third Tab\"])[3]/android.widget.LinearLayout/android.widget.ImageView");
	    MobileElement btn_cotiza = (MobileElement) Config.driver.findElement(By.xpath("(//android.widget.LinearLayout[@content-desc=\"Third Tab\"])[3]/android.widget.LinearLayout/android.widget.ImageView"));
	    btn_cotiza.click();  
	    }	
	 
	 public void cotizacionesCompra () throws Exception
		{
	 	// Config.esperar("btnBuySellMarketRates");
	    MobileElement btn_cotiza = (MobileElement) Config.driver.findElement(By.id("btnBuySellMarketRates"));
	    btn_cotiza.click(); 	    	    
	    
	    MobileElement cbo_cta_cred;
		
		/* if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]");
			 cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ExpandableListView/android.view.View[1]"));
		 }
		 else
		 {
	    Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]");
	    cbo_cta_cred= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]"));
		 }*/
	    cbo_cta_cred = (MobileElement) Config.driver.findElement(By.id("spnToAccount"));
	    
	    cbo_cta_cred.click();
	    
	    MobileElement sel_cta_cred;
	    
	    if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
		    sel_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
			 }
		 else
		 {
	    Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
	    sel_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 }
	    sel_cta_cred.click();	    
	    
	    MobileElement cbo_mnd;
	    
	    if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner/android.widget.TextView");
		 cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner/android.widget.TextView"));
			 }
		 else
		 {
			 //Aquì depliega el selector de cuenta destino
	    Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]/android.widget.TextView");
	     cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]/android.widget.TextView"));
		 }
	    
	    cbo_mnd.click(); 
	    
	    MobileElement sel_mnd;
	    
	    if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 sel_mnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
			 }
		 else
		 {
			 //Aquí se selecciona la cuenta destino en compra de dolares
	    Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]");
	     sel_mnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]"));
		 }
	    sel_mnd.click(); 
	    
	    Config.esperar("etAmount");
	    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
	    sel_importe.click();
	    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
	    
	    Config.esperar("etReference");
	    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
	    sel_ref.click();
	    sel_ref.sendKeys("Prb Compra");
	    
	    c.swipeV();
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Datos de compra");	
	    
	    Config.esperar("btnTransfer");
	    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
	    btn_transf.click();
	    
	    
	    Config.esperar("etPinTransfer");
	    
	    c.swipeV();
	    
	    Thread.sleep(5000);
	    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
	    //MobileElement pin = (MobileElement) Config.driver.findElement(By.id("com.ingsw.scotiabankapp.testing:id/textinput_placeholder"));

	    
	    pin.click();
	    pin.sendKeys(Config.globalPin);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Datos de compra - Confirmar");	
	    
	    Config.esperar("btnSubmitTransfer");
	    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
	    btn_confirmar.click();
	    
	    Config.esperar("ivState");
	    Frmwrk.logEvidencia(Config.globalCP, "Compra realizada");	
	    
	    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	    btn_ok.click();
	    
	    ini();
	    
	    }	
	 
	 public void cotizacionesVenta () throws Exception
		{
		 cotizaciones();
		 c.swipeV();
		 c.swipeV();
		 
		 //Config.esperar("btnBuySellMarketRates");
		    MobileElement btn_cotiza = (MobileElement) Config.driver.findElement(By.id("btnBuySellMarketRates"));
		    btn_cotiza.click(); 
		    
		    Config.esperar("spnFromAccount");
		    //Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[2]");
		    //MobileElement cbo_cta_orig = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[2]"));
		    MobileElement cbo_cta_orig = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		    cbo_cta_orig.click(); 
		    
		    MobileElement sel_cta_orig;
		    if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
			 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]");
			 sel_cta_orig = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
			 }
			 else
			 {
		    
		    Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]");
		     sel_cta_orig = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
			 }
		    
		    sel_cta_orig.click(); 
		    
		    Config.esperar("etAmount");
		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    Config.esperar("etReference");
		    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		    sel_ref.click();
		    sel_ref.sendKeys("Prb Venta");
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos de Venta");	
		    
		    Config.esperar("btnTransfer");
		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		    btn_transf.click();
		    
		 
		    
		    Config.esperar("etPinTransfer");
		    c.swipeV();
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		    pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos de Venta - Confirmar");	
		    
		    Config.esperar("btnSubmitTransfer");
		    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		    btn_confirmar.click();
		    
		    Config.esperar("ivState");
		    Frmwrk.logEvidencia(Config.globalCP, "Venta realizada");	
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		    btn_ok.click();
		    
		    ini();
		    
	    }	
	 	 
	 
	 
	 public void ini () throws Exception
		{
	    MobileElement btn_ini = (MobileElement) Config.driver.findElement(By.id("navigation_home"));
	    btn_ini.click(); 
	    Thread.sleep(2000);
	    
	    }
	
	 
	 public void contactos () throws Exception
		{ini();
		Config.esperar("//android.widget.FrameLayout[@content-desc=\\\"Contactos\\\"]");
	    MobileElement btn_contacts = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Contactos\"]"));
	    btn_contacts.click(); 
	    Thread.sleep(12000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos pantalla de Contact center");	
	    
	    Thread.sleep(5000);
	    MobileElement btn_contacts2 = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Contactos\"]/android.widget.ImageView"));
	    btn_contacts2.click();
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos pantalla de Sucursales");	
	    
	    MobileElement btn_contacts3 ;
		
		if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {btn_contacts3 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.TextView"));
		 }
		 else
		 {
	     btn_contacts3 = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Sucursales\"]/android.widget.TextView"));
		 }
	    
	    
	    btn_contacts3.click();
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos sucursales de Montevideo");
	    btn_contacts3.click();
	    
	    
	    MobileElement btn_contacts4 ;
		
		if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {btn_contacts4 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.TextView"));
		 }
		 else
		 {
	     btn_contacts4 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.TextView"));
		 }
	    
	    btn_contacts4.click();
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos sucursales del interior");
	    btn_contacts4.click();
	    } 
	 
		 
//----------------------------------------------------------------------------	
	 
	 public void promociones() throws Exception
		{ini();
		Config.esperar("//android.widget.FrameLayout[@content-desc=\"Promociones\"]/android.widget.ImageView");
	    MobileElement btn_promo = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Promociones\"]/android.widget.ImageView"));
	    btn_promo.click();  
	    }
	 
	 public void promoFiltro() throws Exception
		{
		 Config.esperar("btnFilter");
	   MobileElement btn_promo_filtro = (MobileElement) Config.driver.findElement(By.id("btnFilter"));
	   btn_promo_filtro.click();  
	    }
	 
	 public void promoOPTodos() throws Exception
		{ Config.esperar("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	   MobileElement btn_promo_filtro = (MobileElement) Config.driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
	   btn_promo_filtro.click();  
	    }
	 public void promoOPJoyeria() throws Exception
		{Config.esperar("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[13]");
	   MobileElement btn_promo_filtro = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[13]"));
	   btn_promo_filtro.click();  
	    }
	 public void promoOPCines() throws Exception
		{Config.esperar("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[14]");
	   MobileElement btn_promo_filtro = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[14]"));
	   btn_promo_filtro.click();  
	    }
	 public void promoOPTodoparabebes() throws Exception
		{Config.esperar("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[15]");
	   MobileElement btn_promo_filtro = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[15]"));
	   btn_promo_filtro.click();  
	    }
	 
	 public void promo1() throws Exception
		{
		 MobileElement btn_promo_1;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
			 btn_promo_1 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[1]"));
		 }
		 else
		 {
	    btn_promo_1 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]"));
		 }
	   
	   btn_promo_1.click();  
	    }
	 
	 public void promoBack() throws Exception
		{
		 
		 MobileElement btn_promo_back;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
			 btn_promo_back = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton"));
		 }
		 else
		 {
			 btn_promo_back = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
		 }
	   
	   btn_promo_back.click();  
	    }
	 
	 public void promoLlamarSuc() throws Exception
		{
	   MobileElement btn_promo_ = (MobileElement) Config.driver.findElement(By.id("button3"));
	   btn_promo_.click();  
	    }

	 
	 //----------------------------------------------------------------------------	 
	 
	 public void transferir() throws Exception
		{ini();
		Config.esperar("//android.widget.FrameLayout[@content-desc=\\\"Transferir\\\"]/android.widget.ImageView");
	    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Transferir\"]/android.widget.ImageView"));
	    btn_transf.click();  
	    }
	 
	 public void scotiapagos () throws Exception
		{/*ini();
	    MobileElement scotiapagos = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"ScotiaPagos\"]/android.widget.ImageView"));
	    scotiapagos.click();  
	    
	    Config.esperar("btnPositive");
	    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); */		 
}
	 
	
	 
	 
	 
	 
	 
	 
	 
}
