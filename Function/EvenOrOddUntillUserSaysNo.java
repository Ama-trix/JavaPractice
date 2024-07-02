package Function;

public class EvenOrOddUntillUserSaysNo {

	public static void main(String[] args) {
		System.out.println("Program to check if a number is even or odd until users says no");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter the number");
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("The given number is even");
			}
			else {
				System.out.println("The given number is odd");
			}
			System.out.println("Do you want to continue to find if the number is even or odd? [Yes/No]");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		sc.close();
		System.out.println("Thanks for using my aap");
	}

}
