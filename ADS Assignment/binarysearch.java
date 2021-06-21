class binarysearch
{
static int BS(int arr[], int key , int low, int high){
	if(high>=low)
	{
		int mid=(low+high)/2;  //calculate mid value
		if(arr[mid] == key)        // if mid value equals to key return mid value
		{
			return mid;
		}
		else if(key < arr[mid])  // key value is lower  than mid value then mid-1
		{
			return BS(arr,key,low,mid-1);
		}
		else if(key > arr[mid])
		{
			return BS(arr,key,mid+1,high);
		}
	}
	return -1;
}
	public static void main(String args[]){

	int arr[]={20,31,35,37,40,};
	int key=20;
	int n=arr.length;
	int result=BS(arr,key,0,n-1);
	if(result != -1)
	{
		System.out.println("result: "+result);
	}
	else
	{
		System.out.println("not found");
	}
}
}
