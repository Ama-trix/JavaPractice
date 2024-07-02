package oops;
class Bird{
	private String name;
	private int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Bird(){
		this("Crow",1);
		System.out.println("Bird");
	}
	Bird(String m, int n){
		name=m;
		age=n;
	}
	{
		System.out.println("Bird object is created");
	}
}
public class InitializeBlock {

	public static void main(String[] args) {
		Bird a=new Bird();
		a.show();
	}

}
