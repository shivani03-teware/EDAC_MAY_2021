public class pattern2{

public static void main(String args[]){
int K= 64;
for(int i=1;i<=5;i++){
	for(int j=1;j<=i;j++){
		System.out.print((char)(K+j));
	}
	System.out.println();
}
}
}