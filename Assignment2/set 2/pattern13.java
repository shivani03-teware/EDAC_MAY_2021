public class pattern13{

public static void main(String args[]){

for(int i=5;i>1;i--){
	for(int j=5;j>=i;j--){
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++){
		System.out.print("*" );
	}
	System.out.println();
}
	for(int l=1;l<=5;l++){
		for(int j=5;j>=l;j--){
			System.out.print(" ");
		}
		for(int j=1;j<=l;j++){
			System.out.print("*");
		}
	System.out.println();

}
}
}