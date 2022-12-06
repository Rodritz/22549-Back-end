package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/FindAllArticulosController")
public class FindAllArticulosController extends HttpServlet {

	//http://localhost:8080/webapp/FindAllArticulosController
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		List<Articulo> articulosBuscado = new ArrayList<>();
		try {
			articulosBuscado = dao.findAll();		
			System.out.println(articulosBuscado);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("litado", articulosBuscado);
		
		getServletContext().getRequestDispatcher("/listado.html").forward(req, resp);
	}
	
	//aca: aplicacion de consola
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