package string;
public class Reversethewordinstring 
{

	public static void main(String[] args) 
	{
		String s="thala Dhoni";
		String [] s1=s.split(" ");
	    
		System.out.println(s);
		
		String rev="";
		for(int i=0;i<s1.length;i++)
		{
			rev=s1[i]+" "+rev;
		}
		System.out.println(rev);
	}

}
