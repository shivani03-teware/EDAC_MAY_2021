/*
/ *2. Make a class named Fruit with a data member to calculate the
number of fruits in a basket. Create two other class named
Apples and Mangoes to calculate the number of apples and
mangoes in the basket. Print the number of fruits of each type
and the total number of fruits in the basket.
 */

import java.util.*;
abstract class Fruit{
	static int sum=0;
	public abstract void cal(int a);
}

class apples extends Fruit{
	public void cal(int a) {
		sum=sum+a;
	}
	
}
public class Que2 extends apples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		apples a = new apples();
		System.out.println("Enter the number of apples:");
		int apple = sc.nextInt();
		a.cal(apple);
		
		System.out.println("Enter the number of mangoes:");
		Que2 m=new Que2();
		int mango =sc.nextInt();
		m.cal(mango);
		
		System.out.println("Number of fruits in basket \n"+"Apples = " +apple+ " Mangoes = " +mango);
		System.out.println("Total number of fruits: " +Fruit.sum);
		
		
		
	}

}
