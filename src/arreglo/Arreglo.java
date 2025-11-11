package arreglo;

public class Arreglo {

	public static void main(String[] args) {
		//[] esto indica que es un arreglo
		//definicion del arreglo 
		int arregloUno[]=new int[10];
	
		
		// definicio de los valores (colocandole elementos)
		arregloUno[0]=12;
		arregloUno[1]=15;
		arregloUno[2]=22;
		arregloUno[3]=24;
		arregloUno[4]=29;
		arregloUno[5]=30;
		arregloUno[6]=34;
		arregloUno[7]=36;
		
		//acceder a los valores del arreglo
		System.out.println(arregloUno[7]);
		
		//iterar el arreglo
		
		for(int i=0; i<arregloUno.length; i++)
		{
			System.out.println(arregloUno[i]);
		}
		
		//Otra manera de definir e inicializar el arreglo 
		int arregloDos[]= {5,10,15,20,25,30,35};
		System.out.println("Tamaño del segundo arreglo es :" + arregloDos.length);
	}

}
