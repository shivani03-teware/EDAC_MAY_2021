//Defining thread by extending thread class
import  java.util.*;
class mythread extends thread{

public void run(){

System.out.println("child method");
}
}
public class thread1 {

public static void main(String args[]){

mythread t = new mythread();
t.start();
System.out.println("main thread");
}
}
