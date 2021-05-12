import java.util.*;

public class expression{
//.........................................................Command line........................................................
public static void main(String args[]){

System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

//..................................................Scanner class ..................................................................
Scanner sc = new Scanner(System.in);
System.out.println("Enter a input:");
double s1 = sc.nextDouble();
double  s2 = sc.nextDouble();
double  s3 = sc.nextDouble();
double  s4 = sc.nextDouble();
double s5 = sc.nextDouble();
double s6 = sc.nextDouble();
double total = ((s1*s2-s3*s4)/(s5-s6));
System.out.println(total);

}
}




