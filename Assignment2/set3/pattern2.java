public class pattern2{

public static void main(String args[]){

for(int i=1;i<=9;i++){
	for(int j=8;j>=i;j--){
		System.out.print(" ");  //space
	}
	for(int k=1;k<=i;k++){
		System.out.print(i+" ");  //star
	}
	System.out.println();
}
/*
for(int i=1;i<=5;i++){
	for(int j=5;j>=i;j--){
		System.out.print("");
	}
	for(int k=1;k<=i;k++){
		System.out.print(" *");
	}
	System.out.println();
}*/
//System.out.println();
}
}
