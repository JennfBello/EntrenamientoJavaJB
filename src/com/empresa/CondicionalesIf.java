package com.empresa;

public class CondicionalesIf {

	public static void main(String[] args) {
		String var1 = "Hola";
		String var2 = "Equipo";
		
		int a = 100;
		int b = 200;
		
		/*una condicion sin respuesta dado que la variable en este caso es 100
		 * if(a>1000)
		{
			System.out.println("A es mayor que 1000");
		}*/
		
		/*Segundo tipo de IF
		 * aca estoy dando las dos instrucciones si es verdadero o falsa segun la ecuacion que le estoy brindando
		* if(a<1000)
			{
				System.out.println("A es menor que 1000");
			}
		 else
		 {
			 	System.out.println("A es mayor que 1000");
		 }*/
		
		
		if(a==100)
		{
			System.out.println("A ES IGUAL 100");
		}
		else if (a==200)
		{
			System.out.println("A ES IGUAL 200");
		}
		else if (a==300)
		{
			System.out.println("A ES IGUAL 300");	
		}
		else 
		{
			System.out.println("A NO ES IGUAL A NINGUNO DE LOS NUMEROS");	
		}

	}

}
