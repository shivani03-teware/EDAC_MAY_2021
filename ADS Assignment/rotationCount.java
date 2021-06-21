/*Find the Rotation Count in Rotated Sorted array*/
class rotationCount
{
	public static void main(String args[])
	{
		int a[]={2,3,6,12,15,18};
		int n= a.length;
		
		for(int j=0; j<2; j++)
		{
			if(a[j]==
			int temp=a[5];
			for(int i=n-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
		for(int i=0;i<=n-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}