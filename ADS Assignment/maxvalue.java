/*Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed*/
class maxvalue
{
	public static void main(String args[])
	{
		int a[]={2,10,1,20};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i]*i;
		}
		System.out.println("maximum value of sum :  "+sum);
	}
}
