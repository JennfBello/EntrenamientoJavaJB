package Opps;

public class BancoPrestamo {
	private String nombre;
	private int edad;
	private int cantidad;

	// se realiza para poder tener acceso y visualizarlos ya que se declararon como privados
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void setEdad(int edad)
	{
		if(edad>=18 && edad <50)
		{
			this.edad=edad;
		} else {
			System.out.println("Entre una edad valida");
		}
			
	}
	public void setCantidad(int cantidad)
	{
		if(cantidad >=10000 && cantidad <=50000) {
			this.cantidad=cantidad;
		}else {
			System.out.println("Entre una cantidad valida");
		}
		
	}
	// retornar	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getEdad()
	{
		return edad;
	}
	public int getCantidad()
	{
		return cantidad;
	}
	
	
	
}
