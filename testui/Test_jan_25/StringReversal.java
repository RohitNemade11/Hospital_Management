import java.util.*;

public class StringReversal {
    public static void main(String args[]) {
        Scanner xyz = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter a string:");
        String s = xyz.nextLine();

       
        String reversedString = "";  
        String tempWord = "";  

                for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
               
                reversedString = tempWord + (reversedString.isEmpty() ? "" : " ") + reversedString;
                tempWord = "";             } else {
                tempWord += c; 
            }
        }

              reversedString = tempWord + (reversedString.isEmpty() ? "" : " ") + reversedString;

        
        System.out.println("Reversed string: " + reversedString);
    }
}
 make it more easy like this 