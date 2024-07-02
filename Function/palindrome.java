package Function;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Program to check whether a given number is pallindrome or not\nEnter the number");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n=sc.nextInt();
		int copy=0, sum=0,r;
		copy=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		if(copy==sum) {
			System.out.println("The given number is PALLINDROME");
		}
		else {
			System.out.print("The given number is NOT PALLINDROME");
		}
		sc.close();

	}

}
