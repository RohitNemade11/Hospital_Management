// Q: ! SEction B 

// reverse the string 

import java.util.*;
public class string
{
  public static void main(String args[])
  {
    Scanner xyz=new Scanner (System.in);   
                                         // getting the input as a string from the user .
    System.out.println("enter a string");
    String s=xyz.nextLine();
    String[] Rohit= s.split(" ");    //   For the space or gap between the String 
    for (int i=0;i<Rohit.length/2;i++) // create the array 
    {
            String temp = Rohit[i];
            Rohit[i] = Rohit[Rohit.length-1-i];
            Rohit[Rohit.length-1-i] = temp;
    }
	//print the output 	
	
        String revOutput = String.join(" ", Rohit);  // use to Join the the elemnts in the string .

        System.out.println(revOutput);

    }
}
  without using any inbuilt method , use charAt method 
