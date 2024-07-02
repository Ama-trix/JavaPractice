package RunTimePolymorphism;

public class Rectange extends Shape {
	double area;
  void area() {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.println("Enter the length");
	 double l=sc.nextDouble();
	 System.out.println("Enter the breadth");
	 double b=sc.nextDouble();
	  area=l*b;
	 sc.close();
	 
 }
  void show() {
	  System.out.println("The area of the Rectangle is "+ area);
  }
}
