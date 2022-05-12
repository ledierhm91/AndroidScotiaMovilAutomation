package datosDePruebas;
import java.sql.ResultSet;
import framework.Frmwrk;


public class DP_Proveedores{	

	    public  String monto;
		public  String cuenta;
		public  String direccion;
		public  String mail;	
		public  String comentario;	
		public  String leyenda;
		public  String referencia;	
		public  String archivo;	
		public  String nroProv;
		public  String rutProv;
		public  String nombreProv;
		public  String dirProv;
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
	            	cuenta="2201000000362698900";
	            	direccion = "Calle de la Prueba Automatica";
	            	mail = "proveedor.auto@mail.com.uy";	
	            	comentario = "leyenda proveedor";	
	            	referencia = "pago proveedor";	
	            	archivo = System.getProperty("user.dir") + "\\archivos\\ArchivoProveedores.txt";	
	            	nombreProv ="Juan Prueba Automatica";
	            	nroProv = "1001";
	            	rutProv = "213164210010";
	            	dirProv = "Calle de la Prueba Automatica";
	            	nombre ="p_prov";
	            	leyenda = "l2";
	            	nroFac ="11";
	            	
				  			break;
	            case 2:  	
	            	monto = "2010";
	            	cuenta="2201000000362698900";
	            	direccion = "Calle de la Prueba Automatica";
	            	mail = "proveedor.auto@mail.com.uy";	
	            	comentario = "leyenda proveedor 2";	
	            	referencia = "pago proveedor";	
	            	archivo = System.getProperty("user.dir") + "\\archivos\\ArchivoProveedores.txt";	
	            	nombreProv ="Juan Prueba Automatica";
	            	nroProv = "2002";
	            	rutProv = "213164210010";
	            	dirProv = "Calle de la Prueba Automatica";
	            	nombre ="p_prov";
	            	leyenda = "l2";
	            	nroFac ="22";
	  						break;
			 }

			 } else if  (Origen == "T")	
{ 
				 
				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='PROVEEDOR' and nro_set=" + juegoDatos;
							 ResultSet datosDB = Frmwrk.consultarBD(query);
											 
							 while (datosDB.next()) {					 
								 if (datosDB.getString("CAMPO").equals("MONTO"))	 
								 {monto = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("REFERENCIA"))	
								 {referencia = datosDB.getString("VALOR");}
								 
								 else if  (datosDB.getString("CAMPO").equals("NOMBREPROVEDOR"))	
								 {nombreProv = datosDB.getString("VALOR");} 
								 
								 else if  (datosDB.getString("CAMPO").equals("NOMBRE"))	
								 {nombre = datosDB.getString("VALOR");} 
								 else if  (datosDB.getString("CAMPO").equals("ARCHIVO"))	
								 {archivo = System.getProperty("user.dir") + datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("MAIL"))	
								 {mail = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("CUENTA"))	
								 {cuenta = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("NROFAC"))	
								 {nroFac = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("DIRECCION"))	
								 {dirProv = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("RUTPROV"))	
								 {rutProv = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("COMENTARIO"))	
								 {comentario = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("LEYENDA"))	
								 {leyenda = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("DIRECCION"))	
								 {direccion = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("DIRPROV"))	
								 {dirProv = datosDB.getString("VALOR");}
								 else if  (datosDB.getString("CAMPO").equals("NROPROV"))	
								 {nroProv = datosDB.getString("VALOR");}
							 }
							 datosDB.close();  }
		 todos = referencia + "_" + monto + "_" + cuenta + "_" + nroProv + "_" + rutProv + "_" + dirProv + "_" + mail + "_" + nroFac + "_" + comentario + "_" + leyenda;
		 }	}
	

