package strings;


//comparacion de cadenas yt concatenacion de cadenas
//string comparison string concatenation
public class IntroduccionString {

	public static void main(String[] args) {
		//variables
		String nombre="Juan Perez";
		String nombre2="Juan Perez";
		String nombre3="juan perez";
		
		
		//claseobj new String eso me genera dos espacios de memoria
		String pais = new String ("Colombia");
		String pais2 = new String ("Colombia");
		
		System.out.println(nombre.equals(nombre2));
		System.out.println(nombre.equals(nombre3));
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(nombre.equalsIgnoreCase(nombre3));
		
		System.out.println(pais.equals(pais2));
		
		
		///**********************************************//
		System.out.println("-------------------------------------------------------------");
		System.out.println(nombre==nombre2);
		System.out.println(pais==pais2);
		
		
		System.out.println("-------------------------------------------------------------");
		//CONCATENACION
		String finalString=nombre+nombre2+nombre3;
		System.out.println(finalString);
		System.out.println("-------------------------------------------------------------");
		String segundoString=nombre.concat(nombre2).concat(nombre3);
		System.out.println(segundoString);
		

	}

}
