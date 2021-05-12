public class pattern14{

public static void main(String args[]){
for(int i=1;i<5;i++){
	for(int j=1;j<=i;j++){
		System.out.print(" ");  //space
	}
	for(int k=5;k>=i;k--){
		System.out.print("* ");  //star
	}
	System.out.println();
}
for(int l=1;l<=5;l++){
	for(int j=5;j>=l;j--){
		System.out.print(" ");  //space
	}
	for(int k=1;k<=l;k++){
		System.out.print("* ");  //star
	}
	System.out.println();
}
/*
for(int i=5;i>=1;i--){
	for(int j=4;j>=i;j--){
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++){
		System.out.print("*" );
	}
	System.out.println();
//}
//for(int i=1;i<=5;i++){
	for(int j=5;j>=i;j--){
		System.out.print("*");
	}
	for(int j=1;j<=5;j++){
		System.out.print("");
	}
	System.out.println();
	/*for(int l=1;l<=5;l++){
		for(int j=5;j>=l;j--){
			System.out.print(" ");
		}
		for(int j=1;j<=l;j++){
			System.out.print("*");
		}
	System.out.println();
*/

	
}
}