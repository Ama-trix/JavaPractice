package Function;

public class noofdigitsinano {

	public static void main(String[] args) {
    System.out.println("Program to find number of digits in a number\nEnter the number");
    java.util.Scanner sc= new java.util.Scanner(System.in);
    int x=sc.nextInt();
    int i=0;
    while(x!=0) {
    	x/=10;
    	i+=1;
    }
    System.out.print("The number of digits in the given number is "+i);
    sc.close();	}

}
