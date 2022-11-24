package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;
import ar.com.codoacodo.herencia.interfaces.IJugable;

/**
 * 	play 1 = 32
	play 2 = 128
	play 3 = 512
	play 4 = 1024 
 *
 */

//podemos heredar de una sola clase
//podemos implementar varias interfaces
public class PlayStation extends Consola implements IActualizable, IJugable {
	//agrego un atributo, luego creo el parametro
	private Integer version;

	public PlayStation(Integer bit,Integer version) {//debo pasar el nuevo parametro en el constructor
													//el Integer bit lo paso porque ese parametro va a variar segun la version

		super("PlayStation", bit, "Sony");
		this.version = version;//agrego el parametro del nuevo atributo
	}

	//alt+shit+s para crear un getter para la version
	public Integer getVersion() {
		return version;
	}

	//ALT+SIHT+S para sobreescribor el toString ya que tenemos un nuevo atributo
	public String toString() {
		String toStringDelPadre = super.toString(); //le decimos al padre que muestre sus atributos y lo guardamos en una variable
		String toStringDeHijo = "PlayStation [version=" + version + "]";//le decimos al hijo que muestre sus atributos y lo guardamos en una variable
		return toStringDelPadre + toStringDeHijo; //hacemos que retorne la info de ambas
	}
	
	public void actualizar() {
		if(this.version == 3) {
			System.out.println("actualiznado play " + this.version);
			System.out.println("conectando al servidor de sony");
			System.out.println("descargando nuevo software");
		}else {
			System.out.println("play " + this.version + " no se puede actualizar") ;
		}
	}

	public void jugar() {
		System.out.println("Encendiendo Play" + this.version);
		System.out.println("Cargando juegos del HD");
		System.out.println("Todo listo seleccione juego");
	}
		
}
