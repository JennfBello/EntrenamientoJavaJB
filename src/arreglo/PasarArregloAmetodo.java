package arreglo;

public class PasarArregloAmetodo {
	
	//Pasar arreglo a metodo
	
	public static void Encontrar(int arregloTres[])
	{
		int min = arregloTres[0];
		//recorro todo el arreglo con un for
		for(int i=0; i<arregloTres.length;i++) 
		{
			if(min>arregloTres[i])
			{
				min=arregloTres[i];
			}
		}
		System.out.println("El elemento menor es:" + min);
	}
	
	public static int [] getArreglo()
	{
		return new int[] {2,4,6,1,10,12,14,16};
	}

	public static void main(String[] args) {
		
		PasarArregloAmetodo arrObj =new PasarArregloAmetodo();
		int arregloPrueba[]= {3,6,1,5,10,80};//metodos definidos
		arrObj.Encontrar(arregloPrueba); //aca pasaran el anterior
		
		//-------------****************************--------------//
		
		int arregloCuarto[] = arrObj.getArreglo();
		System.out.println(arregloCuarto[2]);
	}

}
