import java.util.*;
class Q6{

      public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 5 subjects marks:");
	  double m1 = sc.nextInt();
	  double m2 = sc.nextInt();
	  double m3 = sc.nextInt();
	  double m4 = sc.nextInt();
	  double m5 = sc.nextInt();
	  double sum = (m1+m2+m3+m4+m5);
	  double per = ((sum/500)*100);
	  System.out.println("Percentage marks = " +per+ " %");
}
}