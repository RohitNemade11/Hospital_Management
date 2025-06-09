import java.util.*;
public class Anagram
{
   public static void main(String[]args)
   {
      Scanner xyz= new Scanner(System.in);
	  
	   
	  System.out.println("Enter the two String");
	  
	 String s1=xyz.nextLine();
	  String  s2=xyz.nextLine();
	  
	  s1=s1.toLowerCase();
	  s2=s2.toLowerCase();
		
		boolean flag= true;
		
		int a[]= new int[26];
		
		for(int i=0; i< s1.length(); i++)
		{
			a[s1.charAt(i)-'a']++;
		
		
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			a[s2.charAt(i)-'a']--;
		
		   
		}
		
		for(int i=0; i<a.length; i++)
		{
		    if(a[i] !=0)
			{
			   flag=false;
			   break;
			
			}
		}
		
		if(flag)
		{
		   System.out.println("Anagram");
		}
		else
		{
		  System.out.println("Not Anagram");
		}
		
		
   }
}