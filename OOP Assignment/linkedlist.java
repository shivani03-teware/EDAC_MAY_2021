import java.util.*;
class linkedlist{

public static void main(String args[]){
/*
LinkedList <String> list = new LinkedList<>();
list.add("shivani");
list.add("shravani");

Iterator itr = list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
*/
//............................................reverse a list of elements................................................
LinkedList <String> list1= new LinkedList<>();
list1.add("shivani");
list1.add("shravani");
list1.add("shrava");
list1.add("shrav");
System.out.println(list1);
Iterator i= list1.descendingIterator();
while(i.hasNext()){
	System.out.println("reverse the list: "+i.next());
}
//............................................Remove method.......................................................
//list.removeFirstOccurrence("shivani");
//System.out.println("remove first element :  "+list);
//............................................offer.........................................................................
list1.offer("shiva");
System.out.println("adds the specified element as the last element of a list: "+list1);
list1.offerFirst("shivu");
System.out.println("adds the specified element as the front element of a list: "+list1);
list1.offerLast("shiv");
System.out.println("adds the specified element as the last element end of a list: "+list1);
list1.peek();
System.out.println("retrieves the first element of a list: "+list1);


}
}
