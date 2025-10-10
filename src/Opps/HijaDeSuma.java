package Opps;

public class HijaDeSuma extends Suma{

	public static void main(String[] args) {
		Suma adObj =new Suma();
		adObj.Sumar(2, 3);
		adObj.Sumar(10, 40, 50);

		double d = adObj.Sumar(2.5, 1.5, 2.4);
		System.out.println(d);
	}

}
