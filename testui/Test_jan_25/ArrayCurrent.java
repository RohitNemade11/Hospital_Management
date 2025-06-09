import java.util.*;
public class ArrayCurrent
{
   public static void main(String[]args)
   {
      Scanner xyz= new Scanner(System.in);
	  System.out.println("Enter the elemnt for Array length");
	  int n=xyz.nextInt();
	  int a[]= new int[n];
	  
	  System.out.println("Enter the elements in the array");
	  
	  for(int i=0; i<a.length; i++)
	  {
		  a[i]=xyz.nextInt();
	  }
	  
	  int res[]= new int[a.length];
	  
	  
        for (int i = 0; i < a.length; i++) {
            int product = 1;
            for (int j = 0; j < a.length; j++) {
                if (i != j) { 
                    product *= a[j];
                }
            }
            res[i] = product;
        }

        System.out.println("Product is ");
        System.out.println(Arrays.toString(res));
    }
}
   
