package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class TestPerson {

    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new WorkerInner("Luise Parker", 50000, 2009, 2, 25);
        people[1] = new Student("Ana Lopez", "Biology");

        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}

abstract class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract String getDescription();
}

class WorkerInner extends Person {

    // Attributes
    private double salary;
    private Date startDate;
    private static int IdNext;
    private int Id;

    // Constructor
    WorkerInner(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        GregorianCalendar date = new GregorianCalendar(year, month - 1, day);
        startDate = date.getTime();
        ++IdNext;
        Id = IdNext;
    }

    public String getDescription() {
        return "This employee has an Id=" + Id + " with salary=" + salary;
    }

    // getter salary
    double getSalary() {
        return salary;
    }

    // getter startDate
    public Date getStartDate() {
        return startDate;
    }

    // setter
    public void raiseSalary(double percentage) {
        double raise = salary * percentage / 100;
        salary += raise;
    }
}

class Student extends Person {

    private String career;

    Student(String name, String career) {
        super(name);
        this.career = career;
    }

    public String getDescription() {
        return "This student is in " + career + " career";
    }
}
