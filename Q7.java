
import java.util.ArrayList;
import java.util.*;
//import java.util.Scanner;

public class Q7 
{
  public static void main(String[] args) 
  {
      ArrayList<String> al = new ArrayList<>();
      Scanner xyz=new Scanner(System.in);
      for(int i=1;i<=5;i++)
		{
			System.out.print("Enter a name "+i+": ");
			String name=xyz.nextLine();
			al.add(name);
		}

      System.out.println("Display Name");
      for(String name:al) 
      {
          System.out.println(name);
      }
      
      System.out.println("Remove Name");
      al.remove(2);
      System.out.println(al);

      System.out.println("Reverse Order List");
      for(int i=al.size()-1;i>=0;i--) 
      {
          System.out.println(al.get(i));
      }
  }
}
