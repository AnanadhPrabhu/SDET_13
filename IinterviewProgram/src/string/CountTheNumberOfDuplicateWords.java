package string;

import java.util.HashSet;

public class CountTheNumberOfDuplicateWords 
{
	public static void main(String[] args) 
	{
		String s="Welcome to India Welcome to India";

		String [] str=s.split(" ");
		
				
		HashSet<String> set= new HashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
			
		}
		
		int count1=0;
		 for(String str1:set)
		 {
			 int count=0;
			 
			 for(int i=0;i<str.length;i++)
			 {
				 if(str1.equals(str[i]))
				 {
					 count++;
				 }
			 }
			 	 if (count>1)
			 	 {
			 		count1++;
			 	 }
			 }
		 System.out.println(count1);
		 
		 
	}

}
