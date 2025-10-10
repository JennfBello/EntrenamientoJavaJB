//Polimorfismo en ejecucion 
package Opps;

public class CalcularIntereses {

	public static void main(String[] args) {
		Davivienda daObj =new Davivienda();
		Bancolombia baObj = new Bancolombia();
		System.out.println("El interés de Davivienda es: "+daObj.getInteres());
		System.out.println("El interés de Bancolombia es: "+baObj.getInteres());
	}

}
