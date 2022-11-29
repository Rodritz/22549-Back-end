package ar.com.codoacodo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


import ar.com.codoacodo.domain.Articulo;
import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.db.AdministradorDeConexiones;

public class ArticuloDAOMysqlImpl implements IArticuloDAO {

	@Override
	public Articulo getById(Long id) throws Exception {
		
		//pasos para conectarme a la db
		//1 - obtener conexion: java.sql.Connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2 - armar el java.sql.Statement
		Statement statement = connection.createStatement();
		
		//3 - obtener los resultados: java.sql.ResultSet
		String sql = "select * from articulo where id = " + id;
		ResultSet resultSet = statement.executeQuery(sql);
		//1    2      3      4     5
		//id|titulo|autor |precio|img
		//1 |algo  | autox|100   |url
		
		Articulo articulo = null;
		//4 - extraer los datos
		if(resultSet.next()) {//true|false
			Long idDb = resultSet.getLong("id");
			String titulo = resultSet.getString("titulo");
			String autor = resultSet.getString("autor");
			Float precio = resultSet.getFloat("precio");
			String img  = resultSet.getString("img");
			
			articulo = new Articulo(idDb, img, titulo, autor, precio);
		}
		
		return articulo;
	}

}
