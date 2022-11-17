package ar.com.codoacodo.interfaces;

public class Persona {
	//atributos
	private String nombre;
	private String idioma;//nace
	private String[] otrosIdiomas;//aprende
	
	//constructor
	public Persona(String nombre, String idioma) {
		setNombre(nombre);//this.nombre = nombre;//this.nombre hace referencia 
											//al atributo interno de la clase
											//mientras que nombre hace referencia al 
											//parametro, que viene por el objeto instanciado
		setIdioma(idioma);//this.idioma = idioma;
		setOtrosIdiomas(new String[0]);//this otroIdiomas = new String[]{}; tambien se puede decir new String [0];
		//el constructor no altera los atributos sino que utiliza los 
		//metodos para hacerlo. 
	}
	
	//metodos
	private void setOtrosIdiomas(String[] idiomas) {
		this.otrosIdiomas = idiomas; 
	}
	
	public void decir(String palabra) {
		System.out.println(getNombre() + " dice " + palabra + " en " + getIdioma());
	}
	
	//sobrecarga de metodos:es una forma de polimorfismo (es cuando hay 2 metodos 
	//con el mismo nombre pero diferentes parametros
	public void decir(String algo, String idioma) {
		// si this.idioma es igual al idioma 
		// o si el idioma esta en el array de otros idiomas
		// entonces puede decir algo en ese idioma
		
		//en java no se usa el == para comparar objetos, sino el .equals()
		
		if (getIdioma().equals(idioma) || existe(idioma)) {
			System.out.println(getNombre() + " puede decir " + algo + " en " + idioma);
		}else {
			System.out.println(getNombre() + " NO HABLA " + idioma);
		}
		
	}
	//creamos un metodo privado para validar por medio del metodo existe
	//si el idioma es nativo o esta dentro del array otrosIdiomas
	private boolean existe(String idioma) {
		//"siempre" usar los getter  
		boolean existe = false;
		for (int i = 0; !existe && i < getOtrosIdiomas().length; i++) {
			existe = getOtrosIdiomas()[i] == idioma;//true|false
		}
		return existe;
	}
	
	public void aprender(String nuevoIdioma) {//portuñol?
		// si el dioma nativo NO es portuñol,
		// && this.otrosIdiomas no existe portuñol
		// agrego a la lista de this.otrosIdiomas 
		if (!getIdioma().equals(nuevoIdioma) && !existe(nuevoIdioma)) {
			//construyo un nuevo vector del largo del vector otrosIdiomas + 1
			String[] nuevosIdiomas = new String[this.otrosIdiomas.length + 1];
			//recorro el vector.Un ej seria ==>for(String nuevosIdiomas : this.otrosIdiomas)
			for(int i=0;i<this.otrosIdiomas.length;i++) {
				nuevosIdiomas[i] = this.otrosIdiomas[i];
			}
			nuevosIdiomas[this.otrosIdiomas.length] = nuevoIdioma;
			//ahora con el setter agrego el nuevo idioma y reemplazo OtrosIdiomas
			setOtrosIdiomas(nuevosIdiomas);
		}
	}

	private void setIdioma(String idioma) {
		this.idioma = idioma;			
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		//si hay una sola linea
		//no es obligatorio usar los {}
		if(nombre == null) {
			nombre = "";
		}
		this.nombre = nombre;
	}

	public String getIdioma() {
		return idioma;
	}

	public String[] getOtrosIdiomas() {
		return otrosIdiomas;
	}
	
	//alt+shit+s crea los getters y setters
	//los getters devuelven informacion y son publicos
	
	
}   //con f5 me meto dentro del metodo en el debug
