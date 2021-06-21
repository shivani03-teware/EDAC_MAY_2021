import java.util.*;

class ListTest{

public static void main(String args[]){
List <Integer> list = new ArrayList<Integer>();
list.add(23);
list.add(24);
list.add(25);
list.add(26);
//list.add(23);
System.out.println(list);
List <Integer> list2 = new ArrayList<Integer>(list);
System.out.println(list2);
System.out.println("equals method : "+ list.equals(list2));  //true
System.out.println("====================================");
list2.remove(0);
System.out.println("equals method : "+ list.equals(list2)); //false
System.out.println("====================================");
System.out.println(list);
System.out.println("equals method : "+ list.get(2).equals(24));  //false
Integer s_int=new Integer("224");
int hashcodeval = s_int.hashcode();
System.out.println(hashcodeval);


}
}