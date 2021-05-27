package string;
public class SwapForStringUsingTemp 
{
 public static void main(String[] args)
 {
	 
	 String s1="anandh";
	 String s2="prabhu";
	 System.out.println("BeforeSwap "+s1 +" "+s2);
	 String temp=s1;
	 s1=s2;
	 s2=temp;
	 System.out.println("AfterSwap "+s1 +" "+s2);
 }
}
