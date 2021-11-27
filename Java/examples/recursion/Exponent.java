package examples.recursion;
import java.util.Scanner;
public class Exponent
{
    public static int powerFunction(int base, int power)
    {
        if(power==0)
            return 1;
        else
            return base*powerFunction(base,power-1);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int power = input.nextInt();
        System.out.printf("%d", powerFunction(base,power));
    }

}
