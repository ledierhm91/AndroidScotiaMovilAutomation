package datosDePruebas;
import java.sql.ResultSet;
import framework.Frmwrk;


public class DP_Login{	

	// Datos Login
		public  String usuario; 
		public  String pin; 
		public  String password; 
		public  String todos;
		

	 public void obtenerDatos(String Origen, Integer juegoDatos) throws Exception
		{	
		 // Origen: T = Base de datos. D = Default
		 // Caso: numero de caso de prueba 
		 
		 if (Origen == "D")	 
			 {		 	  
			 switch (juegoDatos) {
	            case 1:    	
	            	usuario = "29601625"; //41337169
	        		pin = "1234";
	        		password = "Testing21!";
				  			break;
	            case 2:  	
	            	usuario = "30061266";
	            	pin = "1212";
	            	password = "Testing.03";
	  						break;
	            case 3:  	
	            	usuario = "32390128";///"27704514";//"28335764"; PLAZO FIJO - TARJETA, 32390128
	        		pin = "1234";
	        		password = "Testing02";
	  						break;
	            case 4:  	
	            	usuario = "39964566";
	        		pin = "1234";
	        		password = "Testing01";
	  						break;	  						
	            case 5:  	
	            	usuario = "18689939";// "13573747",  ------"28335764"; ///usar T1 o T2 o T3 segun se vayan pagando PRESTAMOS
	            						// "40894302" esta pronto para ser configurado como firmante para validar lo de firma de prestamo	
	        		pin = "1234";
	        		password = "Testing01";
	  						break;
	            case 6:  	
	            	usuario = "27601338"; // Firmante 1
	        		pin = "1234";
	        		password = "Testing01";
	  						break;
	            case 7:  	
	            	usuario = "36380351"; // Firmante 2
	        		pin = "1234";
	        		password = "Testing01";
	  						break;
	            case 8:  	
	            	usuario = "27051529";
	        		pin = "1234";
	        		password = "Testing.07";
	  						break;
	            case 9:  	
	            	usuario = "1000000441289";
	        		pin = "1234";
	        		password = "Testing01";
	  						break;
	            case 10:  	
	            	usuario = "39126538";
	        		pin = "1234";
	        		password = "Testing01";
	  						break;
	  						
	            case 11:  	
	            	//usuario = "28335764";
	        		//pin = "1598";
	        		//password = "Testing.06";
	            	
	            	usuario = "27051529";
	        		pin = "1234";
	        		password = "Testing.07";
	  						break;	
	  						
	            case 12:  	
	            	usuario = "57251464";
	        		pin = "1234";
	        		password = "Testing01";
	  						break;
	  						
	            case 13:  	
	            	usuario = "33344396";
	        		pin = "1234";
	        		password = "Password123..";
	  						break;
			 }

			 } else if  (Origen == "T")	{
				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='LOGIN' and nro_set=" + juegoDatos;
				 ResultSet datosDB = Frmwrk.consultarBD(query);
								 
				 while (datosDB.next()) {					 
					 if (datosDB.getString("CAMPO").equals("USUARIO"))	 
					 {usuario = datosDB.getString("VALOR");} 
					 else if  (datosDB.getString("CAMPO").equals("PIN"))	
					 {pin = datosDB.getString("VALOR");}
					 else if  (datosDB.getString("CAMPO").equals("PASS"))	
					 {password = datosDB.getString("VALOR");} }				 
				 datosDB.close();
			 }
		 
		 todos = usuario +"_" + pin +"_"+ password;
		 
		 }	
	
}
