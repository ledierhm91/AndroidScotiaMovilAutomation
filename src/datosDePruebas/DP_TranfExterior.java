package datosDePruebas;

import java.sql.ResultSet;
import framework.Frmwrk;


public class DP_TranfExterior{	


		// Datos transferencia exterior
		public String monto; 
		public String bic; 
		public String cuentaCred; 
		public String nombreBef;
		public String referencia; 
		public String telefono;
		public String mail; 
		public String nombre; 
		public String dirBef; 
		public String ciudadBef;
		public String todos;

	 public void obtenerDatos(String Origen, Integer juegoDatos) throws Exception
		{	
		 // Origen: T = Base de datos. D = Default
		 // Caso: numero de caso de prueba 
		 
		 if (Origen == "D")	 
			 {		 	  
			 switch (juegoDatos) {
	            case 1:    	
	            	monto = "101.50";
	        		bic = "NACNUS33XXX";
	        		cuentaCred = "ABC1234567";
	        		nombreBef ="Juan Prueba Automatica 1";
	        		referencia ="Campo 70 Automatico EXT 1";
	        		telefono ="091222544";
	        		mail ="automatico1_@mail.com.uy";
	        		nombre ="plant_ext";
	        		dirBef ="Direccion Benef 1";
	        		ciudadBef ="Ciudad Benef 1";	
				  			break;
	            case 2:  	
	            	monto = "201.50";
	        		bic = "NACNUS33XXX";
	        		cuentaCred = "ABC1234567";
	        		nombreBef ="Juan Prueba Automatica 2";
	        		referencia ="Campo 70 Automatico EXT 2";
	        		telefono ="091222544";
	        		mail ="automatico2_@mail.com.uy";
	        		nombre ="plant_ext";
	        		dirBef ="Direccion Benef 2";
	        		ciudadBef ="Ciudad Benef 2";
	  						break;
			 }

			 } else if  (Origen == "T")	
				 
			 {		 
				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='TR_EXT' and nro_set=" + juegoDatos;
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
			 {bic = datosDB.getString("VALOR");}
			 else if  (datosDB.getString("CAMPO").equals("DIR_BEF"))	
			 {dirBef = datosDB.getString("VALOR");}
			 else if  (datosDB.getString("CAMPO").equals("CIUDAD_BEF"))	
			 {ciudadBef = datosDB.getString("VALOR");}}				 
		 datosDB.close();
		 
			 }	
		 todos = monto + "_" +  bic + "_" +  cuentaCred + "_" +  nombreBef + "_" +  dirBef + "_" +  ciudadBef + "_" + referencia + "_" +  telefono + "_" +  mail;
		 }	
	
}
