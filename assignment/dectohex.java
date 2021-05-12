public class dectohex{

public static void main(String args[]){
char hex[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
int rem;
int n=15;
String s1 ="";
while(n>0){
	rem= n%16;
	s1 = hex[rem]+s1; // +s1 for char converted into string
	n=n/16;
	
}
	System.out.println(s1);
}
}
