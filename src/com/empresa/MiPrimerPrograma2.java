package com.empresa;

public class MiPrimerPrograma2 {

	public static String saludo()
	{
		return "Hola Mundo";//con este return le estamos indicando que nos retonre 
	}
	
	public static void main(String[] args) {
		//void todo este metodo no retornara nada
		System.out.println("Este es mi segundo programa");
		
		String mensaje = saludo();//metodo es ese saludoel cual es el que va a imprimir 
		System.out.println(mensaje);
				
	}

}
