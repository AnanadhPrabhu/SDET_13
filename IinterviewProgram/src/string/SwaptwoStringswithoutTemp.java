package string;
public class SwaptwoStringswithoutTemp 
{
public static void main(String[] args) 
{
	 String s1="prabhu";
	 String s2="anandh";
	 
	 System.out.println("BeforeSwap "+s1 +" "+s2);
	 
	 s1=s1+s2;
	 
	 System.out.println(s1);//12
	 
	 s2=s1.substring(0, s1.length()-s2.length());//12-8=4
	 
	 System.out.println(s2);
	 
	 s1=s1.substring(s2.length());
	 System.out.println(s1);
	 
	 System.out.println("AfterSwap "+ s1 +" "+ s2);
}
}
