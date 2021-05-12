public class pattern17{

public static void main(String args[]){
int c=0;
for(int i=1;i<=5;i++){
	for(int j=5;j>=i;j--){
		
		System.out.print("");
	}
	for(int k=1;k<=i;k++){
		c=c+1;
		System.out.print(c+" ");
	}
	System.out.println();
}}}