/*Maximum sum of i*arr[i] among all rotations of a given array*/
class maxsum
{
	public static void main(String args[])
	{
		int a[]={8,3,1,2};
		int temp = a[0];
		int sum=0;
		/*for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i]*i;
			
			
		}
		System.out.println("sum= "+sum);
	*/
	for(int i=0;i<4;i++)
		{
			a[i]=a[i+1];
		}
		a[3]=temp;
		for(int i=0;i<=3;i++)
		{
			System.out.print(a[i]+" ");
		}
		
			
	}
}