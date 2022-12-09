// successive division method
package examples;
import java.util.Scanner;
class HighestCommonFactor
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int num1,num2,hcf,divisor,dividend,reminder=1;
    num1=scan.nextInt();
    num2=scan.nextInt();
    divisor=num1;
    dividend=num2;
    while (reminder!=0)
    {
      reminder=dividend%divisor;
      dividend=divisor;
      divisor=reminder;
    }
    hcf=dividend;
    System.out.println(hcf);
    scan.close();
  }
}
