package string;
public class ReversetheCharacterofGivenString0 
{
	public static void main(String[] args)
	{
		String s1="prabhu";
		String s2="";
		char[] ch=s1.toCharArray();
		
		System.out.println(ch);
		
		for(int i=ch.length-1;i>=0;i--)
		{
			s2=s2+ch[i];
			
		}
		
		System.out.println(s2);
	}
}
