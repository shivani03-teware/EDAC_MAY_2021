class arrayrotation{

	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7};
		int n=arr.length;
		
	
		for(int i=0; i< 2 ;i++)
		{
			
				int temp=arr[0];
				for(int j=0; j< n-1 ;j++)
				{
					arr[j]=arr[j+1];
				}
				arr[n-1]=temp;
				
			
		}
			for(int k=0;k<n;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
	}
}