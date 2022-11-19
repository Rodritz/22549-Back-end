//este main va a invocar los metodos de la clase Mensajeria
package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeria {

	public static void main(String[] args) {
		String target = "C";
		String mensaje = "aprendiendo interfaces en java";
		
		//instanciamos la clase Mensajeria creada
		var mensajeria = new Mensajeria();
		
		//switch para evitar el uso del If
		switch (target) {
			case "A": 
				mensajeria.enviarMail(mensaje);//pedimos a la clase que invoque los metodos creados
				break; 
			case "B":
				mensajeria.enviarHD(mensaje);
				break;
			case "C":
				mensajeria.enviarADB(mensaje);
				break;
		default:
			System.out.println("OPCION INVALIDA");
			break;
		}
	}

}
