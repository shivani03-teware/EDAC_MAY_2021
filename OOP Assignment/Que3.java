/*
 *3. We want to calculate the total marks of each student of a class in
Physics,Chemistry and Mathematics and the average marks of
the class. The number of students in the class are entered by the
user. Create a class named Marks with data members for roll
number, name and marks. Create three other classes inheriting
the Marks class, namely Physics, Chemistry and Mathematics,
which are used to define marks in individual subject of each
student. Roll number of each student will be generated
automatically.
 */
import java.util.*;
abstract class student{
	abstract void getmethod();
}
class Marks{
	int rollno;
	String name;
	int marks;
	Scanner sc = new Scanner(System.in);
	Marks(){}
	Marks(int rollno,String name,int marks){
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
}
class physics extends Marks{
	int fun() {
		System.out.println("Enter students  physics marks:");
		 int Pmark = sc.nextInt();
		return Pmark;
	
	}
}
class chemistry extends Marks{
	int fun() {
		System.out.println("Enter students  physics marks:");
		 int Cmark = sc.nextInt();
		return Cmark;
	}
}
class maths extends Marks{
	int fun() {
		System.out.println("Enter students  physics marks:");
		 int Mmark = sc.nextInt();
		return Mmark;
	}
}
public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students u want:");
		int num = sc.nextInt();
		System.out.println("Enter students name:");
		String Sname = sc.nextLine();
		 Sname = sc.nextLine();
		System.out.println("Enter students rollno:");
		int Srollno = sc.nextInt();
		physics p = new physics();
		int pmark=p.fun();
		chemistry c = new chemistry();
		int cmark=c.fun();
		maths m = new maths();
		int mmark=m.fun();
		int Total_marks = pmark+cmark+mmark;
		int avg = Total_marks/3;
		System.out.println("........Details.......\n"+Sname+" "+Srollno+" "+Total_marks+" "+avg);
	}
}
