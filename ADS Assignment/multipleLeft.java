/*Quickly find multiple left rotations of an array*/
class multipleLeft
{
	public static void main(String args[])
	{
		int a[]={1,3,5,7,9};
		int key=1;
		int temp=a[0];
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
		a[i]=a[i+1];
		}
		a[4]=temp;
		for(int i=0;i<=n-1;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
}
