import java.util.*;

class Rectangle{

//..........................................cammand line input......................................................

public static void main(String args[]){
float w = 5.6f;
float h = 8.5f;
float Area = w*h;
float Perimeter = 2*(w+h);
System.out.println("Area is : " +w+ " * " +h+ " = "  +(Area));
System.out.println("Perimeter is : " +w+ " * " +h+ " = "  +(Perimeter));


//.......................................Scanner class input.................................................................

Scanner sc = new Scanner(System.in);
System.out.println("Enter width and Height:" );
float W = sc.nextFloat();
float H = sc.nextFloat();

float area = W*H;
float perimeter = 2*(W+H);
System.out.println("Area is : " +W+ " * " +H+ " = " +(area));
System.out.println("Perimeter is : " +W+ " * " +H+ " = "  +(perimeter));
}
}












