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
public class FindAllArticulosController extends HttpServlet {//hacemos que extienda de Http...  para convertirlo en un 
															//servlet y que pueda escuchar peticiones del front

	//http://localhost:8080/webapp/FindAllArticulosController =>cuando introduzca esta url se va a disparar este controlador web	
	//se implementa el metodo doGet para que pueda recibir las peticiones.//si fuera a realizar seria el metodo doPost
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
				
		//aca: prueba para el index listado, donde si falla se redirecciona especificando 
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		List<Articulo> articulosBuscado = new ArrayList<>();
		
		//el try/catch sirve para incluir exceptions. dentro del try va el codigo y dentro del parentesis del catch la exception
		try {
			articulosBuscado = dao.findAll();	
		}catch(Exception e) {
			e.printStackTrace();//si falla y hay un error el printStackTrace nos va a indicar el problema
		}
		
		//guardo bajo el nombre productos una lista de articulos
		req.setAttribute("productos", articulosBuscado);//req es la request, con el setAttribute se guardo 
		
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
	
		//recibe por doPost desde /nuevo.jsp y los redirecciona con doGet
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
		}
}	
	//aca: aplicacion de consola----------------------------------------
	/*public static void main(String[] args) throws Exception {
		
		//obtner todos los articulos
		//invocamos la Interfaz que instancia la impl
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		//la Interface List viene incluida en el java collection frame
		//invocamos el metodo findAll que nos devuelve la lista Articulos
		List<Articulo> articulosBuscado = dao.findAll();
		
		System.out.println(articulosBuscado);
	}*/

