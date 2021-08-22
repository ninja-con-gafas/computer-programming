package DataTypes;
public class Casting
{
  public static void main(String args[])
  {
    int headsCount=536, tailsCount=464;
    float percentage;
    char head, tail;
    head='H';
    tail='L';
    System.out.println((int)head);
    System.out.println((int)tail);
    System.out.println((char)headsCount);
    percentage=(headsCount)/(headsCount+tailsCount);
    System.out.println(percentage);
    percentage=((float)headsCount)/((float)headsCount+(float)tailsCount);
    System.out.println(percentage);
  }
}
