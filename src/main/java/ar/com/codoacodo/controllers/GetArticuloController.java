package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class GetArticuloController {

	public static void main(String[] args) throws Exception {
		
		//obtner un articulo por id=1
		//debemos invocar la Interface DAO la cual va a instanciar la implementacion
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		//luego llamo al metodo el cual me va a devolver un Articulo
		Articulo articuloBuscado = dao.getById(1L);
		
		System.out.println(articuloBuscado);
	}

}