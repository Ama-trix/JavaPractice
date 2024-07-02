package RunTimePolymorphism;

public class Triangle extends Shape {
	private double ar;
     void area(){ 
		double b=6.4,h=7.1;
		ar=b*h/2;
	}
      void show(){
		System.out.println("Triangle's Area: "+ar);
	}
}
