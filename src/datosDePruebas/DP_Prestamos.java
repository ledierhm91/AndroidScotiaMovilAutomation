package datosDePruebas;
import java.sql.ResultSet;
import framework.Frmwrk;


public class DP_Prestamos{	


		// Datos Prestamo
		public String nroPrestamo; 
		public String cantCuotas; 
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
	            	nroPrestamo = "5001973";
	            	cantCuotas = "1";
	            	nombre = "plantillaPrestamo";
	            	
				  			break;
			 }

			 } else if  (Origen == "T")	{
				 

				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='PAGOPRESTAMO' and nro_set=" + juegoDatos;
				 ResultSet datosDB = Frmwrk.consultarBD(query);
								 
				 while (datosDB.next()) {					 
					 if (datosDB.getString("CAMPO").equals("NROPRESTAMO"))	 
					 {nroPrestamo = datosDB.getString("VALOR");} 
					 else if  (datosDB.getString("CAMPO").equals("CANTCUOTAS"))	
					 {cantCuotas = datosDB.getString("VALOR");} 
					 else if  (datosDB.getString("CAMPO").equals("NOMBRE"))	
					 {nombre = datosDB.getString("VALOR");}}				 
				 datosDB.close(); }	 
		 
		
		 	todos = nroPrestamo + "_" + cantCuotas + "_" + nombre;
			
		 }
		 }	
