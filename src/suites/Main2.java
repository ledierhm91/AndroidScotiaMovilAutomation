/*
 * Classname: Suite 
 * 
 * Version information: 1.0
 *
 * Date: April 22nd 2015
 * 
 * Copyright notice
 */

package suites;

import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import framework.Config;

public class Main2{	
			
	@Test
	public static void main(String args[]) throws InterruptedException {
		  
		System.out.println("Leyendo argumentos....");        
     
        if(args.length == 0){
            System.out.println("Por favor ingresar un argumento!");
            System.exit(0);
        }   
        
      
        //---------------------------------------------Juego de datos-------------------------------------------------------
        String argumentoDP = (args[1]);        
        System.out.println("Argumento le�do = " + argumentoDP);
        
        Thread.sleep(3000);
        
        if (argumentoDP.equals("B")) {Config.globalJD="T";} 
        else if (argumentoDP.equals("D")) {	Config.globalJD="D";}        
        else {
        System.out.println("Por favor ingresar un argumento v�lido! B = para datos desde la Base de Datos, D = para utilizar datos por defecto(sin Base de Datos)");
        }       
        Thread.sleep(3000);
        
      //---------------------------------------------Navegador-------------------------------------------------------
        
        String argumentoBrowser = (args[2]);        
        System.out.println("Argumento le�do = " + argumentoBrowser);
        
        Thread.sleep(3000);
        
        if (argumentoBrowser.equals("C")) {Config.globalBrowser="C";} 
        	else if (argumentoBrowser.equals("F")) {Config.globalBrowser="F";}	  		  
	  		else if (argumentoBrowser.equals("I")) {Config.globalBrowser="I";}
        else {
        System.out.println("Por favor ingresar un argumento v�lido! C = Chrome, F = Firefox, I = Internet Explorer");
        }       
        Thread.sleep(3000);
        
      //---------------------------------------------Suite-------------------------------------------------------
        String argumentoSuite = (args[0]);        
        System.out.println("Argumento le�do = " + argumentoSuite);
        
        Thread.sleep(3000);
        
        if (argumentoSuite.equals("H")) {
        	JUnitCore junit = new JUnitCore();
	  		  junit.addListener(new TextListener(System.out));
	  		  Result result = junit.run(ASPrincipalHPaquete.class); 
	  		  if (result.getFailureCount() > 0) {
	  		    System.out.println("Tests fallaron.");
	  		    System.exit(1);
	  		  } else {
	  		    System.out.println("Tests finalizaron correctamente.");
	  		    System.exit(0);
	  		  }
        } else if (argumentoSuite.equals("T")) {
        	 JUnitCore junit2 = new JUnitCore();
	  		  junit2.addListener(new TextListener(System.out));
	  		  Result result2 = junit2.run(ASPrincipalPaquete.class); 
	  		  if (result2.getFailureCount() > 0) {
	  		    System.out.println("Tests fallaron.");
	  		    System.exit(1);
	  		  } else {
	  		    System.out.println("Tests finalizaron correctamente.");
	  		    System.exit(0);
	  		  }
        } else {
        	System.out.println("Por favor ingresar un argumento v�lido! H = para pruebas de humo, T = para ejecutar la suite completa");
        }       
        Thread.sleep(3000);
        
	}		
	
	}
	