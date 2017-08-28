package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		for (Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + " Sueldo: "
					+ e.getSueldo()	+ " Fecha de Alta: " + e.getAltaContrato());
		}

	}

}

class Empleado {
	
	// Metodo Constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar fecha = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = fecha.getTime();
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
	
	// Atributos/Propiedades
	private String nombre;
	private double sueldo;
	private Date altaContrato;

}
