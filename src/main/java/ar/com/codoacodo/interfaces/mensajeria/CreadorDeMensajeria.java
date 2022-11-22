package ar.com.codoacodo.interfaces.mensajeria;

public class CreadorDeMensajeria {
	
	public static IEnviar crearMensajeria(String target) {//crear mensajeria recibe el String target
		
		//no quiero setear algo sino retornar algo		
		
		// Interface algo = new ClaseQueImplementaLaInterface();
		IEnviar mensajeria = new DefaultEnviarImpl();
		switch (target) {
		case "A":
			mensajeria = new EnviarMailImpl();
			break;
		case "B":
			mensajeria = new EnviarHDImpl();
			break;
		case "C":
			mensajeria = new EnviarDBImpl();
			break;
		default:
			System.out.println("OPCION INVALIDA");
			break;
		}
		return mensajeria;
	}
}