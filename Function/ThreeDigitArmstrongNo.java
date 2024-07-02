package Function;

public class ThreeDigitArmstrongNo {

	public static void main(String[] args) {
    java.util.Scanner sc= new java.util.Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int copy=num;
    int sum=0;
    while(num!=0) {
    	int r=num%10;
    	sum+=r*r*r;
    	num/=10;
    }
    if(copy==sum) {
    	
    	System.out.println("The given number is ARMSTRONG NUMBER");
    }
    else {
    	System.out.print("The given number is not ARMSTRONG NUMBER");
    }
    sc.close();
	}
}
