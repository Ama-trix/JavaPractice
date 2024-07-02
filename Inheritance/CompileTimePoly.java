package Inheritance;

class Addition{
	void Add(int x, int y) {
		int sum=x+y;
		System.out.println("The sum of two numbers is "+ sum);
	}
	void Add(String x, String y) {
		String sum=x+y;
		System.out.println("The sum of two Strings is "+ sum);
	}
	void Add(double x, double y) {
		double sum= x+y;
		System.out.println("The sum of Two Double numbers is "+ sum);
	}
}
public class CompileTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a=new Addition();
		Addition b=new Addition();
		a.Add(79, 89);
		a.Add("Gojo","Sataru");
		b.Add(8.9, 4);
	}

}
