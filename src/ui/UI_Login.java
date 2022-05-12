package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Login {
	
/*	 @FindBy(id="btn_show_tour")
	 private MobileElement btn_tour;*/
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	
	public void obtenerVersion () throws Exception
	{ 
	MobileElement version = (MobileElement) Config.driver.findElement(By.id("tvBuildNumber"));
	  Frmwrk.versionApp= version.getText(); 
	  //System.out.println ("version " + Frmwrk.versionNazca);      	
	}
	
	public void tutorial() throws Exception
	{
		Config.esperar("btn_show_tour");
		
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 1");
		Thread.sleep(2000);
		c.swipeHRL();
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 2");
		Thread.sleep(2000);
		c.swipeHRL();
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 3");	
		Thread.sleep(2000);	
		MobileElement btn_tour = (MobileElement) Config.driver.findElement(By.id("btn_show_tour"));
		btn_tour.click();
		
		Frmwrk.ini=true;
	}	
	
	 	
	public void InLoginP1 (String user, String pinn) throws Exception
	{		
		if (Frmwrk.ini==false)
		{//Config.esperar("btn_show_tour");
		Thread.sleep(15000);
		MobileElement btn_tour = (MobileElement) Config.driver.findElement(By.id("btn_show_tour"));
		btn_tour.click();
		Frmwrk.ini=true;	
		}
		
	//System.out.println ("esperando texto de version"); 
	Config.esperar("tvBuildNumber");
	//System.out.println ("por obtener texto de version"); 
	obtenerVersion ();
//	System.out.println ("texto de version obtenido"); 
		
	MobileElement usuario = (MobileElement) Config.driver.findElement(By.id("number_id_et"));
		
    usuario.click();
    usuario.clear();
    usuario.setValue(user);    
        
    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("et_password"));
    Config.globalPin=pinn;
    pin.clear();
    pin.setValue(Config.globalPin);
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN ingresados");
    
    MobileElement continuar = (MobileElement) Config.driver.findElement(By.id("btn_login"));
    continuar.click(); 
    Thread.sleep(2000);
    continuar.click(); 
    Thread.sleep(2000);
    continuar.click(); 
    Thread.sleep(10000);    		
	}	
	
	public void InLoginP2 (String password) throws Exception
	{
	Config.esperar("etPassword");
	MobileElement pass = (MobileElement) Config.driver.findElement(By.id("etPassword"));
    pass.click();
    pass.clear();
    pass.setValue(password);
        
    Frmwrk.logEvidencia(Config.globalCP, "Password ingresado");      
    
    MobileElement ingresar = (MobileElement) Config.driver.findElement(By.id("btn_login2"));
    ingresar.click();    
    
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
//    System.out.println("a"  + Frmwrk.obtenerFecha());
    Thread.sleep(20000);
   // System.out.println (Frmwrk.first);  
	}	

	
	
	public void InLoginP3 (String user, String pinn, String password) throws Exception
	{		
		if (Frmwrk.ini==false)
		{//Config.esperar("btn_show_tour");
		Thread.sleep(15000);
		MobileElement btn_tour = (MobileElement) Config.driver.findElement(By.id("btn_show_tour"));
		btn_tour.click();
		Frmwrk.ini=true;	
		}
		
	//System.out.println ("esperando texto de version"); 
	Config.esperar("tvBuildNumber");
	//System.out.println ("por obtener texto de version"); 
	obtenerVersion ();
//	System.out.println ("texto de version obtenido"); 
		
	MobileElement usuario = (MobileElement) Config.driver.findElement(By.id("number_id_et"));
		
    usuario.click();
    usuario.clear();
    usuario.setValue(user);    
        
    MobileElement pin = (MobileElement) Config.driver.findElement(By.id("et_pin"));
    Config.globalPin=pinn;
    pin.clear();
    pin.setValue(Config.globalPin);
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN ingresados");
    		
	
	Config.esperar("etPassword");
	MobileElement pass = (MobileElement) Config.driver.findElement(By.id("etPassword"));
    pass.click();
    pass.clear();
    pass.setValue(password);
        
    Frmwrk.logEvidencia(Config.globalCP, "Usuario, PIN y Password ingresados");      
    
    MobileElement ingresar = (MobileElement) Config.driver.findElement(By.id("btn_login"));
    ingresar.click(); 
    
   if (Config.conClaveDigital==true)
		{
    Thread.sleep(2000); //esto es sólo para clave digita
    ingresar.click(); 
		}
    
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
//    System.out.println("a"  + Frmwrk.obtenerFecha());
    Thread.sleep(20000);
   // System.out.println (Frmwrk.first);  
	}	
	
}


