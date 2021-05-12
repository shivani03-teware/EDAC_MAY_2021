public class pattern7{

public static void main(String args[]){

for(int i=1;i<=9;i++){
	for(int j=9;j>=i;j--){
		System.out.print(j+" ");  //space
	}
	for(int k=1;k<=i;k++){
		System.out.print(" ");  //star
	}
	System.out.println();
}

}
}
