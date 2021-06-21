public class main{

void print(){
int i=1;
int num=3;
i++;
System.out.println(num*i);
if(i>10){
}
else{
	print();
}
}
public static void main(String args[]){

print p = new print();
p.print();
}
}
