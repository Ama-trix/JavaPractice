package oops;
class Animal{
	int num=9;
	private String name;
	private int age;
	private String breed;
	static String zoo;
	Animal(String n, int m, String o){
		System.out.println("Animal Created");
		System.out.println(num);
		name=n;
		age=m;
		breed=o;
	}
	static {
		System.out.println("This is static block");
		zoo="Delhi";
	}
	void show() {
		System.out.println(name+" "+age+" "+breed+" "+zoo);
	}
}

public class ParametrizedConstructor {

	public static void main(String[] args) {
		System.out.println(Animal.zoo);
     Animal a=new Animal("Tiger",10,"Siberian");
    Animal b=new Animal("Lion",9,"Asian");
    a.show();
    b.show();    
	}

}
