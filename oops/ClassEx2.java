package oops;

class Emp{
	private String name="Gauri";
	private int employeId= 123;
	private int salary=200000;
	private String Cname="ABESIT";
	void changeCname() {
		Cname="Special Grade";
	}
	void show() {
		System.out.println(name+" "+ employeId+" "+salary+" "+Cname);
	}
	void input(String name1, int employeId1, int salary1,String Cname1) {
	name=name1;	
	employeId=employeId1;
	salary=salary1;
	Cname=Cname1;
	}
}
public class ClassEx2 {

	public static void main(String[] args) {
		Emp a=new Emp();
		Emp b=new Emp();
		Emp c=new Emp();
		Emp d=new Emp();
       a.show();
       b.show();
       c.show();
       d.show();
       
       a.input("Gojo", 0, 10000000, "jujutsu kaisan");
       b.input("yuuji", 2, 50000, "jujutsu kaisan");
       c.input("kakashi", 3, 50000, "jujutsu kaisan");
       d.input("megumi",1,50000,"jujutsu kaisan");
       a.changeCname();
       b.changeCname();
       a.show();
       b.show();
       c.show();
       d.show();
	}

}
