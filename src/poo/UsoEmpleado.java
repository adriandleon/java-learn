package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefatura jefeRH = new Jefatura("Adrian", 240000, 2006, 9, 25);
		
		jefeRH.setIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		misEmpleados[3] = new Empleado("Anthony Fernandez");
		
		misEmpleados[4] = jefeRH; // Polimorfismo. Principio de sustitución
		
		misEmpleados[5] = new Jefatura("Luisana", 95500, 1999, 5, 26);
		
		Jefatura jefeFinanzas = (Jefatura)misEmpleados[5];
		
		jefeFinanzas.setIncentivo(55000);
		
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + " Sueldo: "
					+ e.getSueldo()	+ " Fecha de Alta: " + e.getAltaContrato());
		}

	}

}

class Empleado implements Comparable {
	
	// Metodo Constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar fecha = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = fecha.getTime();
	}
	
	// Sobrecarga del metodo constructor
	public Empleado(String nombre) {
		this(nombre, 30000, 2000, 01, 01);
	}
	
	// getter nombre
	public String getNombre() {
		return nombre;
	}
	
	// getter sueldo
	public double getSueldo() {
		return sueldo;
	}
	
	// getter altaContrato
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	// metodo setter
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado)miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo) return -1;
		
		if (this.sueldo > otroEmpleado.sueldo) return 1;
		
		return 0;
	}
	
	// Atributos/Propiedades
	private String nombre;
	private double sueldo;
	private Date altaContrato;

}


class Jefatura extends Empleado {
	
	private double incentivo;
	
	public Jefatura(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSueldo() {
		return super.getSueldo() + incentivo;
	}
}
