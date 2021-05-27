package string;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords 
{
	public static void main(String[] args) 
	{
		String s="Welcome to India Welcome to Tamilnadu";
		String[]str=s.split(" ");
		
		LinkedHashSet<String> set =new LinkedHashSet<String> ();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
			
		}
	//String rev="";
		for(String str1 :set)
		{
		//rev=rev+str1+" ";
			System.out.print(str1+ " ");
		}
		//System.out.println(rev);
		

	}

}
