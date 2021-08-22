// seperate the number into it's digits
package Loops;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Digits
{
  public static void main(String args[])throws IOException
  {
    int number,divisor=10,digits[],length,index=0;
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    number=Integer.parseInt(input.readLine());
    length=Integer.toString(number).length();
    digits=new int[length];
    divisor=(int)Math.pow(divisor,length-1);
    while(number>0)
    {
      digits[index]=number/divisor;
      System.out.println(digits[index]);
      index++;
      number%=divisor;
      divisor/=10;
    }
  }
}
