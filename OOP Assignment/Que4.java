class vehicle{
	int mileage;
	int price;
}
class car extends vehicle{
	int ownership_cost;
	int warranty; //(by years) 
	int seating_capacity; 
	double fuel_type; //(diesel or petrol).
	
	void getmethod(int ownership_cost,int warranty, int seating_capacity, double fuel_type,int mileage,
	int price) {
		this.ownership_cost=ownership_cost;
		this.warranty = warranty;
		this.seating_capacity=seating_capacity;
		this.fuel_type = fuel_type;
		System.out.println(ownership_cost+ " "+warranty+" " +seating_capacity+" " + fuel_type+" "+mileage+ " "+price);
	}
}
class Audi extends car{
	String  model_type;
	
	
}
class Ford extends car{
	String model_type;
}
class bike extends vehicle{
	int number_of_cylinders;
	int number_of_gears;
	String cooling_type; //(air, liquid or oil) 
	String wheel_type; //(alloys or spokes) 
	int fuel_tank_size; //(in inches)
	void getdetails(int number_of_cylinders,int number_of_gears,String cooling_type,String wheel_type,int fuel_tank_size) {
		this.number_of_cylinders=number_of_cylinders;
		this.number_of_gears=number_of_gears;
		this.cooling_type=cooling_type;
		this.wheel_type=wheel_type;
		this.fuel_tank_size=fuel_tank_size;
		
		System.out.println(number_of_cylinders+ " "+number_of_gears+" " +cooling_type+" " +  wheel_type+" "+fuel_tank_size);

	}
}
class bajaj extends bike{
	
}
class Tvs extends bike{
	
}
public class Que4 {

	public static void main(String[] args) {
		System.out.println("..........Audi.............");
		Audi a = new Audi();
		a.getmethod(200,1,3,4.50,23,50);
		System.out.println("..........ford.............");
		Ford f = new Ford();
		f.getmethod(150,4, 3, 5.40,23, 26);
		System.out.println("..........bajaj.............");
		bajaj b = new bajaj();
		b.getdetails(1, 3, "asd", "dsdwe", 4);
		System.out.println("..........Tvs.............");
		Tvs t = new Tvs();
		t.getdetails(4, 5, "sf", "weret", 6);

	}

}
