public class pattern6{

public static void main(String args[]){

for(int i=1;i<=9;i++){
	for(int j=1;j<=i;j++){
		System.out.print(" ");  //space
	}
	for(int k=9;k>=i;k--){
		System.out.print("* ");  //star
	}
	System.out.println();
}
}
}
