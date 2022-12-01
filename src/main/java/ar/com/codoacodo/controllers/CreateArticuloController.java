package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class CreateArticuloController {

	public static void main(String[] args) throws Exception {
		
		//crear un articulo
		//suponemos que recibimos los parametros enviados por un formularios
		String titulo = "NUEVO ARTICULO";
		String autor = "NUEVO AUTOR";
		String img = "http://bla.com/img.jpg";
		Float precio = 150.5f;

		var articulo = new Articulo(img, titulo, autor, precio);
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		System.out.println("antes" + articulo);
		
		dao.create(articulo);
		
		System.out.println("despues" + articulo);
	}

}