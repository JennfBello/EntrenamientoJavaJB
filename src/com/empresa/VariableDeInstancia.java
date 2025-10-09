// variables que pertenecen a una instancia de una clase, cada objeto creado tiene su propia copia de estas variables y su valior puede ser diferente para cada instacuia
package com.empresa;

public class VariableDeInstancia {
	String nombre; // que quiere decir el ; que la estoy cerrando porque la usare mas adelante
	
	void mostrarNombre()
	{
		System.out.println("Nombre: "+nombre);
	}

	public static void main(String[] args) {
		//creacion de instancia a la clase
		VariableDeInstancia p1 = new VariableDeInstancia();
		p1.nombre = "Jennifer";
		p1.mostrarNombre();
		p1.nombre ="Jen";
		p1.mostrarNombre();

		
	}

}
