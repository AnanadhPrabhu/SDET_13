package string;

import java.util.HashSet;

public class CounttheCharacter 
{

	public static void main(String[] args) 
	{
		String s="abcdef";
		
		char[] ch=s.toCharArray();
		
		HashSet<Character> set= new HashSet<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
			
		}
		 for(Character ch1:set)
		 {
			 int count=0;
			 
			 for(int i=0;i<ch.length;i++)
			 {
				 if(ch1==ch[i])
				 {
					 count++;
				 }
			 }
			 System.out.println(ch1+" "+count);
			
		 }
	}

}
