package RunTimePolymorphism;

abstract class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract double calc_Salary();

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

class Faculty extends Person {
    private double Salary;

    public Faculty(String name, String address, double Salary) {
        super(name, address);
        this.Salary = Salary;
    }

    @Override
    public double calc_Salary() {
        return Salary + 0.2 * Salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: " + calc_Salary());
    }
}

public class Main {
    public static void main(String[] args) {
    	java.util.Scanner sc=new java.util.Scanner(System.in);
    	String Name=sc.next();
        String Address=sc.next();
        Double Salary=sc.nextDouble();
        Faculty Member = new Faculty(Name,Address,Salary);
        Member.displayDetails();
        sc.close();
    }
}