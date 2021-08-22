// print first letter of each word in uppercase seperated by a dot
package StringManipulation;
import java.util.Scanner;
public class Cipher
{
  public static void main(String args[])
  {
    String word="";
    char character;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a sentence");
    while(input.hasNext())
    {
      word=input.next();
      character=word.charAt(0);
      System.out.print(Character.toUpperCase(character)+".");
    }
    input.close();
  }
}
