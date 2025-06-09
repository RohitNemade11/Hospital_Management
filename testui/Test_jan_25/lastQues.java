import java.util.Scanner;

public class lastQues 
{
    public static void main(String args[]) 
    {
        Scanner xyz = new Scanner(System.in);
        int choice;
        while (true) 
        {
            System.out.println("\n--- Wrapper Class Menu ---");
            System.out.println("1. Convert Double Wrapper Object to String");
            System.out.println("2. Convert String into Integer");
            System.out.println("3. Convert String into Integer Wrapper Object");
            System.out.println("4. Convert Integer Wrapper Object to int value");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = xyz.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.println("Enter a double value");
                    double Value = xyz.nextDouble();
                    Double a = Double.valueOf(Value);
                    String b = "" + a; 
                    System.out.println(b);
                    break;

                case 2:
                    System.out.print("Enter a string representing an integer: ");
                    xyz.nextLine();  
                    String str = xyz.nextLine();
                    try {
                        int Value = Integer.parseInt(str);  // Using parseInt method
                        System.out.println(Value);
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Invalid");
                    }
                    break;

                case 3:
                    System.out.print("Enter a string representing an integer: ");
                    xyz.nextLine();  
                    String str1 = xyz.nextLine();
                    try {
                        Integer Value1 = Integer.parseInt(str1);  // Using parseInt method
                        System.out.println(Value1);
                    } 
                   catch (Exception e) 
                   {
                        System.out.println("Invalid");
                    }
                    break;

                case 4:
                    System.out.print("Enter an integer: ");
                    int Value2 = xyz.nextInt();
                    Integer wrap = Integer.valueOf(Value2);
                    int intValueFromObject = wrap.intValue();  // Corrected the method call
                    System.out.println(intValueFromObject);
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    xyz.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
