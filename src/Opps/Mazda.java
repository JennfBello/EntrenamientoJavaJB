// esto es un caso de herencia el metodo run es que heredo
package Opps;

// extender la clase carro lo que quiere decir es que puede utilizar los metodos 
public class Mazda extends Carro {
	static String nombre="mazda";
	
	public static void main(String[] args) {
		Carro carObj = new Carro();
		System.out.println(nombre);
		carObj.run();
	}

}
