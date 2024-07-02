package Inheritance;
class Animal{
	void eat() {
		System.out.println("Animals' eat");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog's Eat");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cat's Eat");
	}
}
public class RunTimePolyQue2 {

	public static void main(String[] args) {
      Animal a= new Animal();
      a.eat();
      a=new Dog();
      a.eat();
      Animal b =new Animal();
      b.eat();
      Animal c=new Dog();
      c.eat();
      Animal d=new Cat();
      d.eat();
	}

}
