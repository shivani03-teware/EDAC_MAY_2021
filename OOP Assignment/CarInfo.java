/*We want to store the information of different vehicles. Create a class named Vehicle with two data member named mileage and
price. Create its two subclasses *Car with data members to store ownership cost, warranty (byyears), seating capacity and fuel type (diesel or petrol).
*Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel 
type(alloys or spokes) and fuel tank size(in inches) Make another two subclasses Audi and Ford of Car, each having 
a data member to store the model type. Next, make two subclasses Bajaj and TVS, each having a data member to store
the make-type. Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel
type, mileage and price.) Do the same for a Bajaj and a TVS bike.*/
class Vehicle
{
	float mileage;
	int price;
	Vehicle(float mileage,int price)
	{
		this.mileage=mileage;
		this.price=price;
	}
	public void display()
	{
		System.out.println("mileage: "+mileage);
		System.out.println("price: "+price);
	}
}
class Car extends Vehicle
{
	int ownershipCost;
	int warranty;
	int seating_capacity;
	float fuel;
	
	Car(float mileage, int price, int ownershipCost, int warranty, int seating_capacity, float fuel)
	{
		super(mileage,price);
		this.ownershipCost=ownershipCost;
		this.warranty=warranty;
		this.seating_capacity=seating_capacity;
		this. fuel=fuel;
	}
	public void display()
	{
		super.display();
		System.out.println("Ownershipcost: "+ownershipCost);
		System.out.println("warranty: "+warranty);
		System.out.println("seating_capacity: "+seating_capacity);
		System.out.println("fuel: "+fuel);
	}
}
public class CarInfo
{
	public static void main(String args[])
	{
		Car c= new Car(23.0f,233333, 20000,2,5,50.0f);
		c.display();
		
	}
}