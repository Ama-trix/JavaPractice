import java.util.Scanner;

public class namaste {
    public static void main(String args[]){
        System.out.println("press 1 for namaste \n press 2 for bonjour \n press 3 for hello");
        try(Scanner sc = new Scanner(System.in)){
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Namaste");
            break;
            case 2:
        System.out.println("Bonjour");
        break;
        case 3: 
        System.out.println("Hello");
        break;
        }
    }
}
}
