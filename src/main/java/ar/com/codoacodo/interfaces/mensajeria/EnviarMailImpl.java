package ar.com.codoacodo.interfaces.mensajeria;

//creamos una clase que va a implementar la interface IEnviar
public class EnviarMailImpl implements IEnviar{
	
	//esta clase esta encapsulando sus atributos y solo ella accede a los mismos
	private String emailTarget = "destino@mail.com";
	private String emailSource = "yo@yo.com";
	private String provider = "gmail";
	//etc
	
	//esta clase debe cumplir el contrato entonces debemos escribir el metodo de 
	//como lo va a cumplir
	public void enviar(String msj) {
		System.out.println("Enviando mail a " + emailTarget);
		System.out.println("Enviando desde " + emailSource);
		System.out.println("Usando " + provider);
	}
}