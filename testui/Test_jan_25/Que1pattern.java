				// Section -A .
				// Q1.

public class Que1pattern 
{   public static void main(String[] args) 
    {	int k;
        for (int i = 1; i <= 5; i++) 
       { 
            for (int j=1;j<=5-i;j++) 
            {
                System.out.print(" ");
            }
            for(k==1)
            for (int j=1;j<=i;j++) 
            {
                if(j>1) 
                {
                    System.out.print("#");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i=5;i>=1;i--) 
        { 
            for (int j=1;j<=5-i;j++) 
            {
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++) {
                if (j > 1) {
                    System.out.print("#");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }
}