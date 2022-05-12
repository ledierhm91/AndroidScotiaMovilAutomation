package ui;

import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import casosDePrueba.TransferenciaScotia;
import io.appium.java_client.MobileElement;


public class UI_Transferir {
	
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 
	 public void irTransfScotia() throws Exception
		{	
		 Thread.sleep(2000);
		 c.swipeV();
		 c.swipeVDown();
		 Thread.sleep(2000);
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.id("spinnerTransferType"));
		 btn_ts.click();   
		 }	
	 
	 public void irTransfPlaza() throws Exception
		{	
		 MobileElement btn_tp;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
		 btn_tp = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 }
		 else
		 {
		// Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
			 Thread.sleep(2000);
			 btn_tp = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 }
		 btn_tp.click(); 
		 Frmwrk.logEvidencia(Config.globalCP, "TP_ir");
		 }	
	 
	 public void irTransfScotiaTerc() throws Exception
		{
		 MobileElement btn_tp;

		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 btn_tp = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }
		 else
		 {		 
		// Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		  
			 Thread.sleep(2000);
			 btn_tp = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }
		 btn_tp.click(); 
		 }	
	 
	 public void completarTransfScotia(String moneda) throws Exception
		{
		// Config.esperar("spnBranch");	
		 
		 Thread.sleep(5000);
		 
	//	 c.swipeV();c.swipeV();c.swipeV();
	//	 c.swipeVDown();c.swipeVDown();c.swipeVDown();
		 
		 if (moneda.equals("USD"))
		 {
			 	
		 MobileElement selmon;

		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Spinner[1]/android.widget.TextView"));
		 cbomnd.click();
			 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 selmon = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }
		 else
		 {
		 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.Spinner/android.widget.TextView"));
		 cbomnd.click();
			 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 selmon = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }
		 selmon.click();
		 }
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.id("spnBranch"));
		 //TransferenciaScotia.ctaDeb=cbosuc.getText();
		 cbosuc.click();
		 
		 c.swipeVsuc();		 
		 
		 MobileElement selsuc;

		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
		 selsuc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 }
		 else
		 {
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
		 selsuc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		 }
		 
		int s=3;
		 
		 while (!selsuc.getText().equals("CASA CENTRAL - 1"))
		 {
			 
			 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
			 { selsuc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[" + s + "]"));
			 }
			 else
			 {
			 
			 selsuc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[" + s + "]"));
			 }
			 
			 s++;
		 }		 
		 //selsuc = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 selsuc.click();	
		 
		 
			 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.id("etAccountTo"));
		 CtaDest.click();
		 CtaDest.sendKeys("375888500");
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();c.swipeV();c.swipeV();
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 refe.click();    
		 refe.setValue("Prueba1");
		 
		 MobileElement swSave = (MobileElement) Config.driver.findElement(By.id("swSaveTransfer"));
		 swSave.click();    
		 
		 c.swipeV(); c.swipeV();
		 Thread.sleep(2000);
		 
		 MobileElement nomTemp = (MobileElement) Config.driver.findElement(By.id("etTransferName"));
		 nomTemp.click();  
		 
		 nomTemp.setValue("A_Nom_" + Frmwrk.obtenerFecha());
		 
		 c.swipeV();c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
	/*	 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("edt_pin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);*/	
		 
		/* System.out.println(TransferenciaScotia.ctaDeb + "-" + TransferenciaScotia.ctaCred + "-" + TransferenciaScotia.moneda
				 + "-" + TransferenciaScotia.montoTransferencia);
		 System.out.println( "cuenta deb:" + TransferenciaScotia.ctaDeb.substring(0, 2)  +" Moneda deb:" + TransferenciaScotia.ctaDeb.substring(3, 6) + " cuenta deb:" +
				 TransferenciaScotia.ctaDeb.substring(7, TransferenciaScotia.ctaDeb.length()));		 */
		 }	
	 
	 public void enviarTransfScotia() throws Exception
		{
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn_transferir.click();  

		/* if (Frmwrk.plantilla==false)
		 {	 Config.esperar("btnPositive");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "T�rminos y condiciones");
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_confirmar.click(); }*/
		 
		 Thread.sleep(15000);
		 Config.esperar("etPinTransfer");	
		 
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 Thread.sleep(15000);
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transacci�n");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 Thread.sleep(5000);
		 /*
		 Frmwrk.logEvidencia(Config.globalCP, "Permite compartir el comprobante");
		 
		
		 MobileElement btn_share = (MobileElement) Config.driver.findElement(By.id("btnShare"));
		 btn_share.click(); 
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Opciones para compartir");
		 
		 c.tapTRP1();
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "Permite compartir el comprobante 2 (Pero presiono volver ahora)");
		
		 Thread.sleep(5000);
		 
		 //c.tapTRP3();
		  * 
		  */
		 MobileElement btn_volverrr = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_volverrr.click(); 
		 Thread.sleep(5000);
		 Frmwrk.logEvidencia(Config.globalCP, "Volvimos al formulario de transferencias");
		 
		 
		 }	
	 
	 public static boolean validarPago() throws Exception
		{
		 Boolean OK1=false;
		 String monedaDeb="0";
		 String monedaCred="0";
		 float montoDeb=0;
		 float montoCred=0;
		 String moneda="0";
		 String compra="0";
		 String venta="0";
		if (TransferenciaScotia.ctaDeb.substring(3, 6).equals("UYU"))
		{monedaDeb="0";}else{monedaDeb="2225";}		
		if (TransferenciaScotia.ctaCred.substring(3, 6).equals("UYU"))
		{monedaCred="0";}else{monedaCred="2225";}		
		if (TransferenciaScotia.moneda.equals("UYU"))
		{moneda="0";}else{moneda="2225";}
		
		if(monedaCred.equals(monedaDeb) && monedaCred.equals(moneda)) 
		{montoDeb=Float.valueOf(TransferenciaScotia.montoTransferencia);
		montoCred=Float.valueOf(TransferenciaScotia.montoTransferencia);}
		else if((monedaCred.equals(monedaDeb) && monedaCred.equals("0") && moneda.equals("2225")) ||
				(monedaCred.equals(monedaDeb) && monedaCred.equals("2225") && moneda.equals("0")))
		{
			String query = "select TCVENTAPERSONAL, TCCOMPRAPERSONAL from banking.monedas where c6399 = 2225";
			 
			 ResultSet datosDB = Frmwrk.consultarBD(query);
			
			 while (datosDB.next()) {{
				 compra = datosDB.getString("TCCOMPRAPERSONAL");
				 venta = datosDB.getString("TCVENTAPERSONAL");
			 }}				 
			 datosDB.close();	
			 
		//	 System.out.println(compra + " - " + venta);
				
			 if (monedaDeb.equals("0"))
			 {montoDeb=Float.valueOf(TransferenciaScotia.montoTransferencia)* Float.valueOf(venta);
				montoCred=(Float.valueOf(TransferenciaScotia.montoTransferencia) * Float.valueOf(venta));} 
			 else
			 {montoDeb=(Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(compra));
				montoCred=Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(compra);	} 
		}
		else
		{
			String query3 = "select TCVENTAPERSONAL, TCCOMPRAPERSONAL from banking.monedas where c6399 = 2225";
			 
			 ResultSet datosDB3 = Frmwrk.consultarBD(query3);			
			 //System.out.println(query3);
			 while (datosDB3.next()) {{
				 compra = datosDB3.getString("TCCOMPRAPERSONAL");
				 venta = datosDB3.getString("TCVENTAPERSONAL");
			 }}				 
			 datosDB3.close();	
	
			// System.out.println(compra + " - " + venta);
			 
			 if (monedaDeb.equals(moneda))
			 {montoDeb=Float.valueOf(TransferenciaScotia.montoTransferencia);
			 	if (monedaDeb.equals("0"))
			 	{montoCred=(Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(venta));} 
			 	else
			 	{montoCred=(Float.valueOf(TransferenciaScotia.montoTransferencia) * Float.valueOf(venta));} 
			 }
			 else
			 {	if (monedaDeb.equals("0"))
			 	{montoDeb=(Float.valueOf(TransferenciaScotia.montoTransferencia) * Float.valueOf(venta));} 
			 	else
			 	{montoDeb=(Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(venta));}
			 
				montoCred=Float.valueOf(TransferenciaScotia.montoTransferencia);	} 
		}	
		
		//-------------------------------------------------------------------------------------------------------
		String query1 = "SELECT * \r\n" + 
		 		"FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal    = 82\r\n" + 
		 		"AND mc.operacion     = 9973\r\n" + 
		 		"AND mc.producto   IN (2101, 2201)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.debitocredito = 'D'\r\n" + 
		 		"AND mc.moneda = '"+ monedaDeb +"' \r\n" + 
		 		"AND mc.cuenta      ='"+TransferenciaScotia.ctaDeb.substring(7, TransferenciaScotia.ctaDeb.length())+"'\r\n" + 
		 		"AND capitalrealizado = TO_NUMBER(" + montoDeb + ")\r\n" +   //String.format("%.02f",montoDeb)
		 		"AND mc.asiento    in\r\n" + 
		 		"(  SELECT asi.asiento\r\n" + 
		 		"  FROM banking.asientos asi\r\n" + 
		 		"  WHERE asi.operacion  IN (9973)\r\n" + 
		 		"  AND asi.estado        = 77\r\n" + 
		 		"  AND asi.iniusr        = 'S82'\r\n" + 
		 		"  AND asi.fechaproceso >= sysdate -1) order by mc.fechaproceso asc" ;
		 
		// System.out.println(query1);
		 ResultSet datosDB1 = Frmwrk.consultarBD(query1);
		 String Asiento1="";
			 while (datosDB1.next() == true)
			 {{{Asiento1 = datosDB1.getString("ASIENTO");
			// System.out.println("01 -"+ Asiento1); 
			 }}	}		 
		 datosDB1.close();
		// System.out.println("1 -"+ Asiento1);		 		 
		
		 String query2 = "SELECT * \r\n" + 
		 		"FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal    = 82\r\n" + 
		 		"AND mc.operacion     = 9973\r\n" + 
		 		"AND mc.producto   IN (2101, 2201)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.debitocredito = 'C'\r\n" + 
		 		"AND mc.moneda = '"+monedaCred+"' \r\n" + 
		 		"AND mc.cuenta      ='" + TransferenciaScotia.ctaCred.substring(7, TransferenciaScotia.ctaCred.length())+"'\r\n" + 
		 		"AND capitalrealizado between TO_NUMBER(" + (montoCred-1)  + ") and TO_NUMBER(" + (montoCred+1)  +  ")\r\n" +  //(df.format(montoCred+1))  + "' and '" + df.format((montoCred-1) -------String.format("%.02f",(montoCred-1))  + "' and '" + String.format("%.02f",(montoCred+1)) 
		 		" AND mc.asiento = '"+ Asiento1 + "' order by mc.fechaproceso asc";
		 
		 ResultSet datosDB2 = Frmwrk.consultarBD(query2);		 	
		// System.out.println(query2);
		 String Asiento2="";
		 while(datosDB2.next() == true)
		 { {{Asiento2 = datosDB2.getString("ASIENTO");
		// System.out.println("02 -"+ Asiento2);}
		 }	}	}		 
		 datosDB2.close();
		// System.out.println("2 -"+ Asiento2);
		 //Asiento2="1";			 
			 
		 if (Asiento1.equals(Asiento2) && !Asiento1.equals(""))
		 {Frmwrk.validacion="BIEN";
			 Frmwrk.logEvidencia(Config.globalCP, "Se valid� la transferencia en la base de datos. Asiento: " 
		 + Asiento1 + " Cuenta D�bito: " + TransferenciaScotia.ctaDeb + " Monto D�bito: " + String.format("%.02f",montoDeb) + " Cuenta Cr�dito: " + TransferenciaScotia.ctaCred + " Monto Cr�dito: " + String.format("%.02f",montoCred));
		 OK1=true;
		 }
		 else
		 {Frmwrk.validacion="MAL";
			 Frmwrk.logEvidencia(Config.globalCP, "Por alguna raz�n no se pudo validar la transferencia con el importe d�bito:" + String.format("%.02f",montoDeb) + " y el monto cr�dito: "+ String.format("%.02f",montoCred) 
		 + ". Por favor validar manualmente. Asientos: D�bito: "+ Asiento1 + " - Cr�dito: " + Asiento2 );	
		 OK1=false;}		
		 
		//-------------------------------------------------------------------------------------------------------
		 
		 if ((OK1 == true))
		 {return true; }
		 else
		 {return false;}
		 }
	 
	 
	 public void completarTransfPlaza() throws Exception
		{	
		// Config.esperar("etBenefAccount");
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
		 Thread.sleep(1000);c.tapTRP2();
		 Thread.sleep(1000);
		 Frmwrk.logEvidencia(Config.globalCP, "TP 2");
		 Thread.sleep(3000);c.tapTRP2();
		 
		 MobileElement ctac = (MobileElement) Config.driver.findElement(By.id("etBenefAccount"));
		 ctac.click();    
		 ctac.setValue("1234567890");
		 
		 Thread.sleep(2000);
		 MobileElement cta = (MobileElement) Config.driver.findElement(By.id("spnFromAccount"));
		// MobileElement cta = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[2]"));
		 cta.click();  
		 Thread.sleep(2000);
	//	 cta.click(); 
		// Thread.sleep(2000);
		// cta.click(); 
		// Thread.sleep(2000);
		 MobileElement ctasel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 ctasel.click();  
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.id("spnBenefiBank"));
		 bco.click();    
		 
		 MobileElement bcoSel;
		 
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 bcoSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }
		 else
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 bcoSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }	
		 
		 bcoSel.click(); 
		 
		 Thread.sleep(2000);	 	
		 
		 MobileElement nomAp = (MobileElement) Config.driver.findElement(By.id("etBenefName"));
		 nomAp.click();    
		 nomAp.setValue("Nombre y Apellido"); 
		 
	/*	 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();    
		 tel.setValue("098654321");
		 
		 MobileElement sucBen = (MobileElement) Config.driver.findElement(By.id("etBenefBranch"));
		 sucBen.click();    
		 sucBen.setValue("Casa Central");*/
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("etAmount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
/*		 MobileElement mot = (MobileElement) Config.driver.findElement(By.id("spnTransferReason"));
		 mot.click();  
		 MobileElement motSel = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 motSel.click();  */
		 		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.id("etReference"));
		 ref.click();    
		 ref.setValue("Prueba Plaza");	
		 
		 c.swipeV();	 c.swipeV();
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.id("etContactPhone"));
		 tel.click();    
		 tel.setValue("098654321");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "T�rminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();  
		 
		// Frmwrk.logEvidencia(Config.globalCP, "Error mail");
		 
		// MobileElement btnOK2 = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		// btnOK2.click();  
		 
		 Thread.sleep(2000);
		 c.swipeV();
		 Thread.sleep(10000);
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 c.swipeV();
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 
		 Thread.sleep(10000);
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transacci�n");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(5000);
		 /*
		 Frmwrk.logEvidencia(Config.globalCP, "Permite compartir el comprobante");
		 
		 MobileElement btn_share = (MobileElement) Config.driver.findElement(By.id("btnShare"));
		 btn_share.click(); 
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Opciones para compartir");
		 
		 c.tapTRP1();
		 Thread.sleep(5000);
		 Frmwrk.logEvidencia(Config.globalCP, "Permite compartir el comprobante 2(Pero presiono volver ahora)");
		 
		 //c.tapTRP3();
		  * 
		  */
		 MobileElement btn_volverrr = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		btn_volverrr.click(); 
		 Thread.sleep(5000);
		 Frmwrk.logEvidencia(Config.globalCP, "Volvimos al formulario de transferencias");
		 
		 }	
	 
	 public void guardarPlantillaTransfScotia() throws Exception
		{	
		 Config.esperar("edt_amount");
		 
		 MobileElement cboCtaDest = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView"));
		 cboCtaDest.click(); 

		 MobileElement selCtaDest = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
		 selCtaDest.click();
		 
		 c.swipeV();

		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("edt_amount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(180, 360));			 
		 
		 c.swipeV();
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("edt_transfer_ref"));
		 refe.click();    
		 refe.setValue("Prueba123");
		 
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("edt_pin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 
		 MobileElement btn_ops = (MobileElement) Config.driver.findElement(By.id("layout_btns"));
		 btn_ops.click(); 		 
			 
		 MobileElement guardarP= (MobileElement) Config.driver.findElement(By.id("btn_save_template"));
		 guardarP.click();
		 
		 MobileElement nomP = (MobileElement) Config.driver.findElement(By.id("edt_template_name"));
		 nomP.click();    
		 nomP.setValue("A_Nom_" + Frmwrk.obtenerFecha());
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Guardar plantilla");	
		 
		 MobileElement aceptarP= (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 aceptarP.click();
		 
		 MobileElement cargarPlantilla = (MobileElement) Config.driver.findElement(By.id("btn_load_template"));
		 cargarPlantilla.click();
		 
		 Config.esperar("btn_exit");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa la Plantilla nueva listada");	
		 
		 MobileElement close = (MobileElement) Config.driver.findElement(By.id("btn_exit"));
		 close.click();
		 		 
		 monto.clear();    
		 monto.setValue(Config.getRandomNumber(100, 400));	
		 		 
		 refe.clear();     
		 refe.setValue("PruebaBorra");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Borrador a guardar");
		 
		 c.backButton();
		 
		 MobileElement guardarB = (MobileElement) Config.driver.findElement(By.id("btn_save_draft"));
		 guardarB.click();
		 
		 Config.esperar("txt_title");
		 
		 MobileElement pendientes = (MobileElement) Config.driver.findElement(By.id("btn_pending"));
		 pendientes.click();
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa el borrador guardado");	
		 
		 }		 
	
	 public void completarTransfFirmante(Integer i) throws Exception
		{	
		 //////////clickear en el primer link de los pendientes
		 
		 Thread.sleep(25000);
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[" + i +"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Listado de transacciones pendientes");
		 
		 MobileElement primeroLista = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[" + i +"]"));
		 primeroLista.click(); 
		 		 
		// Config.esperar("tvTransactionType");
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Pantalla de confirmaci�n");
		 
		 MobileElement btn_back = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton"));
		 btn_back.click(); 
		 
		 Thread.sleep(3000);
		// Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]");
		 primeroLista.click(); 		
		 
		 Thread.sleep(3000);
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click();    
		 pin.setValue(Config.globalPin);		 
			 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");	
			 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnAuthTransaction"));
		 btn_confirmar.click(); 
		 
		 //Config.esperar("btnPositive");
		 Thread.sleep(8000);
		 Frmwrk.logEvidencia(Config.globalCP, "Transferencia confirmada");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Transferencia confirmada 2");
		 Thread.sleep(3000);
		 btn_back.click(); 
		 
	//	 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
	//	 btn_ok.click(); 
		 
		// btn_back.click(); 
		 Thread.sleep(5000);
		 Frmwrk.logEvidencia(Config.globalCP, "Transacci�n se actualiz� en la lista");
		 
		 }	
	 
	 public void enviarPlantillaTransfScotia() throws Exception
		{	
		 Config.esperar("btnGetTransferList");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario Transferencias");	
		 
		 MobileElement btnTempl = (MobileElement) Config.driver.findElement(By.id("btnGetTransferList"));
		 btnTempl.click(); 
		 
		 Config.esperar("tvTemplateTransfer");		 

		 Frmwrk.logEvidencia(Config.globalCP, "Lista plantillas de transferencias");
		 
		 Thread.sleep(6000);
		 MobileElement seltr1;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		 seltr1 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[1]"));
		 }
		 else
		 {
		  seltr1 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]"));
		 }
		  seltr1.click();
		  Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos primer elemento de la lista");
		 
		 MobileElement btncerr = (MobileElement) Config.driver.findElement(By.id("btnUnselectTrasnfer"));
		 btncerr.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Deseleccionamos plantilla (haciendo tap en la cruz)");
		 
		 btnTempl = (MobileElement) Config.driver.findElement(By.id("btnGetTransferList"));
		 btnTempl.click();
		 
		 Config.esperar("tvTemplateTransfer");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Lista plantillas de transferencias");
		 
		 MobileElement seltr5;
		 Thread.sleep(6000);
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		 seltr5 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[5]"));
		 }
		 else
		 {
		 seltr5 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]"));
		 }
		 seltr5.click();
		 
		 Thread.sleep(4000);
		 Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos quinto elemento de la lista");
		 
		 c.swipeV(); c.swipeV(); c.swipeV();
		 Thread.sleep(4000);
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia");
		 }	
	 
	 public void enviarPlantillaPlaza() throws Exception
		{	
		 Config.esperar("btnGetTransferList");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario Transferencias");	
		 
		 MobileElement btnTempl = (MobileElement) Config.driver.findElement(By.id("btnGetTransferList"));
		 btnTempl.click(); 
		 
		 Config.esperar("tvTemplateTransfer");	
		 
		 Thread.sleep(7000);
		 
		 MobileElement btnplz = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[2]/android.widget.TextView"));
		 btnplz.click(); 
		 
		 Thread.sleep(3000);
		 Frmwrk.logEvidencia(Config.globalCP, "Lista plantillas de transferencias");	
		 
		 MobileElement seltr1;
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		 seltr1 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.View[1]"));
		 }
		 else
		 {
		  seltr1 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]"));
		 }
		  seltr1.click();
		 
		 Thread.sleep(7000);
		  
		 Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos primer elemento de la lista");
		 
		 c.swipeVDown();c.swipeVDown();c.swipeVDown();		 
		 
		 MobileElement btncerr = (MobileElement) Config.driver.findElement(By.id("btnUnselectTrasnfer"));
		 btncerr.click(); 
		 Thread.sleep(2000);
		 
		 c.swipeVDown();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Deseleccionamos plantilla (haciendo tap en la cruz)");
		 
		 btnTempl = (MobileElement) Config.driver.findElement(By.id("btnGetTransferList"));
		 btnTempl.click();
		 
		 Config.esperar("tvTemplateTransfer");	
		 Thread.sleep(3000);
		 
		 btnplz = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[2]/android.widget.TextView"));
		 btnplz.click(); 

		 Frmwrk.logEvidencia(Config.globalCP, "Lista plantillas de transferencias");
		 
		 MobileElement seltr5;
		 Thread.sleep(7000);
		 
		 c.swipeVDown();
			
		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {
		 seltr5 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView"));
		 }
		 else
		 {
		 seltr5 = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ViewAnimator/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView"));
		 }
		 seltr5.click();
		 
		 //Thread.sleep(2000);
		 Thread.sleep(7000);

		 
		 Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos cuarto elemento de la lista");
		 
		 c.swipeV(); c.swipeV(); c.swipeV();c.swipeV();c.swipeV();
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia");
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.id("btnTransfer"));
		 btn.click();   
		 
		 Config.esperar("btnPositive");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "T�rminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btnOK.click();  
		 
		 Thread.sleep(7000);
		 //c.swipeV();c.swipeV(); lo comente yo hoy 18/11
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("etPinTransfer"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 c.swipeV();
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.id("btnSubmitTransfer"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("btnPositive");
		 Thread.sleep(10000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); 
		 
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Permite compartir el comprobante");
		 
		 MobileElement btn_share = (MobileElement) Config.driver.findElement(By.id("btnShare"));
		 btn_share.click(); 
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Opciones para compartir");
		 
		 c.tapTRP1();
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "Permite compartir el comprobante 2(Pero presiono volver ahora)");
		 
		// c.tapTRP3();
		 MobileElement btn_volverrr = (MobileElement) Config.driver.findElement(By.id("btnBack"));
		 btn_volverrr.click(); 
		 Thread.sleep(5000);
		 Frmwrk.logEvidencia(Config.globalCP, "Volvimos al formulario de transferencias");
		 
		 }		 
}
