package ar.com.codoacodo.dao;

import ar.com.codoacodo.domain.Articulo;

public interface IArticuloDAO  {
	
	public Articulo getById (Long id) throws Exception;
	

}
