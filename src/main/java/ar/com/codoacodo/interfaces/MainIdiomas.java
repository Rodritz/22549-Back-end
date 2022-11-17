package ar.com.codoacodo.interfaces;

public class MainIdiomas {

	public static void main(String[] args) {
		
		//nace la persona
		//Persona persona = new Persona()//el var en este 
		//caso reemplaza Persona para evitar la redundancia
		var persona = new Persona("carlos","español");
		
		System.out.println(persona.getIdioma());
			
		persona.decir("hola");
		
		persona.decir("hola","español");
		
		persona.decir("hola","portuñol");
			
		persona.aprender("portuñol");//f5
		
		persona.decir("hola","portuñol");
	}

}
