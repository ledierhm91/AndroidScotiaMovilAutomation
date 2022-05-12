package framework;

	

public class DatosDePrueba {
	

	
	//usuario 1 - Transferencias, pagos a proveedores, pagos de sueldo
	public static String usr1 = "40894302";
	public static String pin1 = "1234";
	public static String pwd1 = "Testing01";
	
	public static String usr2 = "30692051";
	public static String pin2 = "1234";
	public static String pwd2 = "Segurodigital";
	
	public static String usr3 = "35992977";
	public static String pin3 = "1234";
	public static String pwd3 = "Testing01";
	

	// Datos tipos archivos

	public static Integer tipoTXT = 1;	
	public static Integer tipoCSV = 2;	
	public static Integer tipoXLS = 3;		
	
	public static String queryBorrarDistribTarjeta = "DELETE from BANKING.ITF_CANALES_DISTRIB where nrodocumento=35992977";
	
	public static String queryActivarTarjeta = "update banking.tjd_tarjetas set estado='T' where  id_tarjeta= '4506240130785721'";
	
	public static String queryRenovarOneClick = "update banking.tjd_prestamos_banred set importe_consumido=0,imp_consumido_hb=0 where estado=1 and numero_doc='17741447'";
	public static String queryRenovarOneClick2 = "update homebnk3.client_offers set taken=0 where id_user='17741447'";

}
