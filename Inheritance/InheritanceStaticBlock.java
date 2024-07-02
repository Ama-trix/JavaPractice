package Inheritance;
class Bottle{
	 String brand;
	 String type;
	 int capacity;
	void method() {
		System.out.println(brand+" "+type+" "+capacity);
	}
	static {
		System.out.println("hey its a static block of Bottle(ParentClass)");
	}
	{
		System.out.println("Hey its an anonymous block of ClassBottle");
	}
}
class BB extends Bottle{
	int cost;
	String category;
	void show() {
		System.out.println(brand+" "+type+" "+capacity+" "+cost+" "+category);
	}
	static {
		System.out.println("Its the static block of BB class");
	}
	{
		System.out.println("Hey its an anonymous block of class BB");
	}
}
public class InheritanceStaticBlock {

	public static void main(String[] args) {
        Bottle a= new Bottle();
        a.capacity=1;
        a.brand="milton";
        a.type="light";
        BB b=new BB();
        b.category="heavy";
        b.type="medium";
        a.method();
        b.show();
	}

}
