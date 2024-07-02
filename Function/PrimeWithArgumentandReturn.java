package Function;

public class PrimeWithArgumentandReturn {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String choice;
        do {
            System.out.println("Program to check whether a number is prime or not");
            System.out.println("Enter the number");
            int num = sc.nextInt();
            if (isPrime(num)) {
                System.out.println("The given number is prime");
            } else {
                System.out.println("The given number is not prime");
            }

            System.out.println("Do you want to continue [yes/no]");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
        sc.close();
    }
}
