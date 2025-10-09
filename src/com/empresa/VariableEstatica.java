//son variables declaradas con la palabra static lo que significa que pertenecen a la clase en si y no a ninguna instancia especifica. Son compartidas por todas las instancias de la clase 
package com.empresa;

public class VariableEstatica {
	static int MAX_USUARIOS = 100;

	public static void main(String[] args) {
		System.out.println("Maximo de usuarios: "+ VariableEstatica.MAX_USUARIOS);

	}

}
