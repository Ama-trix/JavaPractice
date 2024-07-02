package Inheritance;
class Add{
	int sum(int x, int y) {
		int sum=x+y;
		return sum;
	}
	double sum(double x, double y) {
		double sum= x+y;
		return sum;
		
	}
}
class Addd extends Add{
	static String sum(String x, String y) {
		String sum=x+y;
		return sum;
	}
}
public class ComplieTimePolyQue2 {
	public static void main(String[] args) {
		Addd a= new Addd();
		a.sum(45, 1);      // The return will not be shown on the console
//		a.sum("hello", "nanami");
		Addd.sum("hello", "yuta");
		a.sum(4.6, 1);
		System.out.println(a.sum(44, 1));
		System.out.println(a.sum(2.33, 3));
		System.out.println(Addd.sum("Hey","Maki"));
	}
}
