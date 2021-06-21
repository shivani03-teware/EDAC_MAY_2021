public class BinaryS{

    static  int BS(int arr[] , int key, int low, int high)
	{
		if(high>=low)
		{
			int mid=(low+high)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				return BS(arr, key, mid+1, high);
			}
			else if(key<arr[mid])
				return BS(arr, key, low, mid-1);
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		int key=2;
		int n= arr.length;
		int result = BS(arr, key, 0, n-1);
		if(result != -1)
		{
			System.out.println("result: "+result);
		}
		else
		{
			System.out.println("not found");
		}
	}
}