package oops;
class Organism{
	private String name;
	private int age;
	public static String COLOR;
	public void show() {
		System.out.println(name+" "+age+" " +COLOR);
	}
	public void input(String n,int a) {
		name=n;
		age=a;
	}
	public static void display() {
		System.out.println("Hi Animal");
		System.out.println(COLOR);
	}
	static {
		System.out.println("Hello Animal");
		COLOR="White";
	}
	
}
public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("Hello Main");
		System.out.println(Organism.COLOR);
		Organism a=new Organism();
		Organism b=new Organism();
		Organism c=new Organism();
		a.input("Dog", 4);
		b.input("Cat", 6);
		c.input("Tiger", 9);
		Organism.COLOR="Red";
		Organism.display();
	}
	static {
		System.out.println("INCAPP");
	}

}
