import java.util.*;
public class Binarytodecimal{

public static void main(String args[]){
	int n=0011;
	int binary[]=new int[20];
	int index=0;

while(n>0)
{
	binary[index] = n%2;
	n = n*2;
	index++;
}
for(int i=index-1;i>=0;i--){
	System.out.print(binary[i]);
}
}
}