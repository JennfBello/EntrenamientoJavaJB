package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
		// estructura de control de comparacion contra multiplees valores de forma mas ordenada que usa varios if else
		
		//int dia=4;
		
		/*//switch(dia)
		{
		case 1:
			System.out.println("Este es el dia Lunes");
			break;
		case 2:
			System.out.println("Este es el dia Martes");
			break;
		case 3:
			System.out.println("Este es el dia Miercoles");
			break;
		case 4:
			System.out.println("Este es el dia Jueves");
			break;
		case 5:
			System.out.println("Este es el dia Viernes");
			break;
		case 6:
			System.out.println("Este es el dia Sabado");
			break;
		case 7:
			System.out.println("Este es el dia Domingo");
			break;
		default:
			System.out.println("DIA NO VÁLIDO");
		}*/
		
		//casos en los sistemas que tengan muchos modulos
		String modulo="Contabilidad";
		
		switch(modulo)
		
		{
		case "Contabilidad":
			System.out.println("Ingreso al modulo de Contabilidad");
			break;
		case "Presupuesto":
			System.out.println("Ingreso al modulo de Presupuesto");
			break;
		case "Tesoreria":
			System.out.println("Ingreso al modulo de Tesoreria");
			break;
		case "Nomina":
			System.out.println("Ingreso al modulo de Nómina");
			break;
		case "Inventarios":
			System.out.println("Ingreso al modulo de Inventarios");
			break;
		case "Indycom":
			System.out.println("Ingreso al modulo de Indycom");
			break;
		case "Predial":
			System.out.println("Ingreso al modulo de Predial");
			break;
		default:
			System.out.println("Regrese a la pagina y escoja un nuevo módulo");
		}

	}

}
