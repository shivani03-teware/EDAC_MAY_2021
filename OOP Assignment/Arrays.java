class Arrays{
public static void main(String args[]){

System.out.println("Enter the no of elements u want to create: ");
int size =Integer.parseInt( System.console().readLine());//read input 
int [] elements=new int[size];

for(int i=0;i<size;i++){
System.out.println("position : "+i);
elements[i]=Integer.parseInt( System.console().readLine());
}
for(int str:elements)System.out.println(str);
}
}
