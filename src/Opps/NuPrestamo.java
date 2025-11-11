package Opps;

public class NuPrestamo extends BancoPrestamo {
	
	public static void main(String[] args) {
		
		NuPrestamo PrestamoObj =new NuPrestamo();
		
		////que se envia por el set se muestra por el get
		PrestamoObj.setNombre("Juan");
		PrestamoObj.setEdad(70);
		PrestamoObj.setCantidad(22000);
		
		System.out.println("El nombre es: " +PrestamoObj.getNombre());
		System.out.println("El edad es: " +PrestamoObj.getEdad());
		System.out.println("La Cantidad es: " +PrestamoObj.getCantidad());
	}
	

}
