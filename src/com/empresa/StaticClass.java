package com.empresa;

public class StaticClass {
	
	int i = 0;
	static int j = 0;

	public static void main(String[] args) {
		//metodo principal
		// Palabras reservadas estaic sin static el elemento pertenece a cada obj creado
		//con static el elemento pertenece a la clase en si y todos lños onjetos comparten el mismo valor o comportamiento
		
		//System.out.println(StaticClass.i);//La i pertenece al objeto, no a la clase porque en la declaracion de variables no tiene la plabra static
		System.out.println(StaticClass.j);
		
		StaticClass aObj = new StaticClass();
		System.out.println(aObj.i);
		
		int resultado = StaticClass.sumar(3, 4);
		System.out.println(resultado);
		
	}
	//return es lo contrario de void//metodo por fuera
	public static int sumar (int a, int b) 
	{
		return a+b;
	}

}
