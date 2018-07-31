package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {

	public static void main(String[] args) {

		
		Jefatura jefeRH = new Jefatura("Adrian", 240000, 2006, 9, 25);
		
		jefeRH.setIncentivo(2570);
		
		Empleado[] myEmployees = new Empleado[6];
		
		myEmployees[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		
		myEmployees[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		
		myEmployees[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		
		myEmployees[3] = new Empleado("Anthony Fernandez");
		
		myEmployees[4] = jefeRH; // Polimorfismo. Principio de sustitución
		
		myEmployees[5] = new Jefatura("Luisana", 95500, 1999, 5, 26);
		
		Jefatura jefeFinanzas = (Jefatura)myEmployees[5];
		
		jefeFinanzas.setIncentivo(55000);
		
		System.out.println(jefeFinanzas.makeDecision("dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El Jefe " + jefeFinanzas.getName() + " tiene un Bonus de "
				+ jefeFinanzas.setBonus(500));
		
		System.out.println("El Empleado " + myEmployees[3].getName() + " tiene un Bonus de "
				+ myEmployees[3].setBonus(200));
		
		for (Empleado e: myEmployees) {
			e.subeSueldo(5);
		}
		
		Arrays.sort(myEmployees);
		
		for (Empleado e: myEmployees) {
			System.out.println("Nombre: " + e.getName() + " Sueldo: "
					+ e.getSalary());
		}

	}

}

class Empleado implements Comparable, Chief {
	
	// Metodo Constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		name = nom;
		salary = sue;
		GregorianCalendar fecha = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = fecha.getTime();
	}
	
	// Sobrecarga del metodo constructor
	public Empleado(String nombre) {
		this(nombre, 30000, 2000, 01, 01);
	}
	
	// getter name
	public String getName() {
		return name;
	}
	
	// getter salary
	public double getSalary() {
		return salary;
	}
	
	// getter altaContrato
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	// metodo setter
	public void subeSueldo(double porcentaje) {
		double aumento = salary * porcentaje / 100;
		salary += aumento;
	}
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado)miObjeto;
		
		if (this.salary < otroEmpleado.salary) return -1;
		
		if (this.salary > otroEmpleado.salary) return 1;
		
		return 0;
	}
	
	public double setBonus(double gratificacion) {
		return baseBonus + gratificacion;
	}
	
	// Atributos/Propiedades
	private String name;
	private double salary;
	private Date altaContrato;

	@Override
	public String makeDecision(String decision) {
		return null;
	}
}


class Jefatura extends Empleado implements Chief {
	
	private double incentivo;
	
	public Jefatura(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSalary() {
		return super.getSalary() + incentivo;
	}
	
	public String makeDecision(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de " + decision;
	}
	
	public double setBonus(double bonus) {
		double base = 2000;
		return baseBonus + bonus + base;
	}
}
