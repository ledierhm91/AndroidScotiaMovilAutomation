	package datosDePruebas;

	import java.sql.ResultSet;
	import framework.Frmwrk;


public class DP_TranfLote{	


		// Datos transferencia exteriro
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
		
		public String monto2; 
		public String bic2; 
		public String cuentaCred2; 
		public String nombreBef2;
		public String archivo;
		
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
	        		monto2 = "102.75";
	        		bic2 = "ABFLHKHHXXX";
	        		cuentaCred2 = "ABC123456789";
	        		nombreBef2 ="Pepe Prueba Automatica 1";
	        		archivo=System.getProperty("user.dir") + "\\archivos\\listado_de_transferencias_lote.csv";
				  			break;
	            case 2:  	
	            	monto = "201.50";
	        		bic = "BSCHUYMMXXX";
	        		cuentaCred = "ABC1234567";
	        		nombreBef ="Juan Prueba Automatica 2";
	        		referencia ="Campo 70 Automatico EXT 2";
	        		telefono ="091222544";
	        		mail ="automatico2_@mail.com.uy";
	        		nombre ="plant_ext";
	        		dirBef ="Direccion Benef 2";
	        		ciudadBef ="Ciudad Benef 2";
	        		monto2 = "202.75";
	        		bic2 = "ABDIEGCASWH";
	        		cuentaCred2 = "ABC123456789";
	        		nombreBef2 ="Pepe Prueba Automatica 2";
	        		archivo=System.getProperty("user.dir") + "\\archivos\\listado_de_transferencias_lote.csv";
	  						break;
			 }

			 } else if  (Origen == "T")	{
				 {
					 
					 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='TR_LOT' and nro_set=" + juegoDatos;
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
									 {ciudadBef = datosDB.getString("VALOR");}
									 else if  (datosDB.getString("CAMPO").equals("MONTO2"))	
									 {monto2 = datosDB.getString("VALOR");}
									 else if  (datosDB.getString("CAMPO").equals("BIC2"))
									 {bic2 = datosDB.getString("VALOR");}
									 else if  (datosDB.getString("CAMPO").equals("CUENTA_CRED2"))	
									 {cuentaCred2 = datosDB.getString("VALOR");}
									 else if  (datosDB.getString("CAMPO").equals("NOMBRE_BEF2"))	
									 {nombreBef2 = datosDB.getString("VALOR");} 
									 else if  (datosDB.getString("CAMPO").equals("ARCHIVO"))	
									 {archivo = System.getProperty("user.dir") +  datosDB.getString("VALOR");}
								 }				 
								 datosDB.close(); }	
				 todos =  monto + "_" +  bic + "_" +  cuentaCred + "_" +  nombreBef + "_" +  dirBef + "_" +  ciudadBef + "_" + referencia + "_" +  telefono + "_" +  mail
						 + "_" +  monto2 + "_" +  bic2 + "_" +  cuentaCred2 + "_" +  nombreBef2;
					
			 }
		 
		 }	
	
}
