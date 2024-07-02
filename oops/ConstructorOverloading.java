package oops;
class Animall{
	private String name="lion";
	private int age=10;
	void show() {
		System.out.println(name+" "+age);
	}
    Animall(){
    	System.out.println("This is default constructer");
    }
	Animall(String n, int m){
		name=n;
		age=m;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Animall a= new Animall();
     Animall b=new Animall("Tiger",4);
     a.show();
     b.show();
	}

}
