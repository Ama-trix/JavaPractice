package oops;

class Area{
	 double length;
	 double breadth;
	void setDim(){
		System.err.println("Entet the length and breadth respectively");
	     java.util.Scanner sc=new java.util.Scanner(System.in);
	     length=sc.nextInt();
	     breadth=sc.nextInt();
	     sc.close();
	
	}
	double getArea() {
		double Area=length*breadth;
		return Area;
	}
}
public class ClassQue5 {

	public static void main(String args[]) {
		Area a=new Area();
	    a.setDim();
	    double Area= a.getArea();

		System.out.println("The area of reactange is "+Area);

	}
}
