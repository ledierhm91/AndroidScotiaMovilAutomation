package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Menu_Izq {	
	
	 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	 
	 public void home () throws Exception
		{
		 Thread.sleep(3000);
		 c.swipeHLR();
		 c.swipeHRL();
		    
		 UI_Menu_ArribaAbajo fp2 = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);
		 fp2.ini();
		 
		// System.out.println("pre home " + Frmwrk.obtenerFecha());
		Thread.sleep(3000);
	    c.swipeHLR();
	    c.swipeHRL();
	    c.swipeHLR();
	  //  System.out.println("home " + Frmwrk.obtenerFecha());
	    Frmwrk.logEvidencia(Config.globalCP, "Swipe de izquierda a derecha (men�)");
	    }	
	 
	 public void plazoFijo () throws Exception
		{
		Thread.sleep(2000);
	    c.swipeHRLcorto();//c.swipeHRLcorto();
	    Thread.sleep(4000);
	   // c.swipeHRL();	
	   // c.swipeHRL();
	   // c.swipeHRL();
	    //Frmwrk.logEvidencia(Config.globalCP, "Swipe de izquierda a derecha (men�)");
	    }	
	 
	 //------------------------
	 public void seleccionPerfil () throws Exception
		{
	    c.swipeHLR();
	    Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout");
	    MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout"));
	    btn_.click(); 	    
	    }
	 public void seleccionAmbiente () throws Exception
		{
	    MobileElement btn_ = (MobileElement) Config.driver.findElement(By.id("btn_select_env"));
	    btn_.click(); 	    
	    }
	 
	 
	//------------------------
	 public void salir () throws Exception
		{
		
		 Thread.sleep(3000);
	    MobileElement btn_salir = (MobileElement) Config.driver.findElement(By.id("icon"));
	    btn_salir.click(); 
	    
	    Thread.sleep(2000);
	    Frmwrk.logEvidencia(Config.globalCP, "Acepta salir del sistema?");
	    
	    Config.esperar("btnPositive");
	    MobileElement btn_aceptar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	    btn_aceptar.click(); 
	    }	
	 
	 public void inicio () throws Exception
		{//c.swipeVDown();
		 Config.esperar("navigation_home");
	    MobileElement btn_ = (MobileElement) Config.driver.findElement(By.id("navigation_home"));
	    btn_.click(); 
	    }
	 
	
	 
	 public void cuentas () throws Exception
		{c.swipeVDown();
		
		MobileElement btn_cuentas ;
		
		/*		if (Config.conClaveDigital==true)
		 {btn_cuentas = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]"));
		 }
		 else
		 {  */
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
	    btn_cuentas = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView"));
		// }
	    
	    btn_cuentas.click(); 
	    }
	 
	    
	    
	 public void transferir () throws Exception
		{
		 c.swipeVDown();
		 
		 MobileElement btn_transf;
		 System.out.println("transferir " + Frmwrk.obtenerFecha());
		 
		 /*		 if (Config.conClaveDigital==true)
		 {btn_transf = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]"));
		 }
		 else
		 {   */
			 Thread.sleep(2000);
	//	 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView");
	    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]"));
	    System.out.println("transferir android 6 para arriba " + Frmwrk.obtenerFecha());
	   // }
	    
	    btn_transf.click(); 
	    }
	 
	 public void pagos () throws Exception
		{c.swipeVDown();
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout");
	    MobileElement btn_pagos = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout"));
	    btn_pagos.click();  
	    }
	 
	 public void solicChequera () throws Exception
		{
		 Thread.sleep(3000);
		 c.swipeVDown();
		 
		 MobileElement btn_scheq;
		 
		 /*		 if (Config.conClaveDigital==true)
		 {btn_scheq = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]"));
		 }
		 else
		 {  */
		 Thread.sleep(2000);
		// Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView");
		 btn_scheq = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView"));
		 //}
	    
	    btn_scheq.click(); 
	    } 
	 
	 public void tarjetas () throws Exception
		{c.swipeVDown();
		
		MobileElement btn_tarj;
		 
		/*		if (Config.conClaveDigital==true)
		 {btn_tarj = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]"));
		 }
		 else
		 {  */
		// Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
	     btn_tarj = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView"
	     		+ ""));
		// }
	     btn_tarj.click();  
	    }	
	 
	 public void prestamos () throws Exception
		{c.swipeVDown();
		
		
		 MobileElement btn_loan;
		 
		 /*		 if (Config.conClaveDigital==true)
		 {btn_loan= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]"));
		 }
		 else
		 {  */
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView");
	     btn_loan = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView"));
		// }
	     
	     btn_loan.click();  
	  //  Config.esperar("btn_pay_loan");
	    }	
	 
	 public void transaccionesPendientes () throws Exception
		{
		 Config.esperar("btn_pending");
		 
		 MobileElement pendientes = (MobileElement) Config.driver.findElement(By.id("btn_pending"));
		 pendientes.click();
		 
		 
		 Config.esperar("txt_title");
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa el listado de transacciones pendientes");
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Bajamos en el listado");
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Bajamos en el listado");
		 
		}
	 
	//------------------------------------------------------------------------------------
	 
	 public void sucursalesYcajeros() throws Exception
		{	//c.swipeV();
		 
		 MobileElement btn_suc;
		 
		 /*		 if (Config.conClaveDigital==true)
		 {btn_suc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]"));
		 }
		 else
		 { */
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView");
	    btn_suc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView"));
	    if (btn_suc.getText().equals("Sucursales y Cajeros"))
	    {}
	    else
		{btn_suc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.TextView"));}
		// }
	    btn_suc.click();  
	    }
	 
	 public void sycBtnSuc() throws Exception
		{	
		MobileElement btn_suc = (MobileElement) Config.driver.findElement(By.id("button4"));
	    btn_suc.click();  
	    }
	 public void sycBtnCaj() throws Exception
		{	
		MobileElement btn_suc = (MobileElement) Config.driver.findElement(By.id("button5"));
	    btn_suc.click();  
	    }
	 
	 
	 public void sycBtnOpenMap() throws Exception
		{	
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.id("btnOpenMap"));
	    btn_.click();  
	    }
	 
	 public void sycBtnFiltro() throws Exception
		{	
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.id("btnFilter"));
	    btn_.click();  
	    }
	 
	 public void sycBtnback() throws Exception
		{	 MobileElement btn_;
		
	 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
	 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");	
	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton"));
	 }
	 else
	 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
	 }  
	 
	 btn_.click();  
	    
	    }
	 
	 public void sycBtnFiltroMdeo() throws Exception
		{	
		 MobileElement btn_;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
		 }
		 else
		 {
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
		 }
		 btn_.click();  
	    }
	 public void sycBtnFiltroInt() throws Exception
		{	
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]"));
	    btn_.click();  
	    }
	 public void sycBtnFiltroTodos() throws Exception
		{	
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
	    btn_.click();  
	    }
	 
	 public void sycBtnlistaItem3() throws Exception
		{	
		 MobileElement btn_;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
			 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.view.View/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[3]");
			 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.view.View/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[3]"));
		}
		 else
		 {
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]");
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]"));
		 }
		
		btn_.click();  
	    }
	 public void sycBtnlistaItem4() throws Exception
		{	MobileElement btn_;
		
	 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
	 {
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.view.View/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[4]");
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.view.View/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[4]"));
	}
	 else
	 {
	 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[4]");
	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[4]"));
	 }
	 btn_.click();  
	    }
	 
	//------------------------------------------------------------------------------------
	 
	 public void mensajes() throws Exception
		{//	c.swipeV();
		 MobileElement btn_msgs;
		 
		 /*		 if (Config.conClaveDigital==true)
		 {btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]"));
		 }
		 else
		 { */
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView");
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView"));
	    if (btn_msgs.getText().equals("Mensajes"))
	    {}
	    else
		{btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView"));}
		// } 
	    btn_msgs.click();  
	    }
	 
	 public void mensajesSelec1() throws Exception
		{
		 
		 MobileElement btn_;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.view.View/android.support.v7.widget.RecyclerView/android.view.View[1]");
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.view.View/android.support.v7.widget.RecyclerView/android.view.View[1]"));
		 }
		 else
		 {
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView");
	    btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView"));
		 }
		 btn_.click();  
	    }
	 
	 public void mensajesSelec1Reply() throws Exception
		{
		Config.esperar("btnReply");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.id("btnReply"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void mensajesSelec1ReplyandSend() throws Exception
		{
		Config.esperar("teMessage");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.id("teMessage"));	   
	    btn_msgs.click();  
	    btn_msgs.sendKeys("Este es un texto de prueba para responder");
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje a enviar (respuesta)");
	    
	    MobileElement btn_send = (MobileElement) Config.driver.findElement(By.id("btnSend"));	   
	    btn_send.click();  
	    
	    }
	 
	 public void mensajesSelec1Replyback() throws Exception
		{Thread.sleep(20000);
		
		 MobileElement btn_msgs;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton");
	     
			 btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton"));
		 }
		 else
		 {
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton");
	     btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
		 }
	    btn_msgs.click();  
	    }
	 
	 public void mensajesTipos() throws Exception
		{
		Config.esperar("btnMsgTypes");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.id("btnMsgTypes"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void mensajesTiposEnv() throws Exception
		{
		 MobileElement btn_msgs;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	     
		btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
		 }
		 else
		 {
		 
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
		 }
	    btn_msgs.click();  
	    }
	 
	 public void mensajesTiposRec() throws Exception
		{
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void mensajeNuevo() throws Exception
		{
		Config.esperar("btnNewMessage");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.id("btnNewMessage"));
	   
	    btn_msgs.click();  
	    
	    Config.esperar("teSubject");
	    MobileElement btn_subj = (MobileElement) Config.driver.findElement(By.id("teSubject"));
	    btn_subj.click(); 
	    btn_subj.sendKeys("Asunto prueba");
	    
	    MobileElement btn_msg = (MobileElement) Config.driver.findElement(By.id("teMessage"));	   
	    btn_msg.click();  
	    btn_msg.sendKeys("Este es un texto de prueba nuevo");
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje a enviar");
	    
	 //   MobileElement btn_attach = (MobileElement) Config.driver.findElement(By.id("btnAttach"));	   
	 //   btn_attach.click();  
	    
	//    Frmwrk.logEvidencia(Config.globalCP, "attach");
	    
	//    MobileElement btn_back = (MobileElement) Config.driver.findElement(By.id("contentPanel"));	   
	//    btn_back.click(); 	    
	    
	    MobileElement btn_send = (MobileElement) Config.driver.findElement(By.id("btnSend"));	   
	    btn_send.click();  
	    
	    }
	 
	 
	 public void transacciones() throws Exception
		{		c.swipeV();
		
		MobileElement btn_pend;
		 
		/*		if (Config.conClaveDigital==true)
		 {btn_pend = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]"));
		 }
		 else
		 {   */
			 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView");
	     btn_pend = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView"));
	    if (btn_pend.getText().equals("Transacciones"))
	    {}
	    else
		{btn_pend = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.TextView"));}
		// }
	    btn_pend.click();  
		}
	 
	 
	 public void transaccionesCombo() throws Exception
		{
		Config.esperar("spnFilterStatus");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.id("spnFilterStatus"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void transaccionesFiltrar() throws Exception
		{
		Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Todas");	
		
		if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
		    MobileElement btn_msgs;
		    
		    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		    btn_msgs.click();  
		    Frmwrk.logEvidencia(Config.globalCP, "Se listan Todas");
		    
		    MobileElement btn_cbo = (MobileElement) Config.driver.findElement(By.id("spnFilterStatus"));		   
		    btn_cbo.click(); 	    
		    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Pendientes");
		    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		    btn_msgs.click();  
		    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Pendientes");
		    
		    btn_cbo.click(); 	    
		    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Finalizadas");
		    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		    btn_msgs.click();  
		    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Finalizadas");
		    }
		 else
		 {
		
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
	    MobileElement btn_msgs;
	    
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se listan Todas");
	    
	    MobileElement btn_cbo = (MobileElement) Config.driver.findElement(By.id("spnFilterStatus"));		   
	    btn_cbo.click(); 	    
	    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Pendientes");
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Pendientes");
	    
	    btn_cbo.click(); 	    
	    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Finalizadas");
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Finalizadas");
	    
		 }
	    }
	 
	 
	 public void configuracion () throws Exception
		{
		 
		 c.swipeV();
		
		MobileElement btn_config;
		 
		/*		if (Config.conClaveDigital==true)
		 {btn_config = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[10]"));
		 }
		 else
		 {  */
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.TextView");
	    btn_config= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.TextView"));
	    if (btn_config.getText().equals("Configuraci�n"))
	    {}
	    else
		{btn_config = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.TextView"));}
		// }
	    btn_config.click();  
}
	 
	 
	 public void configuracionVerificar() throws Exception
		{
		//Config.esperar("sw_opt_fingerprint");
		Thread.sleep(2000);
		Frmwrk.logEvidencia(Config.globalCP, "Se muestra el estado actual del switch");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.id("sw_opt_fingerprint"));
	   
	    btn_msgs.click();  
	    Thread.sleep(2000);
	    Frmwrk.logEvidencia(Config.globalCP, "Se clickeo, tiene que haberse modificado");
	    
	    btn_msgs.click();  
	    Thread.sleep(2000);
	    Frmwrk.logEvidencia(Config.globalCP, "Se clickeo, vuelve al estado inicial");
	    }
	 
	 
	 
	 
}
