package Inheritance;
class XX{
	int x=10;
	static int h=40;
	void m1() {
		System.out.println("Hello A");
	}
	static void m2() {
		System.out.println("Hi A");
	}
	void xyz() {
		System.out.println("yhjudsgfdhjs");
	}
}
class YY extends XX{
	int y=20;
	int x=90; //Data Hiding
	static int h=60; //Data Hiding
	 void m1() {  //Method overriding
		System.out.println("Hello B");
	}
	static void m2() { //Method Hiding
		System.out.println("Hi B");
	}
}
public class RunTimePolyQue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YY b=new YY();
		System.out.println(b.x);
		b.m1();
		YY.m2();
		//b.m2();
		b.xyz();
	}

}
