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

@WebServlet("/UpdateArticuloController")
public class UpdateArticuloController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		String titulo = "NUEVO ARTICULO modif";
		String autor = "NUEVO AUTOR modif";
		String img = "http://bla.img.com/img.jpg";
		Float precio = 350.5f;
		Long id = 3l; 
		
		//1 - busco el articulo a actualizar
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		Articulo articulo = null;
		try {
			articulo = dao.getById(id);
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		
		//verifico que exista y  seteo los datos que deben actualizarse
		if(articulo != null) {

			articulo.setImg(img);
			articulo.setAutor(autor);
			articulo.setPrecio(precio);
			articulo.setTitulo(titulo);
			
			try {
				dao.update(articulo);
				System.out.println(articulo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
	
	//aca: aplicacion de consola
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