package ar.com.codoacodo.controllers;

import java.util.Scanner;

public class CrudMain {

	public static void main(String[] args) {
		
		//investigar Scanner para leer datos del teclado
		Scanner teclado = new  Scanner(System.in);
		
		Long op;
		do {
			System.out.println("Selecione un opcion"
					+ "1-alta"
					+ "2-baja"
					+ "3-modif"
					+ "4-buscar por id"
					+ "5-salir");
			
			//leer la opcion del telcado
			op = //
		}while(op .);
		
		//op es una opcion valida 
		switch (op) {
		case 1:
			//leer los datos del articulo
			break;
		case 2:
			//pedir id para dar de baja
			break;

		default:
			break;
		}
		System.out.println("Ingrese id de articulo");
		Long id = teclado.nextLong();
		
		System.out.println("id es "+ id);
		
		teclado.close();

	}

}

