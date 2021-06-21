interface Mammals{
	public void fun();
	
}
interface Marine{
	public void fun1();
}
class BlueWhale  implements Mammals,Marine {
	
	public void fun() {System.out.println("I am mammal");}
	public void fun1() {System.out.println("I am a marine animal");}
	public void fun2() {System.out.println("I belong to both the categories: mammals as well as marine");}
	
}
public class Que1 {

	public static void main(String[] args) {
		//Mammals m = new Mammals();
				//m.fun();
				//Marine m1 = new Marine();
				//m1.fun1();
				BlueWhale b = new BlueWhale();
				b.fun2();
				b.fun();
				b.fun1();
				//Mammals b1 = new BlueWhale();
				//b1.fun();
				//Marine b2 = new BlueWhale();
				//b2.fun1();
	}

}
