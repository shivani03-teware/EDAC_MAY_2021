class array1{

public static void main(String args[]){

int arr[]= {1,2,3,4,5};


for(int k=0;k<arr.length;k++)
{
	int temp =arr[4];
	for(int i=arr.length-1;i>0;i--)
	{
		arr[i]=arr[i-1];
	}
		arr[0]=temp;
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
System.out.println();
}
}
}