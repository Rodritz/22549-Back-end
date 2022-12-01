package ar.com.codoacodo.controllers;

import java.util.List;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class FindAllArticulosController {

	public static void main(String[] args) throws Exception {
		
		//obtner todos los articulo
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		List<Articulo> articulosBuscado = dao.findAll();
		
		System.out.println(articulosBuscado);
	}

}