package ar.com.codoacodo.interfaces.mensajeria;

//creamos una clase que va a implementar la interface IEnviar
public class EnviarHDImpl implements IEnviar{
	
	//esta clase esta encapsulando sus atributos y solo ella accede a los mismos
	private String fileSystemPath = "/temp/miusuario";
	//etc
	
	//esta clase debe cumplir el contrato entonces debemos escribir el metodo de 
	//como lo va a cumplir
	public void enviar(String msj) {
		System.out.println("Grabando en: " + fileSystemPath);
		System.out.println("Mensaje: " + msj);
	}
}
