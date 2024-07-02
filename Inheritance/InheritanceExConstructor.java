
package Inheritance;
class AAA { //class AAA extends Object{  
	int x=10;
	AAA(){ super();
		System.out.println("Hi A");
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class W extends AAA{
	int y=20;
	W(){ super();
		System.out.println("Hi B");
	}
	void m2() {
		System.out.println("Hello B");
	}
}
public class InheritanceExConstructor {
	public static void main(String[] args) {
		AAA a=new AAA();
		W b=new W();
		a.m1();
		b.m2();
	}
}