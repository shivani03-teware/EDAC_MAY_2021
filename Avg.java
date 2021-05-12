import java.util.*;

public class Avg{
//.............................................Cammand line input......................................................

public static void main(String args[]){

String s1 = args[0];
String s2 = args[1];
String s3 = args[2];

int i = Integer.parseInt(s1);
int j = Integer.parseInt(s2);
int k = Integer.parseInt(s3);
int Avg = (i+j+k)/3;
System.out.println("Average of three numbers :" +Avg);

//......................................................Scanner class input..............................................................

Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers:");
int S1 = sc.nextInt();
int S2 = sc.nextInt();
int S3 = sc.nextInt();

int Total = (S1+S2+S3)/3;
System.out.println("Avg of three nos.:" +Total);

}
}