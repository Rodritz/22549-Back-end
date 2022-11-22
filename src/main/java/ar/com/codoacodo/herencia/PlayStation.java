package ar.com.codoacodo.herencia;
/**
 * 	play 1 = 32
	play 2 = 128
	play3 = 512
	play 4 = 1024
 * @author LopezCar
 *
 */
public class PlayStation extends Consola {

	private Integer version;

	public PlayStation(Integer bit,Integer version) {

		super("PayStation", bit, "Sony");
		this.version = version;
	}

	//alt+shit+s
	public Integer getVersion() {
		return version;
	}

	//ALT+SIHT+S
	public String toString() {
		String toStringDelPadre = super.toString(); 
		String toStringDeHijo = "PlayStation [version=" + version + "]";
		return toStringDelPadre + toStringDeHijo;
	}
	
	
}
