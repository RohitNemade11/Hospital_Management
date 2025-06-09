

import java.util.*;

class StringOperation
{
	String str;
	StringOperation(String str)
	{
		this.str=str;
	}
	void displayChar(char ch)
	{
		int index=str.indexOf(ch);
		if(index==-1)
		{
			System.out.println("Alphabet not available");
		}
		if(index>0)
		{
			char result=str.charAt(index-1);
			System.out.println(result);
		}
		if(index<str.length()-1)
		{
			char result=str.charAt(index+1);
			System.out.println(result);
		}
	}
}
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=xyz.nextLine();
		
		System.out.print("Enter character to search: ");
		char ch=xyz.next().charAt(0);

		StringOperation s=new StringOperation(str);
		s.displayChar(ch);
	}
     
     
}
