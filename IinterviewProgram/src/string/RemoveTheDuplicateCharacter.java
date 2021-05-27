package string;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharacter 
{

	public static void main(String[] args) 
	{
		String s="prabhu";
		char[] ch=s.toCharArray();
		
		LinkedHashSet<Character> set =new LinkedHashSet<Character> ();
		
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
			
		}
	//	String rev="";
		for(Character ch1 :set)
		{
		//	rev=rev+ch1;
			System.out.print(ch1);
		}
		//System.out.println(rev);
		

	}

}
