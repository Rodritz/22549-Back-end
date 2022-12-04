package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;

public class DeleteArticuloController {

	public static void main(String[] args) throws Exception {
		
		//eliminar un articulo por id=1
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		dao.delete(5L);
	}

}
