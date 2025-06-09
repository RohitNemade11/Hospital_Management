import java.util.*;

public class Q10 {
    public static void main(String[]args)
    {
        Scanner xyz= new Scanner(System.in);

        System.out.println("Enter the sentences");

        String s= xyz.nextLine();
       
        
        String[] words = s.split("\\s+");
        System.out.println(s);

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        
        System.out.println("\nWord Frequencies:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }


    }
}

















