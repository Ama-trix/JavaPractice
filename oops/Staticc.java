package oops;
class Empp{
	String name;
	int Age;
	int Id;
	int salary;
	static String company;
	void  display() {
		System.out.println(name+" "+Id+" " +Age+" "+salary+" ");
	}
	static void show() {
//		System.out.println(name+" "+Age+" "+Id+ " "+salary+" "+company);        
		System.out.println(company);
	}
	void input(String n,int m,int o, int p) {
		name=n;
		Age=m;
		Id=o;
		salary=p;
	}
	static {
		System.out.println("Its a static block");
	}
	Empp(){
		System.out.println("Its a constructer");
	}
	
}

public class Staticc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Empp a=new Empp();
     Empp b=new Empp();
     Empp c=new Empp();
     Empp d=new Empp();
     
     a.input("Tanziro", 19, 1,100000);
     b.input("Nizuko",18,2,1000000);
     c.input("Inosuke", 20, 3, 10000000);
     d.input("Zenitsu",21,4,1000000000);
     Empp.company="Demon Slayer";
     a.display();
     b.display();
     c.display();
     d.display();
     System.out.println("The company of these employes is");
     System.out.println(Empp.company);
	}

}
