import java.util.*;
public class Movies {

	public static void main(String[] args) {
		
		InOut str = new InOut();
		str.details();
	}

}

class InOut{
	String s1="m_";
	String s2="s_";
	String name;
	int rating;
	int base_price = 50;
	int surcharges;
	int total_charges;
	InOut(){
		
	}
	void IOmethod(String name,int rating,int base_price,int surcharges,int total_charges){
		this.name=name;
		this.rating=rating;
		this.base_price=base_price;
		this.surcharges=surcharges;
		this.total_charges=total_charges;
	}
	InOut(String name,int rating,int base_price,int surcharges,int total_charges){
		this.name=name;
		this.rating=rating;
		this.base_price=base_price;
		this.surcharges=surcharges;
		this.total_charges=total_charges;
	}
	
	InOut[] obj = new InOut[10];
	InOut[] obj1 = new InOut[10];
	int choice = 0;
	int count=0;
	int cnt=0;
	int counter=0;
	void details() {
	do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press-1 Insert movie name \n" + "Press-2 Insert series name \n" + "Press-3 for search movies \n" + "Press-4 for search series ");
		choice = sc.nextInt();
		switch(choice) 
		{
			
			case 1:addmoviedetails();
			break;
			case 2:addseriesdetails();
			break;
			case 3:searchmovie();
			break;
			case 4:searchseries();
			break;
			default:
				System.out.println("Invalid Entry");
		}
	}while(choice>0);
	}
	void addmoviedetails() {
		surcharges = 100;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter movie name: ");
		String name = sc.nextLine();
		System.out.print("Enter movie rating : ");
		int rating = sc.nextInt();
		name=s1+name;
		total_charges = base_price+surcharges;
		obj1[counter++]=new InOut(name,rating,base_price,surcharges,total_charges);
		System.out.println("|Movie name : " +obj1[0].name+"\t "+"Movie rating : " +obj1[0].rating+"\t "+" cost: "+obj1[0].total_charges+ "|" );
		cnt++;
		
		
	}
	void addseriesdetails(){
		surcharges = 50; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter series name: ");
		String name = sc.nextLine();
		System.out.println("Enter series rating: ");
		int rating = sc.nextInt();
		name=s2+name;
		total_charges = base_price+surcharges;
		obj[count++]=new InOut(name,rating,base_price,surcharges,total_charges);
		System.out.println("|Series name : " +obj[0].name+"\t"+" series rating : "+obj[0].rating+ "\t"+" cost:  "+obj[0].total_charges+ "|" );
		cnt++;
		
	}
	/*void search() {
		InOut search = new InOut();
		search.searchmovie();
		
}*/
	void searchmovie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name:");
		String name = sc.nextLine();
		name=s1+name;
		for(int i=0;i<cnt;i++) {
			if(obj1[i]!=null){
				if(obj1[i].name.equals(name)){
					System.out.println("|Movie name : " +obj1[0].name+"\t"+"Movie rating : " +obj1[0].rating+"\t"+" cost:  "+obj1[0].total_charges+ "|" );
					
				}
				
				
			}	
			break;
	}
		//System.out.println("Moive Not Found");
	}
	void searchseries() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter series name which you want to search: ");
		String name = sc.nextLine();
		name=s2+name;
		for(int i=0;i<cnt;i++) {
			if(obj[i]!=null){
				if(obj[i].name.equals(name)){
					System.out.println("|Series name : " +obj1[0].name+"\t"+"Series rating : " +obj1[0].rating+"\t"+" cost:  "+obj1[0].total_charges+ "|" );
				}
				
			}
			//System.out.println("Moive Not Found");
		
			
	}
	}
}