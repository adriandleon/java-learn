package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoPrueba trabajador1 = new EmpleadoPrueba("Marcos");
		
		EmpleadoPrueba trabajador2 = new EmpleadoPrueba("Anna");
		
		trabajador1.setSeccion("Recursos Humanos");
		
		System.out.println(trabajador1.getDatos());
		
		System.out.println(trabajador2.getDatos());
	}

}


class EmpleadoPrueba {
	
	private final String nombre;
	
	private String seccion;
	
	public EmpleadoPrueba(String nombre) {
		
		this.nombre = nombre;
		this.seccion = "Administracion";
		
	}
	
	public void setSeccion(String seccion) { // setter
		this.seccion = seccion;
	}
	
	public String getDatos() { // getter
		return "El nombre es " + nombre + " y la seccion es " + seccion;
	}
	
}