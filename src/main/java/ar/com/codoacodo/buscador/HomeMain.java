package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		// para crear un objeto de una clase x
		//Clase nombreDelObjeto = new Clase();
		Buscador miBuscador = new Buscador();
		//ahora  mi buscador esta vivo! entonces puedo 
		//ejectar cualquiera de sus metodos "publicos"
		
		//primero defino cual es la clave de busqueda
		miBuscador.cambiarClave("Iron man");
		
		//ejecuto el metodo buscar
		miBuscador.buscar();
		
		//mostrar cuantos resultados encontro el buscador
		System.out.println("Hemos Encontrado " +miBuscador.getCantRes() + " Resultados Para '"+miBuscador.getClaveBusqueda()+"'");
	}

}
