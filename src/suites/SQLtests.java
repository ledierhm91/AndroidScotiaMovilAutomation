package suites;

import java.sql.ResultSet;
import org.junit.Test;
import framework.Frmwrk;

public class SQLtests  {
	
	@Test
	public void execute() throws Exception
	{try
		{			
			Frmwrk.conectarBD();
			
			String query = "select sysdate from dual";
			 System.out.println(query);
			 ResultSet datosDB = Frmwrk.consultarBD(query);
			 if (datosDB.next() == true)
			 {{{System.out.println(datosDB.getString("SYSDATE"));
			 System.out.println("anduvo???");}}	}
			 datosDB.close();
			
			String query1 = "SELECT * \r\n" + 
			 		"FROM banking.movimientos_contables mc\r\n" + 
			 		"WHERE mc.sucursal    = 82\r\n" + 
			 		"AND mc.operacion     = 9973\r\n" + 
			 		"AND mc.producto   IN (2101, 2201)\r\n" + 
			 		"AND mc.fechaproceso >= sysdate -5\r\n" + 
			 		"AND mc.debitocredito = 'D'\r\n" + 
			 		"AND mc.moneda = '0' \r\n" + 
			 		"AND mc.cuenta      ='364455300'\r\n" + 
			 //		"AND capitalrealizado = TO_NUMBER(" + "77.84" + ")\r\n" +   
			 		"AND mc.asiento    in\r\n" + 
			 		"(  SELECT asi.asiento\r\n" + 
			 		"  FROM banking.asientos asi\r\n" + 
			 		"  WHERE asi.operacion  IN (9973)\r\n" + 
			 		"  AND asi.estado        = 77\r\n" + 
			 		"  AND asi.iniusr        = 'S82'\r\n" + 
			 		"  AND asi.fechaproceso >= sysdate -5) order by mc.fechaproceso asc" ;
			 
			 System.out.println(query1);
			 ResultSet datosDB1 = Frmwrk.consultarBD(query1);
			 String Asiento1="";
			 while (datosDB1.next() == true)
			 {{{Asiento1 = datosDB1.getString("ASIENTO");
			 System.out.println("01 -"+ Asiento1); 
			 }}	}
				 
			 datosDB1.close();
			 System.out.println("1 -"+ Asiento1);			 		 
			 
			 String query2 = "SELECT * \r\n" + 
			 		"FROM banking.movimientos_contables mc\r\n" + 
			 		"WHERE mc.sucursal    = 82\r\n" + 
			 		"AND mc.operacion     = 9973\r\n" + 
			 		"AND mc.producto   IN (2101, 2201)\r\n" + 
			 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
			 		"AND mc.debitocredito = 'C'\r\n" + 
			 		"AND mc.moneda = '"+ "2225" +"' \r\n" + 
			 		"AND mc.cuenta      ='" + "364455300"+"'\r\n" + 
			 		"AND capitalrealizado between TO_NUMBER(" + (2.5-1)  + ") and TO_NUMBER(" + (2.5+1)  +  ")\r\n" +  //(df.format(montoCred+1))  + "' and '" + df.format((montoCred-1) -------String.format("%.02f",(montoCred-1))  + "' and '" + String.format("%.02f",(montoCred+1)) 
			 		" AND mc.asiento = '"+ Asiento1 + "' order by mc.fechaproceso asc";
			 
			/*  SELECT * 
			  FROM banking.movimientos_contables mc
			  WHERE mc.sucursal    = 82
			  AND mc.operacion     = 9973
			  AND mc.producto   IN (2101, 2201)
			  AND to_char(mc.fechaproceso,'dd/mm/yyyy')= to_char(sysdate,'dd/mm/yyyy')
			  AND mc.debitocredito = 'C'
			  AND mc.moneda = '2225' 
			  AND mc.cuenta      ='364455300'
			  AND capitalrealizado between TO_NUMBER(1.3481145) and TO_NUMBER(3.3481145)
			  AND mc.asiento = '1000005' ;*/

			 
			 ResultSet datosDB2 = Frmwrk.consultarBD(query2);		 	
			 System.out.println(query2);
			 String Asiento2="";
			 while(datosDB2.next() == true)
			 { {{Asiento2 = datosDB2.getString("ASIENTO");
			 System.out.println("02 -"+ Asiento2);}}	}			
				 
			 datosDB2.close();
			 System.out.println("2 -"+ Asiento2);
					  
			Frmwrk.cerrarConexionBD();
			}		
	catch(Exception ex) 	
	{	
		Frmwrk.cerrarConexionBD();
	    System.out.println(Frmwrk.logError(ex));	    
	}
	   }
}




