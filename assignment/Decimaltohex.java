import java.util.*;

class Decimaltohex{
public static void main(String args[]){
int i=1;
int remainder ;
int hexnum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Decimal number:");
int h1 = sc.nextInt();
while(h1!=0){
remainder = h1%16;
h1 =h1/16;
hexnum = hexnum+remainder*i;
i=i*10;
}
System.out.println(hexnum);
}
}