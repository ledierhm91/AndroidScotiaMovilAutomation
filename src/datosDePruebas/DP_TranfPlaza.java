package datosDePruebas;
import java.sql.ResultSet;

import framework.Frmwrk;


public class DP_TranfPlaza{	


		// Datos transferencia plaza
		public String monto;
		public String bic; 			
		public String cuentaCred;		
		public String nombreBef;		
		public String referencia; 
		public String telefono;	
		public String mail;		
		public String nombre;	
		public String todos;

	 public void obtenerDatos(String Origen, Integer juegoDatos) throws Exception
		{	
		 // Origen: T = Base de datos. D = Default
		 // Caso: numero de caso de prueba 
		 
		 if (Origen == "D")	 
			 {		 	  
			 switch (juegoDatos) {
	            case 1:    	
	            	 	monto = "450.50";
	            	 	bic = "BSCHUYMMXXX";
	            	 	cuentaCred = "ABC1234567";
	            	 	nombreBef ="Juan Prueba Automatica";
	            	 	referencia ="Campo 70 Automatico";
	            	 	telefono ="091222544";
	            	 	mail ="automatico_@mail.com.uy";
	            	 	nombre ="nombre_plantilla";
				  			break;
	            case 2:  	
	            		monto = "220.50";
	            		bic = "BSCHUYMMXXX";
	            		cuentaCred = "ABC1234567";
	            		nombreBef ="Juan Prueba Automatica";
	            		referencia ="Campo 70 Automatico";
	            		telefono ="091222544";
	            		mail ="automatico_@mail.com.uy";
	            		nombre ="nombre_plantilla";
	  						break;
			 }
			 
			 } else if  (Origen == "T")	
				 
				{
				 
				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='TR_PLZ' and nro_set=" + juegoDatos;
							 ResultSet datosDB = Frmwrk.consultarBD(query);
											 
							 while (datosDB.next()) {					 
								 if (datosDB.getString("CAMPO").equals("MONTO"))	 
								 {monto = datosDB.getString("VALOR");} 
								 else if  (datosDB.getString("CAMPO").equals("REFERENCIA"))	
								 {referencia = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("NOMBRE_BEF"))	
								 {nombreBef = datosDB.getString("VALOR");} 
								 else if  (datosDB.getString("CAMPO").equals("NOMBRE"))	
								 {nombre = datosDB.getString("VALOR");} 
								 else if  (datosDB.getString("CAMPO").equals("TELEFONO"))	
								 {telefono = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("MAIL"))	
								 {mail = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("CUENTA_CRED"))	
								 {cuentaCred = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("BIC"))	
								 {bic = datosDB.getString("VALOR");}}				 
							 datosDB.close(); 
							 
				todos = monto +"_" + bic +"_" + cuentaCred +"_" + nombreBef +"_" + referencia +"_" +  telefono + "_" + mail;
				}	

		 }	
	
}
