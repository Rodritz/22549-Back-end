package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class UpdateArticuloController {

	public static void main(String[] args) throws Exception {
		
		//crear un articulo
		//suponemos que recibimos los parametros enviados por un formularios
		String titulo = "NUEVO ARTICULO modif";
		String autor = "NUEVO AUTOR modif";
		String img = "http://bla.img.com/img.jpg";
		Float precio = 350.5f;
		Long id = 3l; 
		
		//1 - busco el articulo a actualizar
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		var articulo = dao.getById(id); 

		if(articulo != null) {

			//solo actualizo la imagen
			articulo.setImg(img);
			articulo.setAutor(autor);
			articulo.setPrecio(precio);
			articulo.setTitulo(titulo);
			
			dao.update(articulo);
			
			System.out.println(articulo);
		}
		
	}

}