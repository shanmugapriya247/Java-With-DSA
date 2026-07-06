public class LinearSearch
{
	public static void main(String[] args) 
	{
	    int[] arr = {5,7,2,3,10,1};
	    int target = 3;
	    for (int i=0; i < arr.length; i++)
	    {
	        if(arr[i] == target)
	        {
	            System.out.println("Found:" + i);
	            return;
	        }
	    }
	    System.out.println("Not found"); //or -1
	
	}
}