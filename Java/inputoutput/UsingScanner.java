package inputoutput;
import java.util.Scanner;
public class UsingScanner
{
  public static void main(String args[])
  {
    Scanner input=new Scanner(System.in);
    int regNum;
    float percentage;
    String name;
    System.out.println("Enter registration number");
    regNum=input.nextInt();
    System.out.println("Enter name");
    name=input.next();
    System.out.println("Enter percentage obtained");
    percentage=input.nextFloat();
    System.out.println(regNum+"\n"+name+"\n"+percentage);
    input.close();
  }
}
