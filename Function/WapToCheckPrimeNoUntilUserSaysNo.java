package Function;

public class WapToCheckPrimeNoUntilUserSaysNo {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Program to check whether a number is prime or not until users say no");
		String choice;
		int r=0;
		do {
			System.out.println("Enter the number");
			int n=sc.nextInt();
		    for(int i=2;i<=n/2;i++) {
		    	r=n%2;
		    	if(r==0) {
		    		System.out.println("The given number is not prime");
		    	}
		    	else {
		    		System.out.println("The given number is prime");
		    	}
		    }
		    System.out.println("Do you want to continue? [Yes/No");
		    choice=sc.next();
		}while(choice.equalsIgnoreCase("Yes"));
		sc.close();
	}
}
