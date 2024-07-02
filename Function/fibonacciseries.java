package Function;

public class fibonacciseries {

	public static void main(String[] args) {
    System.out.println("Prrogram to find fibonacci Series");
    System.out.println("Enter the First two Numbers");
    java.util.Scanner sc= new java.util.Scanner(System.in);
    int n1= sc.nextInt();
    int n2=sc.nextInt();
    System.out.println("Enter the number upto you want to print the fibonacci series");
    int counter= sc.nextInt();
    int n=0;
    for(int i=0;i<=counter;i++) {
    
    	System.out.println(n1);
        n=n1+n2;
        n1=n2;
        n2=n;
        
    }
    sc.close();
	}

}
