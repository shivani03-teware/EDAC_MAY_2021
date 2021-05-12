public class pattern18{

public static void main(String args[]){
int alpha= 64;
for(int i=5;i>=1;i--){
	for(int j=i;j>=1;j--){
		System.out.print("");  //space
	}
	for(int k=1;k<=i;k++){
		System.out.print((char)(alpha+k)+" ");  //star
	}
	System.out.println();
}
}
}
