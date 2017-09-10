package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] people = new Person[2];
		
		people[0] = new Employee("Luis Conde", 50000, 2009, 02, 25);
		people[1] = new Student("Ana Lopez", "Biology");
		
		for (Person p: people) {
			System.out.println(p.getName() + ", " + p.getDescription());
		}
		
	}

}


abstract class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// Abstract method
	public abstract String getDescription();
}

class Employee extends Person {
	
	// Attributes
	private double salary;
	private Date altaContrato;
	private static int IdNext;
	private int Id;
	
	// Constructor
	public Employee(String name, double sue, int agno, int mes, int dia) {
		super(name);
		salary = sue;
		GregorianCalendar fecha = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = fecha.getTime();
		++IdNext;
		Id = IdNext;
	}
	
	public String getDescription() {
		return "Este empleado tiene un Id=" + Id + " con un sueldo=" + salary;
	}
	
	// getter salary
	public double getSalary() {
		return salary;
	}
	
	// getter altaContrato
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	// setter
	public void subeSalary(double percentage) {
		double aumento = salary * percentage / 100;
		salary += aumento;
	}

}


class Student extends Person {
	
	private String carrer;
	
	public Student(String name, String carrer) {
		super(name);
		this.carrer = carrer;		
	}
	
	public String getDescription() {
		return "Este alumno esta estudiando la carrera de " + carrer;
	}
	
}
