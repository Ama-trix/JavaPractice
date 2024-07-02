package oops;
class Subject{
	private String name;
	private int subjectId;
	private int credits;
	void show() {
		System.out.println(name+" "+subjectId+ " "+credits);
	}
	Subject(String n){
		this("Hindi",23,2);
		System.out.println(name+" "+subjectId+ " "+credits);
		name=n;
		System.out.println(name+" "+subjectId+ " "+credits);
		
	}
	Subject(String n, int m, int o){
		name=n;
		subjectId=m;
		credits=o;
	}
	Subject(){
		this("hello");
		System.out.println("Hello its me");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Subject a=new Subject();
		Subject b=new Subject("English",77,2);
		a.show();
		b.show();
	}

}
