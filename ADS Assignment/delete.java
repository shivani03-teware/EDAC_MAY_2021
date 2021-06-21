
import java.util.*;
class delete{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[] = new int[5];
for(int i=0;i<arr.length;i++){
System.out.println("Enter the elements: ");
 arr[i]=sc.nextInt();
}
 System.out.println("Enter the element which u want delete: ");
 int key=sc.nextInt();
 


int k =0;
for(int i=0;  i<arr.length  ;   i++ )
{
	if(arr[i]!=key)
{
System.out.println("Not in array ");
break;
}
	if(arr[i]==key)
	{	

	continue;
	}
		arr[k]=arr[i];	
		k++;

}
	for(int i=0;i<arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}


}
}