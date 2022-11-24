package ar.com.codoacodo.herencia;

//todas la clases en java heredan de object implicitamente
public class Consola /*extends Object*/ {
	private String nombre;
	protected Integer bit;
	private String marca;
	
	// contructor con todos los parametros
	// porque se que todos los hijos se crearan con dichos parametros
	//alt+shit+s
	
	public Consola(String nombre, Integer bit, String marca) {	
		//super(); esto significa invoco al constructor del padre. lo podemos sacar porque va implicito 
		this.nombre = nombre;	
		this.bit = bit;
		this.marca = marca;
	}

	//como nombre y marca son private
	//pongo getters y setters, en algunos casos no necesito setters 
	//porque una vez que nacen algunos atributos no se modifican
	
	public String getNombre() {
		return nombre;
	}

	public Integer getBit() {
		return bit;
	}

	public String getMarca() {
		return marca;
	}
	/*
	// la clase Consola hereda de la clase Object el metodo toString 
	//y lo puede sobreescribir por eso el @override cuando la clase hija lo invoca
	//polimorfismo: //se llama asi porque la hija puede modificar el metodo
	
	@Override
	public String toString() {			
		return super.toString();
	}*/
	
	//Alt+Shift+s genera el toString que listara los atributos
	public String toString() {
		return "Consola [nombre=" + nombre + ", bit=" + bit + ", marca=" + marca + "]";
	}
	//creamos el metodo mostrar que invoca el metodo toString y pide lo muestre por pantalla
	public void mostrar() {
		System.out.println(toString());
	}
}

