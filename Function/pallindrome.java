package Function;

public class pallindrome {

	public static void main(String[] args) {
		System.out.println("Program to check whether a number is pallindrome or not");
		System.out.println("Enter the number");
        java.util.Scanner sc= new java.util.Scanner(System.in);
        int num=sc.nextInt();

        int copy=num;
        Pallindrome(num,copy);
        if(Pallindrome(num ,copy)==copy) {
        	System.out.println("The number is pallindrome");
        }
        else {
        	System.out.println("The number is not pallindrome");
        }
        sc.close();
        
	}
	static int Pallindrome(int num,int copy) {
		 int r;
        int sum=0;
        while(num>0) {
        	r=num%10;
        	sum=(sum*10)+r;
        	num/=10;
        }
        return sum;
	}
}
	