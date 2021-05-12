import java.util.*;

public class sum{
public static void main(String args[]){
//..........................Command line input for sum.........................................
String s1=args[0];
String s2=args[1];
int i =Integer.parseInt(s1);
int j = Integer.parseInt(s2);
int k= i+j;
System.out.println("Addition:" +k);

//...........................Scanner class input for sum.......................................

Scanner sc = new Scanner(System.in);
int S1= sc.nextInt();
int S2= sc.nextInt();
int result = S1+S2;
System.out.println("Addition:" +result);
}
}