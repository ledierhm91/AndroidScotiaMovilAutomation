package datosDePruebas;

import java.sql.ResultSet;
import framework.Frmwrk;


public class DP_Gastos{	


		// Datos Gastos
		public String monto; 
		public String referencia; 
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
	            	monto = "101.50";
	        		referencia = "0";
	        		nombre = "pl gastos 1";
				  			break;
	            case 2:  	
	            	monto = "301.50";
	        		referencia = "0";
	        		nombre = "pl gastos 2";
	  						break;
			 }

			 } else if  (Origen == "T")	{
				 
				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='PAGOGASTOS' and nro_set=" + juegoDatos;
				 ResultSet datosDB = Frmwrk.consultarBD(query);
								 
				 while (datosDB.next()) {					 
					 if (datosDB.getString("CAMPO").equals("MONTO"))	 
					 {monto = datosDB.getString("VALOR");} 
					 else if  (datosDB.getString("CAMPO").equals("REFERENCIA"))	
					 {referencia = datosDB.getString("VALOR");}
					 else if  (datosDB.getString("CAMPO").equals("NOMBRE"))	
					 {nombre = datosDB.getString("VALOR");} }				 
				 datosDB.close(); 
				 
			 todos = monto + "_" + referencia  + "_" + nombre;
					 }	 
				 
		 
		 }	
	
}
