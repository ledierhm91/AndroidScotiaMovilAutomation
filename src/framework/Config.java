/*
 * Classname: Settings 
 * 
 * Version information: 1.0
 *
 * Date: April 22nd 2015
 * 
 * Copyright notice
 */

package framework;

import java.io.File;
import java.net.URL;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Config {	    
	  public static AppiumDriver driver;
	  public static String globalPin;
	  public static String globalCP;
	  public static String globalBrowser;
	  public static String globalJD="xx";
	  public static String globalDescrip=" ";
	//public static Boolean conClaveDigital=false;
	  	  
	public static void iniciar(String portNumber, String udid) throws Exception {	
		  	DesiredCapabilities capabilities = new DesiredCapabilities();
		  
		  //---------------------------------------------------------------------------------------------
//	        capabilities.setCapability("deviceName", "phone0");
	        capabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
	          
	        capabilities.setCapability("unicodeKeyboard", true); //Codigo para utilizar el teclado de APPIUM
	    //   capabilities.setCapability("resetKeyboard", true);	//Codigo para volver a setear el teclado por defecto de Android (para que siga funcionando normalmente)        
	        
	      //capabilities.setCapability("udid", udid); //J4 42007aa7d3b1a57b //S7 ad0a16036888f1122f
	        
	        capabilities.setCapability("autoGrantPermissions", true);
	 //       
	        capabilities.setCapability("locationServicesAuthorized", true);
	        capabilities.setCapability("locationServicesEnabled", true);
	        capabilities.setCapability("gpsEnabled", true);
      
	        
	   //     capabilities.setCapability("automationName", "uiautomator2");
	   //     capabilities.setCapability("automationName", "appium");
	        
	        //cambio de version
	        
	       ///// config para instalar la app en el dispositivo y utilizar esta para el proceso de testing
	      //File file = new File("//Users//scotibank//Downloads//", "develop_2.5.0beta5_127.apk");
	        
	       File file = new File("//Volumes//HD - Datos - Datos//APK//", "develop_2.4.3_137.apk" );
	      
	       capabilities.setCapability("app", file.getAbsolutePath());  
	        
	        ///// config para abrir la app instalada en el dispositivo para el proceso de testing
	     //capabilities.setCapability("appPackage", "com.ingsw.scotiabankapp.develop");
	       capabilities.setCapability("appPackage", "com.ingsw.scotiabankapp.testing");
	       capabilities.setCapability("appActivity","com.ingsw.scotiabankapp.introduction.SplashActivity");	
	      
	 	 //mCurrentFocus=Window{3f266bcd0 u0 com.ibm.security.verifyapp/com.ibm.security.verifyapp.activities.WelcomeActivity}
	     //com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity	        
	        //---------------------------------------------------------------------------------------------
	       ///emulador
	 
	
//	        capabilities.setCapability("avd", "Pixel_3a_XL_API_28_1");  // Android 9
	//      capabilities.setCapability("avd", "Pixel_4_API_27");	 // Android 8.1
//	        capabilities.setCapability("avd", "Pixel_3a_XL_API_28_1");  // Android 9	         
	      //capabilities.setCapability("avd", "Pixel_4_XL_API_29_1");  // Android 10
	      capabilities.setCapability("avd", "Pixel5_Android11");  // Android 11
	      //capabilities.setCapability("avd", "Pixel_4_API_29_PS");  // Android 10 con Playstore
	        
	       
	        //---------------------------------------------------------------------------------------------
	        
	        driver = new AppiumDriver(new URL("http://127.0.0.1:" + portNumber + "/wd/hub"), capabilities);	
	        
	        Frmwrk.celu=udid;  }
	      

		  
	  public static void terminarSesion() throws Exception { if (driver != null) {
          driver.quit();
      } }		
	  
	 	  
	  public static MobileElement mobileElement;
	  
	  public static boolean esperarPor(String targetResource){
	  boolean isElementPresent;
	try{
		if (targetResource.length()<30)
		{mobileElement = (MobileElement) driver.findElement(By.id(targetResource));}
		else 
		{mobileElement = (MobileElement) driver.findElement(By.xpath(targetResource));}	
	  	WebDriverWait wait = new WebDriverWait(driver, 2000);
	  	wait.until(ExpectedConditions.visibilityOf(mobileElement));
	  	isElementPresent = mobileElement.isDisplayed();
	//  	System.out.println("Presente? " + isElementPresent + " config100 " + targetResource);
		
	  	return isElementPresent;	
	  }catch(Exception e){
	  	isElementPresent = false;
	//  	System.out.println("Presente? " + isElementPresent + " config105 " + targetResource);
	  	return isElementPresent;
	  } }
	  
	  public static boolean esperar(String targetResourceId){
		  boolean isElementPresent;
		  boolean esta = false;
		  int veces=30;
		try{
			while (esta==false)
			{
			if (veces>1) {
				esta = esperarPor(targetResourceId); veces=veces-1; //System.out.println("esta?: " + esta);
			}	
			else {System.out.println("x"); return isElementPresent = false;}
			}
			
		  	return isElementPresent = true;	
		  }catch(Exception e){
		  	isElementPresent = false;
		  	System.out.println(e.getMessage());
		  //	System.out.println("M");
		  	return isElementPresent;
		  } }
		
	  public static String getRandomNumber(int min, int max) {
			
			Random r = new Random();
			return Long.toString(r.longs(min, (max + 1)).findFirst().getAsLong());

		}
	  
}
