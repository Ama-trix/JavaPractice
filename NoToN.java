import java.util.Scanner;

public class NoToN {
    public static void main(String args[]){
        System.out.println("Program to print the number to the n");
        try(Scanner sc = new Scanner(System.in)){
            int n= sc.nextInt();
            System.out.println("Countings are ");
            for(int i=0; i<=n;i++){
                System.out.println(i);
            }
        }

    }
}
