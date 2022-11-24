package ar.com.codoacodo.herencia;
/**
 * 	play 1 = 32
	play 2 = 128
	play 3 = 512
	play 4 = 1024 
 *
 */
public class PlayStation extends Consola {
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
}
