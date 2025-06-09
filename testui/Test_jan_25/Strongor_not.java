import java.util.Scanner;

public class Strongor_not {

        public static int factorial(int n) {   // calculation of facto
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // ffunction to check if a number is a strong number

    public static boolean Isnum(int number) {   
        int originalNumber = number, sum = 0;

        while (number > 0) {
            int digit = number % 10;   //  last digit
            sum += factorial(digit);   // Add its factorial to the sum
            number /= 10;              // Remove the  digit
        }

        return sum == originalNumber; // check if sum equals the original number
    }

    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);

        System.out.print("Enter a number:>>>> ");
        int number = xyz.nextInt();

        // Print the result
        
        String result = Isnum(number) ? "a strong number." : "not a Strong Number.";

        System.out.println(number + " is " + result);

        
    } 

 	
}




