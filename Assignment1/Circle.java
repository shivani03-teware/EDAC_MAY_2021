import java.util.*;

public class AreaOfCircle {

//.......................................................................Cammand line input..................................................................

public static void main(String args[]){
double r;
double radius = 3.14*r*r;
/*
String s1 = args[0];
String s2 = args[1];
String s3 = args[2];

double pi = Double.parseDouble(s1);
double r = Double.parseDouble(s2);

//pi = 3.14;
//double area = pi*r*r;
*/
System.out.println("Area is:" +(radius));


//....................................................................Scanner class input.................................................................................

Scanner sc = new Scanner(System.in);
System.out.println("Enter radius:");
float pi = sc.nextFloat();
float r = sc.nextFloat();
float area = pi*r*r;
System.out.println("Area is :" +area);
}
}