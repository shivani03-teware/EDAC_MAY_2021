class shape{
	void method() {
		System.out.println("This is a shape.");
	}
}
class polygon extends shape{
	void method() {
		System.out.println("Polygon is a shape");
	}
}
class rectangle extends polygon{
	void method() {
		System.out.println("Rectangle is a polygon");
	}
}
class square extends rectangle{
	void method() {
		System.out.println("Square is a rectangle");
	}
}
class triangle extends polygon{
	void method() {
		System.out.println("Triangle is a polygon");
	}
}
public class Que5 {

	public static void main(String[] args) {
		shape s = new shape();
		s.method();
		polygon p = new polygon();
		p.method();
		polygon r =new rectangle();
		r.method();
		rectangle s1 = new square();
		s1.method();
		polygon t = new triangle();
		t.method();
		
	}

}
