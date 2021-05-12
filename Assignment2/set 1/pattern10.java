public class pattern10{

public static void main(String args[]){
int alpha= 70;
for(int i=1;i<=5;i++){
	for(int j=4;j>=i;j--){
		System.out.print(" ");  //space
	}
	for(int k=1;k<=i;k++){
		System.out.print((char)(alpha-k) +" ");  //star
	}
	System.out.println();
}
}
}
