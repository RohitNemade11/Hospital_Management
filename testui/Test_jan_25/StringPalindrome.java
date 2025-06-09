
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        
        int length = str.length();
        boolean isPalindrome = true;

        
        for (int i = 0; i < length ; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

