package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;

@WebServlet("/DeleteArticuloController")
public class DeleteArticuloController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		Scanner teclado = new  Scanner(System.in);
		Long opcion = teclado.nextLong();
		
		try {			
			dao.delete(opcion);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	//aca: aplicacion de consola-------------------------------------
	public static void main(String[] args) throws Exception {
		
		//eliminar un articulo por id=1
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		Scanner teclado = new  Scanner(System.in);
		Long opcion = teclado.nextLong();
		dao.delete(opcion);
	}
}
