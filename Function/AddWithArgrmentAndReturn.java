package Function;

public class AddWithArgrmentAndReturn {
	static int add(int x,int y){
		int r=x+y;
		return r;
	}
	public static void main(String[] args) {
        add(3,5);           //No printing of the value r
        System.out.println(add(3,9));
        System.out.println(add('a',6)); //askai v alue of a will be used
        int a=9;
        System.out.println(add(a,9));
//		java.util.Scanner sc= new java.util.Scanner(System.in);
//		System.out.println("Enter the two numbers to add");
//		int x=sc.nextInt();
//		int y=sc.nextInt();
//		sc.close();
		}

}
