package com.empresa;

public class Perro {
	
	//ATRIOBUROS QUE PERTENECEN A LA CLASE
	String nombre="Baldo";
	String raza="Criollo";
	int altura=4;
	
	
	public void ladrar()
	{
		System.out.println(nombre + "Esta ladrando");
	}
	
	public static void main(String[] args) {
		
		//CREACION DE OBJETO
		
		Perro perroObj = new Perro();
		System.out.println(perroObj.altura);
		perroObj.ladrar();

	}

}
