package Opps;

public class Circulo extends Formas  {

	public static void main(String[] args) {
		
		Formas cObj= new Circulo();
		Formas tObj= new Triangulo();
		Formas rObj= new Rectangulo();
		
		//Formas xObj = new Formas ejemplo de una clase abstracta no puede ser instanciada directament, no se puede
		
		cObj.mostrarForma();
		tObj.mostrarForma();
		rObj.mostrarForma();

	}

	
	@Override// esto pertenece al metodo abstracti
	public void mostrarForma() {
		System.out.println("La forma es una circunferencia");
		
	}

}
