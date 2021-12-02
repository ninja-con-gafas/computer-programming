package examples.sort;
import java.util.Scanner;
public class InsertionSort
{
    public static void sort(int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            int j = i;
            int temp = array[i];
            while(j >= 1 && array[j-1] < temp)
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }

    public static void printArray(int[] array)
    {
        for(int element : array)
            System.out.println(element);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner((System.in));
        int size = in.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
            array[i] = in.nextInt();
        sort(array);
        printArray(array);
    }
}
