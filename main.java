import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask for user input
        System.out.print("Enter an integer: ");
        int inputNumber = input.nextInt();
        
        // Calls the recursive method
        int result = recursion(inputNumber, inputNumber);
        
        // Outputs the result
        System.out.println("\nResult: " + result);
    }

    // Runs the recursion method, always multiples by 1 at the end, as the exponent will be 0.
    public static int recursion(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * recursion(base, exponent - 1);
        }
    }
}