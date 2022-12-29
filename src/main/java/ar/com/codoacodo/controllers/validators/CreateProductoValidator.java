package ar.com.codoacodo.controllers.validators;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import ar.com.codoacodo.controllers.CreateArticuloRequest;

public class CreateProductoValidator implements IValidable {
	private CreateArticuloRequest datosAValidar; 
	
	public CreateProductoValidator(CreateArticuloRequest datos) {
		this.datosAValidar = datos;
	}

	@Override
	public List<String> validate() {
		List<String> errores = new ArrayList<>();
		
		if(datosAValidar.getTitulo() == null || "".equals(datosAValidar.getTitulo())) {
			errores.add("Titulo es nulo");
		}
		if(datosAValidar.getAutor() == null || "".equals(datosAValidar.getAutor())) {
			errores.add("Autor es nulo");
		}
		if(datosAValidar.getPrecio() == null || Float.isNaN(datosAValidar.getPrecio())) {
			errores.add("Precio es invalido");
		}
		return errores;
	}
}
