import java.util.*;

public class Multiple_Operation{

//............................. Cammand line input for all operations ................................................................................................
public static void main(String args[]){
String s1 = args[0];
String s2 = args[1];

int i = Integer.parseInt(s1);
int j = Integer.parseInt(s2);
int k = i+j;
System.out.println("Additiion of Two Numbers:" +k);
k = i-j;
System.out.println("Substraction of two numbers:" +k);
k = i*j;
System.out.println("Multiplication of two numbers:" +k);
k = i/j;
System.out.println("Division of two numbers:" +k);


//..............................Scanner class input for all operations.................................................................................................

Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int S1 = sc.nextInt();
System.out.println("Enter second number:");
int S2 = sc.nextInt();
int Result = S1+S2;
System.out.println("Addition of two numbers:" +Result); 
Result = S1-S2;
System.out.println("Substraction of two numbers:" +Result);
Result = S1*S2;
System.out.println("Multipication of two numbers:" +Result);
Result = S1/S2;
System.out.println("Division of two numbers:" +Result);
Result = S1 % S2;
System.out.println("Remainder of two numbers:" +Result);
}
}

