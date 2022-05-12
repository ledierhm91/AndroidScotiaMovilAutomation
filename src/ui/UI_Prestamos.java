package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Prestamos {
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	
	 public void pagar() throws Exception
		{
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
		 btn_pagar.click(); 
	
		 System.out.println("x " + Frmwrk.obtenerFecha());
		 Thread.sleep(20000);
		 System.out.println("x " + Frmwrk.obtenerFecha());
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de pr�stamo a pagar");	
		 
	/*	 MobileElement btn_cta = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		 btn_cta.click(); 
		 Thread.sleep(2000);
		 MobileElement btn_ctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		 btn_ctasel.click(); */
		 
		 Thread.sleep(2000);
		 
		 MobileElement btn_pagar2 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.Button"));
		 btn_pagar2.click(); 
		 
		 System.out.println("x... ");
		 
		 
		 Config.esperar("etPinLoan");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinLoan"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar Pago?");
		 
		 MobileElement btn_volver = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_volver.click(); 
		 }	 	 
	 
	 public void enviarPlantilla() throws Exception
		{	
		  Thread.sleep(4000);
		 
		 Config.esperar("btn_pay_loan");
		 
		 MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.id("btn_pay_loan"));
		 btn_pay_loan.click();  		 
		 
		 Config.esperar("edt_installments");
		 
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
		 
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btn_pay_loan"));
		 btn_pagar.click(); 
				 
		 Config.esperar("btn_accept");
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar pago?");		 
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 btn_confirmar.click(); 
		 
		// Config.esperar("txt_creation_date"); ///espero por ticket
			// Frmwrk.logEvidencia(Config.globalCP, "Ticket");		 
			 
			 
			 //******* comentar cuando encontremos uno que funcione
			 MobileElement btn_back = (MobileElement) Config.driver.findElement(By.id("home"));
			 btn_back.click(); 
			 
			 btn_confirmar.click(); 
			 
			 btn_back.click(); 
			 ///*******		 
		 
		 }	 	 
	 
	 
	 public void guardarPlantilla() throws Exception
		{	
		 Thread.sleep(4000);		 
		 
		 Config.esperar("btn_pay_loan");
		 
		 MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.id("btn_pay_loan"));
		 btn_pay_loan.click();  		 
		 
		 Config.esperar("edt_installments");
		 
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
	 
	 public void verDetalle() throws Exception
		{	
		 Frmwrk.logEvidencia(Config.globalCP, "Datos Pr�stamo");
		c.swipeV();
		c.swipeV();
		
		Thread.sleep(5000);
		
		Frmwrk.logEvidencia(Config.globalCP, "Datos Pr�stamo - �ltimos movimientos");
		c.swipeVDown();
		c.swipeVDown();
		 }	 	 
}
