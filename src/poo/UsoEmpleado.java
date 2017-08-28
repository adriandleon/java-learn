package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Empleado {
	
	// Metodo Constructor
	public void Empleado(String nom, double sue, int agno, int mes, int dia) {
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
