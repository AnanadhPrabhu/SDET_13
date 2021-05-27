package string;
public class swapUsingTemp {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		System.out.println("BeforeSwap "+a +" "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		
		System.out.println("AfterSwap "+a +" "+b);
		

	}

}
