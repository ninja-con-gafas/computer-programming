package examples.recursion;
import java.lang.String;
import java.util.Scanner;
public class PyramidPattern
{
    public static void pattern(int n,int i)
    {
        if(i<=n)
        {
            print(i++);
            System.out.println();
            pattern(n,i);
        }
    }
    public static void print(int i)
    {
        if(i>0)
        {
            System.out.print("*");
            print(--i);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        pattern(in.nextInt(),1);
    }

}
