import java.util.*;

public class formula{

//................................................................................Cammand line input.................................................................................

public static void main(String args[]){

System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));


//..............................................................................Scanner class input..................................................................................

Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers:");
double s1 = sc.nextDouble();
int s2 = sc.nextInt();
double s3 = sc.nextDouble();
int s4 = sc.nextInt();
double s5 = sc.nextDouble();
int s6 = sc.nextInt();
double s7 = sc.nextDouble();
int s8 = sc.nextInt();
double s9 = sc.nextDouble();
int s10 = sc.nextInt();
double s11 = sc.nextDouble();
int s12 = sc.nextInt();

System.out.println(s1*(s2-(s3/s4)+(s5/s6)-(s7/s8)+(s9/s10)-(s11/s12)));

}
}