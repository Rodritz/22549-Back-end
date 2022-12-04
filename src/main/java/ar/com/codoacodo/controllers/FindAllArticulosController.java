package ar.com.codoacodo.controllers;

import java.util.List;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class FindAllArticulosController {

	public static void main(String[] args) throws Exception {
		
		//obtner todos los articulos
		//invocamos la Interfaz que instancia la impl
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		//la Interface List viene incluida en el java collection frame
		//invocamos el metodo findAll que nos devuelve la lista Articulos
		List<Articulo> articulosBuscado = dao.findAll();
		
		System.out.println(articulosBuscado);
	}

}