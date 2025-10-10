package com.empresa;

public class Estudiantes {
	
	public Estudiantes()
	{  //Constructor
		System.out.println("Hola, estoy en el constructor");
	}
		
	//variables de clase
	int numero;
	String nombre;
	
	//si en dado caso voy a utoñozar el constructor con dos parametros diferentes
	public Estudiantes(int i, String n)
	{
		numero=i;
		nombre=n;
	}
	
	public void desplegar()
	{
		System.out.println("Numero es: " +numero+ "y Nombre es: "+nombre);
	}
	
	public static void main(String[] args) {
		
		Estudiantes est = new Estudiantes();
		
		Estudiantes est2 = new Estudiantes(1, "Juan");
		Estudiantes est3 = new Estudiantes(2, "Laura");
		est2.desplegar();//llamar el metodo desplegar
		est3.desplegar();

	}

}
