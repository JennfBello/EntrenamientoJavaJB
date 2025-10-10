package Opps;

public class Kia extends Mazda {
	
	static String modelo= "X";

	public static void main(String[] args) {
		Mazda mzObj = new Mazda();
		Carro carObj = new Carro();
		System.out.println("El modelo es: "+modelo);
		System.out.println("La marca es: "+mzObj.nombre);//clase heredada mazda
		System.out.println("El comportamiento es:"); 
		mzObj.run();// es de la clase carro dado que desde mazda tambien se heredo
		carObj.run();
	}

}
