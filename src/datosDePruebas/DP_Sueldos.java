package datosDePruebas;
import java.sql.ResultSet;
import framework.Frmwrk;


public class DP_Sueldos{	

		public  String monto;
		public  String cuentaSueldo;
		public  String direccion;
		public  String mail;	
		public  String comentario;	
		public  String leyenda;
		public  String referencia;	
		public  String archivo;	
		public  String nroBef;
		public  String rutBef;
		public  String nombreBef;
		public  String dirBef;
		public  String nombre;
		public  String nroFac;
		public  String todos;
		
	

	 public void obtenerDatos(String Origen, Integer juegoDatos) throws Exception
		{	
		 // Origen: T = Base de datos. D = Default
		 // Caso: numero de caso de prueba 
		 
		 if (Origen == "D")	 
			 {		 	  
			 switch (juegoDatos) {
	            case 1:    
	            	monto = "2010";
	            	cuentaSueldo="2201000000362698900";
	            	direccion = "Calle de la Prueba Automatica";
	            	mail = "sueldo.auto@mail.com.uy";	
	            	comentario = "leyenda Sueldo";	
	            	referencia = "pago Sueldo";	
	            	archivo = System.getProperty("user.dir") + "\\archivos\\ArchivoSueldos.txt";	
	            	nombreBef ="Juan Prueba Automatica";
	            	nroBef = "1001";
	            	rutBef = "213164210010";
	            	dirBef = "Calle de la Prueba Automatica";
	            	nombre ="p_sueldo";
	            	leyenda = "l2";
	            	nroFac ="11";
	            	
				  			break;
	            case 2:  	
	            	monto = "2010";
	            	cuentaSueldo="2201000000362698900";
	            	direccion = "Calle de la Prueba Automatica";
	            	mail = "sueldo.auto@mail.com.uy";	
	            	comentario = "leyenda Sueldo";	
	            	referencia = "pago Sueldo";	
	            	archivo = System.getProperty("user.dir") + "\\archivos\\ArchivoSueldos.txt";	
	            	nombreBef ="Juan Prueba Automatica";
	            	nroBef = "2002";
	            	rutBef = "213164210010";
	            	dirBef = "Calle de la Prueba Automatica";
	            	nombre ="p_sueldo";
	            	leyenda = "l2";
	            	nroFac ="22";
	  						break;
			 }

			 } else if  (Origen == "T")	{ 
				 
				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='SUELDO' and nro_set=" + juegoDatos;
							 ResultSet datosDB = Frmwrk.consultarBD(query);
											 
							 while (datosDB.next()) {					 
								 if (datosDB.getString("CAMPO").equals("MONTO"))	 
								 {monto = datosDB.getString("VALOR");} 
								 
								 else if  (datosDB.getString("CAMPO").equals("REFERENCIA"))	
								 {referencia = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("NOMBREBEF"))	
								 {nombreBef = datosDB.getString("VALOR");} 
								 
								 else if  (datosDB.getString("CAMPO").equals("NOMBRE"))	
								 {nombre = datosDB.getString("VALOR");} 
								 
								 else if  (datosDB.getString("CAMPO").equals("ARCHIVO"))	
								 {archivo = System.getProperty("user.dir") + datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("MAIL"))	
								 {mail = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("CUENTA"))	
								 {cuentaSueldo = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("NROFAC"))	
								 {nroFac = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("DIRECCION"))	
								 {dirBef = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("RUTBEF"))	
								 {rutBef = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("COMENTARIO"))	
								 {comentario = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("LEYENDA"))	
								 {leyenda = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("DIRECCION"))	
								 {direccion = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("DIRBEF"))	
								 {dirBef = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("NROBEF"))	
								 {nroBef = datosDB.getString("VALOR");}
							 }
							 datosDB.close(); } 
		todos = referencia + "_" + monto + "_" + cuentaSueldo + "_" + nroBef + "_" + rutBef + "_" + dirBef + "_" + mail + "_" + nroFac + "_" + comentario + "_" + leyenda; 
		}
	 }	 
	
