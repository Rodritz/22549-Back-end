//paquete
package ar.com.codoacodo.buscador;

public class Buscador {
	
	//o.o.p:atributos sean privados //o.o.p=Object Oriented Programming
	
	//atributos 
	//definimos public/private tipoDeDato nombreDelAtributo
	private String claveBusqueda;
	//creo el atributo tipo array de Articulo
	private Articulo[] resultados;
	//atributo tipo int
	private int cantidadResultados;
	
	//
	
	//constructor/es (todas las clases vienen con un constructor por defecto)
	//puede estar o no estar
	public Buscador() {
		System.out.println("nace un buscador");
		//cuando nace el buscador definimos el tamaño del atributo resultado
		//para que haya, en este caso , un vector vacio y no tire error
		resultados = new Articulo[0];
	}
	
	//metodos (es algo similar a una funcion)
	public void buscar() {
		System.out.println("buscando " + claveBusqueda);
		
		//aca debo cargar el array de resultados con objetos de la clase Articulo
		//simular que encontramos 3 resultados				
		Articulo res1 = new Articulo();
		Articulo res2 = new Articulo();
		Articulo res3 = new Articulo();
		
		//instancio nuevamente el array de resultados
		//recreamos el array de 3 posiciones
		resultados = new Articulo[3];//length
		
		resultados[0]= res1;
		resultados[1]= res2;
		resultados[2]= res3;
			
		//actualizo la cant de resultados
		cantidadResultados = resultados.length;
		
	}
	
	public void cambiarClave(String nuevaClave) {
		claveBusqueda = nuevaClave;
	}
	
	public int getCantRes() {
		return cantidadResultados;
	}
	
	public String getClaveBusqueda() {
		if(claveBusqueda == null) {
			return "";
		}
		return claveBusqueda;
	}

}

