package ar.com.codoacodo.herencia;

public class Vendedor {

	/*
	 * PlayStation
	 * Xbox
	 * SegaGenesis
	 */
	
	//creamos el metodo venderConsolas cuyo tipo sera un array
	public static Consola[]  venderConsolas() {
		//creamos las consolas que van a conformar el array
		var xbox360 = new Xbox360();
		
		var play1 = new PlayStation(36, 1);//(bit , version)
		var play2 = new PlayStation(128, 2);
		var play3 = new PlayStation(256, 3);
		var play4 = new PlayStation(1024, 4);

		var sega = new SegaGenesis();
		
		//retornamos el array instanciandolo al mismo tiempo.
		//dentro de las llaves ponemos los objetos que estan en el array
		//si necesito agregar consolas las creo y las agrego al array
		return new Consola[]{xbox360,play1,play2,play3,play4,sega};
	}
}
