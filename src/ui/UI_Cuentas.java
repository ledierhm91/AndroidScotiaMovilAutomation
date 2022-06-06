package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Cuentas {
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 
	 public void irCuenta() throws Exception
		{	
		 MobileElement lst_cta = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]"));
		 lst_cta.click();   
		 }	 
	 
	 public void volver() throws Exception
		{		 
		 MobileElement btn_back = (MobileElement) Config.driver.findElement(By.id("home"));
		 btn_back.click(); 
		 }	
	 
	 
	 public void cuentasFA1() throws Exception
		{
		 MobileElement btn_;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ExpandableListView/android.view.View[1]"));
		 }
		 else
		 {
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ExpandableListView/android.view.ViewGroup[1]/android.widget.ImageView"));
		 }
		 btn_.click(); 
	    }
	 public void cuentasFA2() throws Exception
		{
		 MobileElement btn_;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ExpandableListView/android.view.View[2]"));
		 }
		 else
		 {
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.ImageView"));
		 }
		 btn_.click(); 
	    }
	 
	 public void cuentasFAUltMovWait() throws Exception
		{Config.esperar("allMovementsBtn");		
	    }
	 
	 public void cuentasFAUltMov() throws Exception
		{
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.id("allMovementsBtn"));
	    btn_.click(); 
	    }
	     
	    public void cuentasUltMovWait() throws Exception
		{Config.esperar("imageView22");		
	    }	    
	    
	    public void cuentasFiltro() throws Exception
		{	
//	    Thread.sleep(5000);  //de 30000 a 5000
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.id("spinner"));
	    btn_.click();
	    }
	    
	    public void cuentasFiltroSelec5() throws Exception
		{	
	    	MobileElement btn_;
			
			 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
			 {
			 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
			 btn_.click();
//			 Thread.sleep(5000);
			 Config.esperar("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[1]");}
			 else
			 {
	    	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]"));
	    	 btn_.click();
//		     Thread.sleep(5000);
//		     Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]");	    
	    }}
	    
	    public void cuentasFiltroSelec7() throws Exception
		{	
	    	MobileElement btn_;
			
			 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
			 {
			 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
			 btn_.click();
			 Thread.sleep(5000);
			 Config.esperar("	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[1]");}
			 else
			 {
	    	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
	    	 btn_.click();
		     Thread.sleep(5000);
		     Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]");	    
	    } }
	    
	    public void cuentasBack() throws Exception
		{	
	    	 MobileElement btn_;
				
			 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
			 {
			 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.View/android.widget.ImageButton"));
			 }
			 else
			 {
		     btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
			 }
			 btn_.click();
	    }
	    
	    public void cuentasCuadro() throws Exception
		{	
	    	 MobileElement btn_;
				
			 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
			 {
					 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]"));
					}
			 else 
			 {
				 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]"));
			 }
		
		btn_.click();
	    }
	    
	    
	    public void cuentaPF() throws Exception
		{	Thread.sleep(5000);
	   // Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
		//MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
	   
		//Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout");
		//MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout"));
	   
		//btn_.click();
		
		c.tapPF();
	    }
	    
	    
	    
}
