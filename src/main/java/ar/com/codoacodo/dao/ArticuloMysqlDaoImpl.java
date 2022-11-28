package ar.com.codoacodo.dao;

public class ArticuloMysqlDaoImpl implements IArticuloDAO {

	
	
	//metodos para cumplir el contrato
	public void guardar(Articulo a) {
		System.out.println("grabando en la  DB");		
	}

	public void actualizar(Articulo a) {
		System.out.println("actualizando la DB");
	}
	
	public void eliminar(Integer id) {
		System.out.println("eliminando elemento de la DB");
	}
	
	public void buscarPorId(Integer id) {
		System.out.println("buscando elemento en la DB");
	}

}
