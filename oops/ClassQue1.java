package oops;
class A{
	int x;
	void m() {
		System.out.println("Hi A");
	}
}
public class ClassQue1 {

	public static void main(String[] args) {
		A a=new A();
		a.x=10;
	    a.m();
		A b=new A();
		b.x=40;
		System.out.println(a.x);
		System.out.println(b.x);
		b.m();
	}

}
