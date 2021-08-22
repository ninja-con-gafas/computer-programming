package InputOutput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UsingBufferedReader
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    int regNum;
    float percentage;
    String name;
    System.out.println("Enter registration number");
    regNum=Integer.parseInt(input.readLine());
    System.out.println("Enter name");
    name=input.readLine();
    System.out.println("Enter percentage obtained");
    percentage=Float.parseFloat(input.readLine());
    System.out.println(regNum+"\n"+name+"\n"+percentage);
  }
}
