import java.util.*;

public class AllOperations{

//.................................................Cammand line input for all operations..............................................................................

public static void main(String args[]){


System.out.println(-5+8*6);
System.out.println((55+9) % 9);
System.out.println(20+(-3*5)/8);
System.out.println( 5+((15/3)*2)-(8%3));


//....................................................Scanner class for all operations.......................................................................................

Scanner sc = new Scanner(System.in);
System.out.println("Enter  numbers:");
int s1 = sc.nextInt();
int s2 = sc.nextInt();
int s3 = sc.nextInt();

Scanner sc1 = new Scanner(System.in);
System.out.println("Enter  numbers:");
int S1 = sc1.nextInt();
int S2 = sc1.nextInt();
int S3 = sc1.nextInt();

Scanner sc2 = new Scanner(System.in);
System.out.println("Enter numbers:");
int p = sc2.nextInt();
int q = sc2.nextInt();
int r = sc2.nextInt();
int s = sc2.nextInt();

Scanner sc3 = new Scanner(System.in);
System.out.println("Enter numbers:");
int P = sc3.nextInt();
int Q = sc3.nextInt();
int R = sc3.nextInt();
int S = sc3.nextInt();
int T = sc3.nextInt();
int U = sc3.nextInt();

int Result = s1+s2*s3;
System.out.println(Result);
Result = ((S1+S2)%S3);
System.out.println(Result);
Result = p+((q*r)/s);
System.out.println(Result);
Result = P+((Q/R)*S)-(T%U);
System.out.println(Result);

}
}