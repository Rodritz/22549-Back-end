package ar.com.codoacodo.dao;

public class Articulo {
	
	//atributos
	private Integer id;
	private String titulo;
	private String autor;
	private Float precio;
	
	//constructor
	public Articulo(Integer id, String titulo, String autor, Float precio) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	//gettes y setters
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
