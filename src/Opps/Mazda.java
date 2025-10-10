// esto es un caso de herencia el metodo run es que heredo
//herencia multinivel
package Opps;

// extender la clase carro lo que quiere decir es que puede utilizar los metodos 
public class Mazda extends Carro {
	//static String nombre="mazda";
	
	//creacion de variablñe 29/04/2025
	String nombre= "Mazda";
	
	public void getNombre() {//ejemplo palabra reservada super 29/04/2025
		System.out.println(nombre);//ejemplo palabra reservada super 29/04/2025
		System.out.println(super.nombre);//ejemplo palabra reservada super 29/04/2025
	}

	//la palabra super a nivel de metodo
	public void run()
	
	{
		System.out.println("El Mazda esta transitando");
		super.run();
	}
	
	
	//ejemplo palabra reservada super 29/04/2025
	//crearcion de ocnstructor 
	Mazda()
	{
		//super();
		System.out.println("Llamando al constructor de mazda");
		
	}
	
	public static void main(String[] args) {
		//Carro carObj = new Carro();
		//System.out.println(nombre);
		//carObj.run();
		
		
		//primer uso metodo de la palabra reservada super
		Mazda mazObj =new Mazda();//ejemplo palabra reservada super 29/04/2025
		mazObj.getNombre();//ejemplo palabra reservada super 29/04/2025
		
		//segundo uso metodo de la palabra reservada super
		mazObj.run();//ejemplo palabra reservada super 29/04/2025
	}

}
