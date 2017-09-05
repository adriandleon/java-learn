package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoPrueba trabajador1 = new EmpleadoPrueba("Marcos");
		
		EmpleadoPrueba trabajador2 = new EmpleadoPrueba("Anna");
		
		EmpleadoPrueba trabajador3 = new EmpleadoPrueba("Antonio");
		
		EmpleadoPrueba trabajador4 = new EmpleadoPrueba("Maria");
		
		trabajador1.setSeccion("Recursos Humanos");
		
		System.out.println(trabajador1.getDatos() + "\n" 
				+ trabajador2.getDatos() + "\n"
				+ trabajador3.getDatos() + "\n"
				+ trabajador4.getDatos() + "\n");
		
		System.out.println("El Id siguiente es: " + EmpleadoPrueba.getNextId());
	}

}


class EmpleadoPrueba {
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IDsiguiente = 1;
	
	public EmpleadoPrueba(String nombre) {
		
		this.nombre = nombre;
		this.seccion = "Administracion";
		Id = IDsiguiente;
		IDsiguiente++;
		
	}
	
	public void setSeccion(String seccion) { // setter
		this.seccion = seccion;
	}
	
	public String getDatos() { // getter
		return "El nombre es " + nombre + ", la seccion es " + seccion + " y "
				+ "el Id " + Id;
	}
	
	public static int getNextId() {
		return IDsiguiente;
	}
	
}