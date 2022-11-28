package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConCreadorDeMensajeria {

	public static void main(String[] args) {
		String target = "C";		
		String mensaje = "aprendiendo interfaces en java";
		
		//al haber creado un metodo static en CreadorDeMensajeria, no necesito instanciar la clase
		//CreadorDeMensajeria. Puedo hacer clase.metodo
		
		
		//eso ya me retorna IEnviar algo(mensaje en este caso)
		IEnviar msj = CreadorDeMensajeria.crearMensajeria(target);//con esto queda desacoplado la creacion
																//ya no necesitamos la clase Mensajero
		msj.enviar(mensaje);
		
		/*if(msj != null) {
		msj.enviar(mensaje);*/ //este seria otro tipo de verificador
							//para que no de null y tire error. nosotros optamos por la clase Default 
	}	
	
}
