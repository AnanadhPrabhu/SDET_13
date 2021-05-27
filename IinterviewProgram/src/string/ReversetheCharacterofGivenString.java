package string;
public class ReversetheCharacterofGivenString
{
public static void main(String[] args)
{
	String s1="anandhk";
	String s2="";
	char[] ch=s1.toCharArray();
	System.out.println(ch);
	
	for(int i=0;i<ch.length;i++)
	{
		s2=ch[i]+s2;
		
	}
	System.out.println(s2);
}
}
