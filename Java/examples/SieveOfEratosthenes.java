package examples;
import java.util.Scanner;
import java.util.BitSet;
public class SieveOfEratosthenes
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printPrimes(num);
    }
    public static void printPrimes(int num)
    {
        BitSet prime = new BitSet(num+1);
        prime.flip(0,num+1);
        for(int p = 2; p*p <= num; p++)
        {
            if(prime.get(p))
            {
                for(int i = p*p; i <= num; i += p)
                    prime.set(i,false);
            }
        }
        for(int i=2; i <= num; i++)
        {
            if(prime.get(i))
                System.out.printf("%d ",i);
        }
    }
}
