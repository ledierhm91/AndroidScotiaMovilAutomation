package datosDePruebas;
import java.sql.ResultSet;

import framework.Frmwrk;


public class DP_SolicitudChequera{	


		// Datos solicitud de chequera
					
		public String referencia; 
		public String telefono;	
		public String mail;		
		public String nombre;	
		public String cantidad;
		public String todos;

	 public void obtenerDatos(String Origen, Integer juegoDatos) throws Exception
		{	
		 // Origen: T = Base de datos. D = Default
		 // Caso: numero de caso de prueba 
		 
		 if (Origen == "D")	 
			 {		 	  
			 switch (juegoDatos) {
	            case 1:    		
	            	 	telefono ="091222544";
	            	 	mail ="automatico_@mail.com.uy";
	            	 	nombre ="nombre_plantilla";
	            	 	cantidad = "1";
				  			break;
	            case 2:  	
	            		telefono ="091222544";
	            		mail ="automatico_@mail.com.uy";
	            		nombre ="nombre_plantilla";
	            		cantidad = "2";
	  						break;
			 }
			 
			 } else if  (Origen == "T")	
				 
				{
				 
				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='SOL_CHE' and nro_set=" + juegoDatos;
							 ResultSet datosDB = Frmwrk.consultarBD(query);
											 
							 while (datosDB.next()) {					 
								 if   (datosDB.getString("CAMPO").equals("NOMBRE"))	
								 {nombre = datosDB.getString("VALOR");} 
								 else if  (datosDB.getString("CAMPO").equals("TELEFONO"))	
								 {telefono = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("CANTIDAD"))	
								 {cantidad = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("MAIL"))	
								 {mail = datosDB.getString("VALOR");}}				 
							 datosDB.close(); 
							 
				todos = telefono +"_" + mail +"_" + nombre +"_" + cantidad ;
				}	

		 }	
	
}
