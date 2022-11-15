package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		//1- para crear un objeto de una clase xx 
		//Clase nombreDelObjeto = new Clase(); (esto seria instanciar el objeto)
		Buscador miBuscador = new Buscador();
		//ahora  mi buscador esta vivo! entonces puedo 
		//ejecutar cualquiera de sus metodos "publicos"
		
		//2-primero defino cual es la clave de busqueda ejecutando un metodo
		//nombreDelObjeto.metodo();
		miBuscador.cambiarClave("Iron man");
		
		//3-para ejecutar un metodo del objeto
		//nombreDelObjeto.metodo();
		miBuscador.buscar();
		
		//mostrar cuantos resultados encontro el buscador
		System.out.println("Hemos Encontrado " +miBuscador.getCantRes() + " Resultados Para '"+miBuscador.getClaveBusqueda()+"'");
	}

}
