import java.util.*;

class Hello1{
public static void main(String args[]){


//...................................Command line input.....................................

String s1 = args[0];
System.out.println("Hello" +s1 +" ");

//........................................Scanner class input...................................

Scanner sc = new Scanner(System.in);
String s2 = sc.next();
System.out.println("Hello"+s2);
}
}
