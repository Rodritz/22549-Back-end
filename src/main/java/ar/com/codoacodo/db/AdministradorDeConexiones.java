package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	//cuando un metodo es estatico significa que no necesito
	// instanciar un objeto de la clase para poder ejecutar dicho metodo.
	
		//este medodo me devuelve una Interfaz de tipo Connection
		public static Connection getConnection() throws Exception {
		
		//lo que estamos creando es la java.sql.connection 
		//por eso necesitamos los datos de la db  para la conexion	
		String hosts = "localhost";
		String port = "3306";
		String username = "root";
		String password = "root";
		String dbName = "22549"; 
		
		//por usar JDBC, debo armar la url así: 
		//        (nombre del motor)+     datos de conexion +   (datos que me exige Mysql)
		String url = "jdbc:mysql://"+hosts+":"+port+"/"+dbName + "?serverTimeZone=UTC&useSSL=false";
		
		//creamos la instancia dinamicamente. como?  
		//debemos crear la instancia de la conexion, 
		//mediante la variable que trae la ruta del Driver.class
		//y la instanciacion del objeto
		String driverClassName = "com.mysql.cj.jdbc.Driver";
					
		//Clase objeto = new Clase();
		Class.forName(driverClassName);
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
		
		//Exceptions > SPRING  
	}
}
