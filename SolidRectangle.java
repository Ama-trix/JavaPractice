import java.util.Scanner;

public class SolidRectangle {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows");
            int n = sc.nextInt();
            System.out.println("Enter the numners of column");
            int m= sc.nextInt();
            System.out.println(" The pattern is");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++)
                System.out.print("*");
            System.out.println();
            }

    }
}
}

