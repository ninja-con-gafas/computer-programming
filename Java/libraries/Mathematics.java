// prints the highest power of 2, less than or equal to a given number.
package libraries;
import java.lang.Math;
import java.util.Scanner;
public class Mathematics
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    int number,power=1;
    number=input.nextInt();
    if(number<2)
      System.out.print("Please enter an integer greater than or equal to 2");
    else
    {
      power=(int)Math.floor(Math.log(number)/Math.log(2));
      System.out.println((int)Math.pow(2,power));
    }
    input.close();
  }
}
