class Que2{

public static void main(String args[]){

int arr[]={1,2,3,4,5,6,7,8,9,10};			//-->arr.length.....arr1[5]={1 to  5}............arr2[5]={6 to 10}

int n = arr.length;

int arr1[]= new int[n/2];						//--> int arr1[]= new int[arr.length/2];
int arr2[]= new int[n/2];

int k=0;
int l=0;
for(int i=0;i<arr.length;i++)
{
		if (i<n/2)
		{
			arr1[k]=arr[i];
			k++;
		}
		else
		{		
			arr2[l]=arr[i];
			l++;
		}
}

for(int i=0;i<n/2;i++)
{
	System.out.print(arr1[i]+"  ");
	
}
System.out.println();
for(int i=0;i<n/2;i++)
{
	System.out.print(arr2[i]+"  ");
	
}
}
}