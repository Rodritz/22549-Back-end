package ar.com.codoacodo.controllers;

import javax.servlet.http.HttpServletRequest;

public class CreateArticuloRequest {
	private String titulo;
	private String autor;
	private Float precio;
	private String img;

	
	
	public CreateArticuloRequest(HttpServletRequest req) {
		this.titulo = req.getParameter("titulo");// un string que representa el valor enviado en el input
		this.autor = req.getParameter("autor");
		this.img = req.getParameter("imagen");
		
		try {
			this.precio = new Float(req.getParameter("precio"));
		} catch (Exception e) {
			this.precio = null;
		}
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public String getImg() {
		return img;
	}
}
