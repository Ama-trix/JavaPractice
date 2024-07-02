package Function;

public class primeornot {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int n= sc.nextInt();
		boolean flag=false;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        		flag=true;
        		break;
        	}
        }
        if(!flag) {
        	System.out.println("The number is prime");
        }
        else {
        	System.out.println("The number is not prime");
        }
        sc.close();
	}
}
