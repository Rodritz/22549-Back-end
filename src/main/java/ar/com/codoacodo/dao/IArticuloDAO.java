package ar.com.codoacodo.dao;

public interface IArticuloDAO {
	
	public void guardar (Articulo a);//entity:Articulo?
	public void actualizar (Articulo a);//entity:Articulo?
	public void eliminar (Integer id);
	public void buscarPorId (Integer id);

}
