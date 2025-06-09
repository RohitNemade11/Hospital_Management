import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int choice;

        do {
            
            
            System.out.println("1. ArithmeticException");
            System.out.println("2. NullPointerException");
            System.out.println("3. NumberFormatException");
            System.out.println("4. ArrayIndexOutOfBoundsException");
            System.out.println("5. ClassNotFoundException");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = xyz.nextInt();

            switch (choice) {
                case 1:
                try {
                        int result = 10 / 0;
                    } catch (ArithmeticException e) {
                        System.out.println("found ArithmeticException: " + e.getMessage());
                    }
                    break;

                case 2:
                    
                    try {
                        String str = null;
                        System.out.println(str.length());
                    } catch (NullPointerException e) {
                        System.out.println("found NullPointerException: " + e.getMessage());
                    }
                    break;

                case 3:
                try {
                        String invalidNumber = "abc";
                        //int num = Integer.parseInt(invalidNumber);
                        
                    } catch (NumberFormatException e) {
                        System.out.println("found NumberFormatException: " + e.getMessage());
                    }
                    break;

                case 4:
                    // ArrayIndexOutOfBoundsException
                    try {
                        int[] arr = {1, 2, 3};
                        System.out.println(arr[5]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("found ArrayIndexOutOfBoundsException: " + e.getMessage());  
                    }
                    break;

                case 5:
                                        try {
                        Class.forName("abcd"); 
                    } catch (ClassNotFoundException e) {
                        System.out.println("found ClassNotFoundException: " + e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }

        } while (choice != 6);

     
    }
}
