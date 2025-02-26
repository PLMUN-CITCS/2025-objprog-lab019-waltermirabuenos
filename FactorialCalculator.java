import java.util.Scanner;

public class FactorialCalculator {
    
    public static long factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer.");
        } else {
            System.out.println("The factorial of " + num + " is: " + factorial(num));
        }
        
        scanner.close();
    }
}
