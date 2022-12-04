package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class UpdateArticuloController {

	public static void main(String[] args) throws Exception {
		
		//suponemos que recibimos los nuevos parametros enviados por un formularios
		//con las actualizaciones
		String titulo = "NUEVO ARTICULO modif";
		String autor = "NUEVO AUTOR modif";
		String img = "http://bla.img.com/img.jpg";
		Float precio = 350.5f;
		Long id = 3l; 
		
		//1 - busco el articulo a actualizar
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		var articulo = dao.getById(id); 
		
		//verifico que exista y  seteo los datos que deben actualizarse
		if(articulo != null) {

			articulo.setImg(img);
			articulo.setAutor(autor);
			articulo.setPrecio(precio);
			articulo.setTitulo(titulo);
			
			dao.update(articulo);
			
			System.out.println(articulo);
		}
		
	}

}