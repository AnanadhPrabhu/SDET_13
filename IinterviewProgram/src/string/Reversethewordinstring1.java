package string;
public class Reversethewordinstring1 {

	public static void main(String[] args) 
	{
		String s="Mahendra Singh Dhoni";
		String [] s1=s.split(" ");
	    
				
		System.out.println(s);
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		

	}

}
