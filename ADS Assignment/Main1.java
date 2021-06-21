class Main1{
int i=1;
int num=3;
void print(){


System.out.println(num*i);
i++;
if(i>10){
}
else{
	print();
}
}
public static void main(String args[]){

Main1 p = new Main1();
p.print();
}
}
