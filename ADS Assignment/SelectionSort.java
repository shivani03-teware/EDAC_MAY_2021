public class SelectionSort
{
	public static void main(String args[])
	{
	int arr[]={7,5,4,2};
	int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int min=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[min])
				{
					min=j;
				}
				temp=arr[min];
				arr[min]=arr[j];
				arr[j]=temp;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}