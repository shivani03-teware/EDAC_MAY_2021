import java.util.*;

public class numbers{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
int s1=sc.nextInt();
System.out.println("Enter 2nd number: ");
int s2 = sc.nextInt();

//int s1=50;
//int s2=49;
if(s1>s2){
System.out.println(s1+ "is large"  +s2+  "is small");
}
else if(s1<s2){
System.out.println(s2+ "is large" +s1+ "is small");
}
else{
	System.out.println("both are equal");
}
}
}

