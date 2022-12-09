package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/GetArticuloController")
public class GetArticuloController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		//luego llamo al metodo el cual me va a devolver un Articulo
		Articulo articuloBuscado;
		try {
			articuloBuscado = dao.getById(1L);
			System.out.println(articuloBuscado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//aca: aplicacion de consola
	public static void main(String[] args) throws Exception {
		
		//obtner un articulo por id=1
		//debemos invocar la Interface DAO la cual va a instanciar la implementacion
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		//luego llamo al metodo el cual me va a devolver un Articulo
		Articulo articuloBuscado = dao.getById(1L);
		
		System.out.println(articuloBuscado);
	}

}