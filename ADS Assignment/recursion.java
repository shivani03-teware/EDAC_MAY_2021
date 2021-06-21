class recursion{

int  fact(int n){
if(n==1)
	return 1;
else
	return(n*fact(n-1));
}

public static void main(String args[]){

recursion p = new recursion();
System.out.println(p.fact(5));
}
}