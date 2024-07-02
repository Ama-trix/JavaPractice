package oops;

public class ClassQue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a= new AAA();
		AAA b= new AAA();
		a.x=15;
		a.show();
		a.y="YoYo";
		b.show();
		b.y="Ramu";
		a.show();
		b.show();
	}

}
class AAA{
int x=10;
String y="Rahul";
void show() {
System.out.println(x+y);
}
}
