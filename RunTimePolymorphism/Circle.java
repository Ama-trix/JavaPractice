package RunTimePolymorphism;
public class Circle extends Shape {
private double ar;
void area() {
	java.util.Scanner sc= new java.util.Scanner(System.in);
	System.out.println("Enter the radius");
	double r=sc.nextDouble();
	ar= 22/7 * r*r;
	sc.close();
	}
void show() {
	System.out.println("The area of Circle is "+ar);
}
}
