import java.util.*;

public class divide{
//..........................command line input for division.................................. 
public static void main(String args[]){
String s1 = args[0];
String s2 = args[1];
int i = Integer.parseInt(s1);
int j = Integer.parseInt(s2);
int k = i/j;
System.out.println("Division:" +k);

//...............................Scanner class for division...................................

Scanner sc = new Scanner(System.in);
int S1 = sc.nextInt();
int S2 = sc.nextInt();
int Result = S1/S2;
System.out.println("Division:" +Result);
}
}