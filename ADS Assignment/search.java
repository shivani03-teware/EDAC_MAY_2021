/*Write a function to search a element from given array*/
class search
{
	static int lsearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
			return i;
		}
		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = {10,20,80,30,60,50,110,100,130,170};
		int key = 110;
		int result = lsearch(arr,key);
		if(result ==-1)
		{
			System.out.println("key is not present in the list:  " +result);
		}
		else
		{
			System.out.println("key is present at index: " +result);
		}
	}
}


