import java.util.Scanner;

public class lastQues {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n--- Wrapper Class Menu ---");
            System.out.println("1. Convert Double Wrapper Object to String");
            System.out.println("2. Convert String into Integer");
            System.out.println("3. Convert String into Integer Wrapper Object");
            System.out.println("4. Convert Integer Wrapper Object to int value");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = xyz.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter a double value: ");
                    double value = xyz.nextDouble();
                    Double doubleWrapper = Double.valueOf(value);
                    String stringValue = doubleWrapper.toString();
                    System.out.println("String representation: " + stringValue);
                    break;
                }

                case 2: {
                    System.out.print("Enter a string representing an integer: ");
                    xyz.nextLine(); // Consume the newline left by nextInt()
                    String str = xyz.nextLine();
                    try {
                        int intValue = Integer.parseInt(str);
                        System.out.println("Converted integer: " + intValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid integer string.");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter a string representing an integer: ");
                    xyz.nextLine(); // Consume the newline left by nextInt()
                    String str = xyz.nextLine();
                    try {
                        Integer integerWrapper = Integer.valueOf(str);
                        System.out.println("Converted Integer Wrapper Object: " + integerWrapper);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid integer string.");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter an integer: ");
                    int intValue = xyz.nextInt();
                    Integer integerWrapper = Integer.valueOf(intValue);
                    int primitiveValue = integerWrapper.intValue();
                    System.out.println("Primitive int value from Integer Wrapper Object: " + primitiveValue);
                    break;
                }

                case 5: {
                    System.out.println("Exiting the program.");
                    xyz.close();
                    System.exit(0);
                }

                default: {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }
        }
    }
}
