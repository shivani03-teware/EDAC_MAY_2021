// Java Program to Sort an ArrayList

// Step 1: ImportingDB files
import java.util.*;

// Class 1: Parent Class
class Car {
	int ModalNo;
	String name;
	int stock;

	// Parameterized constructor
	Car(int ModalNo, String name, int stock)
	{
		this.ModalNo = ModalNo;
		this.name = name;
		this.stock = stock;
	}
}

// Class 2: Child class
// creates the comparator for comparing stock value
class StockComparator implements Comparator<Car> {

	// Function to compare
	public int compare(Car c1, Car c2)
	{
		if (c1.stock == c2.stock)
			return 0;
		else if (c1.stock > c2.stock)
			return 1;
		else
			return -1;
	}
}

class sort {

	// Main driver method
	public static void main(String[] args)
	{
		// Create the ArrayList object
		ArrayList<Car> c = new ArrayList<Car>();
		c.add(new Car(2018, "Kia", 20));
		c.add(new Car(2020, "MG", 13));
		c.add(new Car(2013, "creta", 10));
		c.add(new Car(2015, "BMW", 50));
		c.add(new Car(2017, "Audi", 45));

		// Call the sort function
		Collections.sort(c, new StockComparator());

		// For each loop to iterate
		for (Car car : c) {
		
		// Print the sorted ArrayList
			System.out.println(car.stock + " " + car.name
							+ " " + car.ModalNo);
		}
	}
}
