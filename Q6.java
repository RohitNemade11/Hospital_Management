

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q6
{
	public static void main(String[] args) throws IOException 
	{
		int linecount=0;
		int wordcount=0;
		int charcount=0;
		//BufferedReader br=new BufferedReader(new FileReader("D:\\TestJune\\test1.txt"));
		BufferedReader br=new BufferedReader(new FileReader("D:\\TestJune\\test1.txt"));
		String str;
		
		while((str=br.readLine())!=null)
		{
			linecount++;
			charcount=charcount+str.length();
			String []arr=str.split("\\s+");
			wordcount+=arr.length;
		}
		 System.out.println("lines: " + linecount);
         System.out.println("words: " + wordcount);
         System.out.println("characters: " + charcount);
	}

}