import java.util.*;

class Binaryadd{
public static void main(String args[]){


Scanner sc = new Scanner(System.in);
System.out.println("First binay number:");
int remainder,i=1,j=1;
int binarynum =0;
int Binarynum = 0;

int b1 = sc.nextInt();

System.out.println("Second binay number:");
int b2 = sc.nextInt();

while(b1!=0){
remainder = b1%2;
b1= b1/2;
binarynum = binarynum+remainder*i;
i = i*10;
}
System.out.println(binarynum);
/*while(b2!=0){
remainder = b2%2;
b2 = b2/2;
Binarynum = Binarynum+remainder*j;
j = j*10;
}
System.out.println(Binarynum);
long sum =binarynum+Binarynum;
System.out.println("Sum of two binary numbers :" +(sum));*/
}
}