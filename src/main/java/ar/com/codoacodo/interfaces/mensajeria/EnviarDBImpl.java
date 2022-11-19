package ar.com.codoacodo.interfaces.mensajeria;

//creamos una clase que va a implementar la interface IEnviar
public class EnviarDBImpl implements IEnviar {

	//esta clase esta encapsulando sus atributos y solo ella accede a los mismos
	private String username = "Geko";
	private String password = "*******";
	private String host = "5405";
	//etc
	
	//esta clase debe cumplir el contrato entonces debemos escribir el metodo de 
	//como lo va a cumplir
	public void enviar(String msj) {
		System.out.println("Conectando a mysql con username="+ this.username + " y password = " + this.password);//podemos o no usar el this.
		System.out.println("Conectando a mysql al host "+ host);//host no coaliciona con nada asi que no es necesario el this.host
		System.out.println("insertando en la tabla xyz el mensaje "+ msj);
	}

}

