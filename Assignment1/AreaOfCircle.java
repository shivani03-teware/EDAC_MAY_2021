import java.util.*;

public class AreaOfCircle {

//.......................................................................Cammand line input..................................................................

public static void main(String args[]){
double R = 7.5d;
double radius = 3.14*(R*R);
double perimeter = 2*3.14*R;
System.out.println("Area is:" +radius);
System.out.println("Perimeter is:" +perimeter);


//....................................................................Scanner class input.................................................................................

Scanner sc = new Scanner(System.in);
System.out.println("Enter radius:");
double r = sc.nextDouble();
double area = 3.14*r*r;
double Perimeter = 2*3.14*r;
System.out.println("Area is :" +area);
System.out.println("Perimeter is :" +Perimeter);
}
}