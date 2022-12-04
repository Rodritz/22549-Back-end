package ar.com.codoacodo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
		String sql = "select * from articulo where id = " + id;//pido un registro
		ResultSet resultSet = statement.executeQuery(sql);
		//1    2      3      4     5
		//id|titulo|autor |precio|img
		//1 |algo  | autox|100   |url
		
		Articulo articulo = null;
		//4 - extraer los datos
		/*
		if(resultSet.next()) {
			Long idDb = resultSet.getLong("id");//dame un Long en la posicion id y asignale una variable
			String titulo = resultSet.getString("titulo");
			String autor = resultSet.getString("autor");
			Float precio = resultSet.getFloat("precio");
			String img  = resultSet.getString("img");
		
		return new Articulo(idDb, img, titulo, autor, precio);
	}
		 */ 
		//creamos un metodo para el resultSet y optimizar el codigo
		if(resultSet.next()) {//true|false			
			articulo = fromResultsetToArticulo(resultSet);
		}
		
		return articulo;
	}
	
	//la firma del metodo es Articulo entonces nos devuelve un Articulo
	public Articulo fromResultsetToArticulo(ResultSet resultSet) throws Exception{//por parametros le pasamos un ResultSet
		Long idDb = resultSet.getLong("id");//dame un Long en la posicion id y asignale una variable
		String titulo = resultSet.getString("titulo");
		String autor = resultSet.getString("autor");
		Float precio = resultSet.getFloat("precio");
		String img  = resultSet.getString("img");
		
		return new Articulo(idDb, img, titulo, autor, precio);
	}

	@Override
	public List<Articulo> findAll() throws Exception {
		//pasos para conectarme a la db
		//1 - obtener conexion: java.sql.Connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2 - armar el java.sql.Statement
		Statement statement = connection.createStatement();
		
		//3 - obtener los resultados: java.sql.ResultSet
		String sql = "select * from articulo";//ahora pido todos los registros
		ResultSet resultSet = statement.executeQuery(sql);
		//1    2      3      4     5
		//id|titulo|autor |precio|img
		//1 |algo  | autox|100   |url
		
		//Interface i = new ClaseQueimplementa();
		List<Articulo> articulos = new ArrayList<>();//implementa ArrayList
		
		//4 - extraer los datos
		/*
		 while(resultSet.next()) {//mientras alla resultado =>true|false
			Long idDb = resultSet.getLong("id");//dame un Long en la posicion id y asignale una variable
			String titulo = resultSet.getString("titulo");
			String autor = resultSet.getString("autor");
			Float precio = resultSet.getFloat("precio");
			String img  = resultSet.getString("img"); 
			
			Articulo articulo = new Articulo (idDb, img, titulo, autor, precio);
			
			//luego de recorrer lo agrego a la lista de articulos
			articulos.add(new Articulo (idDb, img, titulo, autor, precio)); //no tiene sentido crear
															una variable que no volvere a utilizar por eso pasamos la 
															instanciacion de la ArrayList aca dentro y eliminamos la linea
															de la instanciacion nº93
		 
		 */
		
		//utilizamos el metodo que creamos para el resultSet y optimizar el codigo
		while(resultSet.next()) {//mientras alla resultado =>true|false
			//luego de recorrer lo agrego a la lista de articulos
			articulos.add(fromResultsetToArticulo(resultSet));
		}
		
		return articulos;
	}

	@Override
	public void create(Articulo articulo) throws Exception {
		//pasos para conectarme a la db
		//1 - obtener conexion: java.sql.Connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		
		//2 - insert: java.sql.ResultSet								    1 2 3 4
		String sql = "insert into articulo (titulo,autor,precio,img) values(?,?,?,?)";

		//3 - armar el java.sql.Statement -- por ser un preparedStatement necesito hacer la consulta primero
		PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		
		statement.setString(1,articulo.getTitulo());//asignamos de donde obtendra los valores cada ?
		statement.setString(2,articulo.getAutor());
		statement.setFloat(3,articulo.getPrecio());
		statement.setString(4,articulo.getImg());
		
		statement.execute();
		
		ResultSet res = statement.getGeneratedKeys();
		if(res.next()) {
			articulo.setId(res.getLong(1));/*seteamos al id del Articulo el Long que 
											que me asigno PreparedStatement.RETURN_GENERATED_KEYS*/
		}
	}

	@Override
	public void delete(Long id) throws Exception{
		//pasos para conectarme a la db
		//1 - obtener conexion: java.sql.Connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2 - armar el java.sql.Statement
		Statement statement = connection.createStatement();
		
		//3 - obtener los resultados: java.sql.ResultSet
		String sql = "delete from articulo where id = " + id;
		
		int resultSet = statement.executeUpdate(sql);/*en delete se utiliza executeUpdate 
														que me devuelve un entero, 0 si no se puede y
														1 si se puede eliminar el registro*/
		System.out.println(resultSet);
	}

	@Override
	public void update(Articulo articulo) throws Exception{
		//pasos para conectarme a la db
		//1 - obtener conexion: java.sql.Connection
		Connection connection = AdministradorDeConexiones.getConnection();
		
		//2 - insert: java.sql.ResultSet		 1       2        3     4          5
		String sql = "update articulo set titulo=?,autor=?,precio=?,img=? where id=?";

		//3 - armar el java.sql.Statement
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1,articulo.getTitulo());
		statement.setString(2,articulo.getAutor());
		statement.setFloat(3,articulo.getPrecio());
		statement.setString(4,articulo.getImg());		
		statement.setLong(5, articulo.getId());
		
		statement.execute();
	}

}