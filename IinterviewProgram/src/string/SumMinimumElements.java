package string;
public class SumMinimumElements 
{
	public static void main(String[] args) 
	   
	   {
		
		   int []arr= {30,10,20,40,50,60};//when we know size and value
	       

		    for(int i=0;i<arr.length;i++)
		   {
			   for(int j=i+1;j<arr.length;j++)
			   {
				   if(arr[i]>arr[j])
				   {
					   int temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
			   }
			  
		   }
		  int sum=0;
		  for(int i=0;i<3;i++)
		  {
		    sum=sum+arr[i];
			  
		  }
		  System.out.println(sum);
		    
		   }

}
