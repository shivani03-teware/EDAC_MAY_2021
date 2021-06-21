/*You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class Prime should contain a single method checkPrime.

TYou should write the checkPrime method in such a way that the code prints only the prime numbers.

Please read the code given in the editor carefully. Also please do not use method overloading! Sample Input
2
1
3
4
5
Sample Output

2 
2 
2 3 
2 3 5
*/
import static java.lang.System.in;
class prime
{
    public boolean isPrime(int num)
    {
        if (num == 1) return false;
        for(int i = 2;i<num/2+1;i++){
            if((num%i)==0) return false; 
        }
       
        return true;
    }
    public void checkPrime(int... numbers)
    {
        
        for(int num:numbers){
            System.out.print(isPrime(num)?""+num+" ":"");
        }
        System.out.println("");
    }
}