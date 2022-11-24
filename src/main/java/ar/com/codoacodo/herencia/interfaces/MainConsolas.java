package ar.com.codoacodo.herencia.interfaces;

import ar.com.codoacodo.herencia.Consola;
import ar.com.codoacodo.herencia.Vendedor;

//ctrl+shift+o arregla los import

public class MainConsolas {

	public static void main(String[] args) {
		
		
	 	/*
	 	var xbox360 = new Xbox360();
	 			
		var play1 = new PlayStation(36, 1);//(bit , version)
		var play2 = new PlayStation(128, 2);
		var play3 = new PlayStation(256, 3);
		var play4 = new PlayStation(1024, 4);

		var sega = new SegaGenesis();
		
		------------------
		
		play1.getBit();//de esta manera accedo a los atributos de casa objeto
		play1.getMarca();
		play1.getNombre();
		play1.getVersion();		
		sega.getBit();
		
		todo lo anterior se puede reemplazar por 
		xbox360.toString();
		play1.toString();
		play2.toString();
		play3.toString();
		play4.toString();		
		sega.toString();
		
		al crear el metodo mostrar lo anterior se modifica nuevamente
		xbox360.mostrar();
		play1.mostrar();
		play2.mostrar();
		play3.mostrar();
		play4.mostrar();		
		sega.mostrar();
		
		*/
		//creo la variable consolas cuyo tipo es el array Consola[] = clase.metodo
		Consola[] consolas = Vendedor.venderConsolas();
		
		//recorro el vector e invoco el metodo mostrar del array consolas
		for (int i = 0; i < consolas.length; i++) {
			Consola aux = consolas[i];
			aux.mostrar();
			
			//quiero saber si aux implementa la interface IActualizable
			if(aux instanceof IActualizable) {
				System.out.println(aux.getNombre() + " es actualizable");
				IActualizable instancia = (IActualizable)aux;
				instancia.actualizar();
			}else {
				System.out.println(aux.getNombre() + " NO es actualizable");
			}
			
			if(aux instanceof IJugable) {
				System.out.println(aux.getNombre() + " es Jugable");
				IJugable instancia = (IJugable)aux;
				instancia.jugar();
			}else {
				System.out.println(aux.getNombre() + " NO es Jugable");
			}
			System.out.println("-------------------------");
			
			
		}
	}

}



