package ar.com.codoacodo.dao;

public class Articulo {
	
	private Integer id;
	private String titulo;
	private String autor;
	private Float precio;
	
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Integer getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
}
