package Function;

public class AddDigitsOfANo {

	public static void main(String[] args) {
		System.out.println("Program to Add the Digits of a given Number\nEnter the Number");
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int num=sc.nextInt();
		int r,sum=0;
		while(num!=0) {
			r=num%10;
			sum=sum+r;
			num/=10;
		}
		System.out.println("The Addition of The Digits of the Number is " + sum);
		sc.close();
	}

}
