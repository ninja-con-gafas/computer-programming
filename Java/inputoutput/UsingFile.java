package inputoutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class UsingFile
{
  public static void main(String args[])throws FileNotFoundException
  {
    File numbers=new File("/home/absdarekar/Documents/Repositories/computer-programming/Java/inputoutput/numbers");
    Scanner scan=new Scanner(numbers);
    double sum=0,count=0,average;
    while(scan.hasNextDouble())
    {
      sum+=scan.nextDouble();
      count++;
    }
    average=sum/count;
    System.out.println(average);
    scan.close();
  }
}
