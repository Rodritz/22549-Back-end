package ar.com.codoacodo.interfaces.mensajeria;

//esta clase sera instanciada en MainMensajeriaConInterface
public class Mensajero {
		
	//tiene como atributo una interface
	private IEnviar mensajeria;
	
	//tiene un metodo que invoca a una interface y recibe mensajeria
	public void setMensajeria(IEnviar mensajeria ) {
		this.mensajeria = mensajeria;
	}	
	
	//creamos un metodo que verifique que no sea null	
	public boolean tieneMensajeria() {
		return this.mensajeria!=null;
	}
	
	//creamos el metodo para enviar el mensaje
	public void mandarMensaje(String msj) {//si no ponemos string msj o algo similar de paramentro
		this.mensajeria.enviar(msj);		//en this.mensajeria.enviar() tendre null
	}
}
