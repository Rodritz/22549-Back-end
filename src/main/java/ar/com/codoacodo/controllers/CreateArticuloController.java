package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.controllers.validators.CreateProductoValidator;
import ar.com.codoacodo.controllers.validators.IValidable;
import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/CreateArticuloController")
public class CreateArticuloController extends HttpServlet{

	//en este caso es un doPost porque recibimos los datos
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// super.doPost(req, resp);

		// crear un articulo
		CreateArticuloRequest createRequest = new CreateArticuloRequest(req);
		
		IValidable validator = new CreateProductoValidator(createRequest);
		List<String> errors = validator.validate();
		
		//verifico si hay errores
		if(!errors.isEmpty()) {
			//volver a nuevo.jsp con la lista de errores
			//guarda la lista en el request
			req.setAttribute("errors", errors);
			//redirect a otra pagina u otro servlet(Controller/WebServlet)
			getServletContext().getRequestDispatcher("/nuevo.jsp").forward(req, resp);
			return;
		}
		
		// instanciamos nuestro objeto
		var articulo = new Articulo(createRequest.getImg(), createRequest.getTitulo(), createRequest.getAutor(), createRequest.getPrecio());
		
		//hacemos uso del DAO e instanciamos nuestra implementacion
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		//control de errores se vera en curso de spring
		try {
			dao.create(articulo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
	}
}

	/*
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { //super.doGet(req, resp);
	 * 
	 * Scanner teclado = new Scanner(System.in) ;
	 * 
	 * System.out.println("ingrese nombre del tema"); String titulo =
	 * teclado.nextLine(); System.out.println("ingrese nombre del autor"); String
	 * autor = teclado.nextLine(); System.out.println("ingrese url de la imagen");
	 * String img = teclado.nextLine(); System.out.println("ingrese el precio");
	 * Float precio =teclado.nextFloat(); //instanciamos el articulo con dichos
	 * parametros var articulo = new Articulo(img, titulo, autor, precio);
	 * 
	 * 
	 * IArticuloDAO dao = new ArticuloDAOMysqlImpl(); System.out.println("antes" +
	 * articulo);
	 * 
	 * try { dao.create(articulo); System.out.println("despues" + articulo); } catch
	 * (Exception e) { e.printStackTrace(); } }
	 */

	// aca: aplicacion de consola-----------------------------------------
	/*public static void main(String[] args) throws Exception {

		// crear un articulo
		// suponemos que recibimos los parametros enviados por un formularios
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese nombre del tema");
		String titulo = teclado.nextLine();
		System.out.println("ingrese nombre del autor");
		String autor = teclado.nextLine();
		System.out.println("ingrese url de la imagen");
		String img = teclado.nextLine();
		System.out.println("ingrese el precio");
		Float precio = teclado.nextFloat();
		// instanciamos el articulo con dichos parametros
		var articulo = new Articulo(img, titulo, autor, precio);

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		System.out.println("antes" + articulo);

		dao.create(articulo);
		System.out.println("despues" + articulo);
		System.out.println("�Desea continuar?");
	}*/

