package ar.com.codoacodo.dao;

import java.util.List;

import ar.com.codoacodo.domain.Articulo;

public interface IArticuloDAO {
	
	/*DEBEMOS DEFINIR TODOS LOS METODOS DE LA INTERFACE*/
	
	//select * from articulos where id = "";
	public Articulo getById(Long id) throws Exception;
	
	//--------------------------------------------
	
	/* las 3 formas de usar array list serian 
	1-var edades = new ArrayList<Articulo>();
	2-List<Articulo> edades = new ArrayList<>();
	3ArrayList<Articulo> edades = new ArrayList<>();
		
	edades.add(new Articulo(...));
	*/
	
	//la Interface List viene incluida en la java collection framework
	//select * from articulos N >=0 
	public List<Articulo> findAll() throws Exception;
	
	//---------------------------------------------------
	//insert into ARTICULO (c1,c2...cn) values(v1,v2...vn)
	//el metodo create inserta datos en la tabla, la cual le asigna un id
	public void create(Articulo articulo) throws Exception;/*en la creacion pasamos un objeto para
												evitar cambiar los parametros luego, en todo caso se modifica el objeto*/
	
	//-----------------------------------------------------
	//delete from articulo where id = id
	public void delete(Long id) throws Exception;
	
	//----------------------------------------------------
	//update articulo set c1=v1, c2=v2...., cN=vN where id = ""
	public void update(Articulo articulo) throws Exception;

	//----------------------------------------------------
	//search articulo
	public List<Articulo> search(String clave) throws Exception;
}
