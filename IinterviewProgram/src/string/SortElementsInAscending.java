package string;
class SortElementsInAscending 
{
	  
   public static void main(String[] args) 
   
   {
	
	   int []arr= {30,10,20,40,50,60};//when we know size and value
       
	  // int [] arr1=new int[6];//when we know size and  not know about value
	   
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
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }

    }
}
