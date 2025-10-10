package Opps;

public class ClaseDeIngeneria implements intrEstudiante{
	
	//metodos de la interfaz
	public void mostrarNombre() {
		System.out.println("Hola, somo estudiantes de ingeneria");
		
	}


	public void obtenerNumeroDeEstudiantes() {
		System.out.println("Somo 50 estudiantes");
		
	}

	
	public void ObtenerGrado() {
		System.out.println("Somos de quinto semestre");
		
	}
	
	//metodo propios de la clase
	public void obtenerUniversidad(){
		System.out.println("La universidad es: "+ univerdidad);
	}
		

	public static void main(String[] args) {
		
		ClaseDeIngeneria ingObj = new ClaseDeIngeneria();
		ClaseDeMedicina medObj = new ClaseDeMedicina();
		
		ingObj.mostrarNombre();
		ingObj.ObtenerGrado();
		ingObj.obtenerNumeroDeEstudiantes();
		ingObj.obtenerUniversidad();
		
		System.out.println("************************");
		
		medObj.mostrarNombre();
		medObj.ObtenerGrado();
		medObj.obtenerNumeroDeEstudiantes();
		medObj.obtenerUniversidad();
		
	}


	public void obtenerNombreInterface() {
		
		
	}
 }
