package string;

import java.util.HashSet;

public class CounttheduplicateCharacter
{

	public static void main(String[] args) 
	{
		String s="My name is Manikandan";
		
		char[] ch=s.toCharArray();
		
		HashSet<Character> set= new HashSet<Character>();
		
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
			
		}
		System.out.println(set);
		
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
			 if(count>1)
			 {
				 System.out.println(ch1+" "+count);
			 }
			
		 }

	}

}
