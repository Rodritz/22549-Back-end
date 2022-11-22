package ar.com.codoacodo.herencia;

public class Xbox360 extends Consola{

	//escribo explicitamente el constructor de Xbox360
	//PERO, debo enviarle al padre los 3 parametros que me pide
	public Xbox360() {
		// la primer linea de un constructor de una clase hija
		// es invocar al constructor del padre, con los parametros
		//que requiere
		super("Xbox360",1024,"Microsoft");
	}
}
