import java.util.*;

public class Mult{

//..........................................Cammand line input for multiplication......................................................................................

public static void main(String args[]){

String s1 = args[0];
String s2 = args[1];

int i = Integer.parseInt(s1);
int j = Integer.parseInt(s2);
int k = i*j;

System.out.println("Multiplication of two numbers:" +k);

//............................................Scanner class for multipication.........................................................................................

Scanner sc = new Scanner(System.in);
int S1 = sc.nextInt();
int S2 = sc.nextInt();
int Result = S1*S2;
System.out.println("Multiplication of two numbers:" +Result);
}
}
