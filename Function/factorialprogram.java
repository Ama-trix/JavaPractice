package Function;

public class factorialprogram {

	public static void main(String[] args) {
     System.out.println("Program to find the factorial\nEnter the number to find it's factorial");
     java.util.Scanner sc= new java.util.Scanner(System.in);
     int n =sc.nextInt();
     int factorial =1;
     int i=1;
     while(i<=n){
    	 factorial=factorial*i;
    	 i++;
     }
     System.out.println("The factorial of the numner is "+factorial);
     sc.close();
	}

}
