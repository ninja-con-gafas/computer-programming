package examples.recursion;
import java.util.Scanner;
class Palindrome 
{
   public static boolean checkPalindrome(int[] num, int index) 
   {
     if(index<=num.length/2)
     {
         if(compare(num[index],num[num.length-(index+1)]))
            return checkPalindrome(num, index + 1);
        else
            return false;
     }
     else
        return true;
  }
  public static boolean compare(int val1, int val2)
  {
      return val1 == val2;
  }
   public static void main(String args[]) 
   {
       Scanner scan = new Scanner(System.in);
       int num[] = new int[5];
       for(int i=0; i< 5;i++)
           num[i]=scan.nextInt();
       System.out.println(checkPalindrome(num, 0));
   }
}
