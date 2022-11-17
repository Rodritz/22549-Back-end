package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConInterfaces {

	public static void main(String[] args) {
		String target = "A";
		String mensaje = "aprendiendo interfaces en java";
		
		var mensajero = new Mensajero();
		
		
		switch (target) {
			case "A": 
				//var msj = new EnviarMailImpl();
				//mensajero.setMensajeria(msj);
				mensajero.setMensajeria(new EnviarMailImpl());
				break; 
			case "B":
				mensajero.setMensajeria(new EnviarHDImpl());
				break;
			case "C":
				mensajero.setMensajeria(new EnviarDBImpl());
				break;
		default:
			System.out.println("OPCION INVALIDA");
			break;
		}
		
		if(mensajero.tieneMensajeria()) {
			mensajero.mandarMensaje(mensaje);
			
		}
		
	}

}
