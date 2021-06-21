class cyclicarray{

	public static void main(String args[])
	{
		int ar[]={1, 2, 3, 4, 5};
		int n=ar.length;
		int temp=ar[4];
		for(int i=n-1;i>0;i--)
		{
			ar[i]=ar[i-1];
		}
	ar[0]=temp;
	for(int i=0;i<=n-1;i++)
	{
		System.out.print(ar[i]+" ");
	}
	}
}