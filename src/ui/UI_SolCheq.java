package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_SolCheq {
		 
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);	
	 
	 public void completar() throws Exception
		{	
		 Config.esperar("etCheckbookQty");
//		 Thread.sleep(5000);
	
		 MobileElement ctdadCheq = (MobileElement) Config.driver.findElement(By.id("etCheckbookQty"));
		 ctdadCheq.click();   
		 ctdadCheq.setValue("2");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario a enviar");
		 
		 MobileElement btn_solic = (MobileElement) Config.driver.findElement(By.id("btnRequestCheckbook"));
		 btn_solic.click(); 
		 
		 Config.esperar("textView40");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");	
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnSendRequest"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("tvTitle");
		 
//		 Thread.sleep(15000);
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Transacci�n exitosa");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 }	 	 
	 
	 public void enviarPlantilla() throws Exception
		{	
		 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 
		 Config.esperar("edt_pin");
 		 
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
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.id("btn_next"));
		 btn_transferir.click(); 
				 
		 Config.esperar("btn_accept");
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");		 
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("txt_creation_date"); ///espero por boton cerrar del ticket
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket");		 
		 
		 }	 	 
	 
	 
	 public void guardarPlantilla() throws Exception
		{	
		 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 Config.esperar("edittext_checkbook");
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
