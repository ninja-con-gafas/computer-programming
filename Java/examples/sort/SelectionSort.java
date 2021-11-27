package examples.sort;
import java.util.Scanner;
public class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int size = in.nextInt();
        int[] array =new int[size];
        for(int i = 0;i < size; i++)
            array[i] = in.nextInt();
        SelectionSort.sort(array);
        for(int element : array)
            System.out.printf("%d ",element);
    }

    public static void sort(int[] array)
    {
        int size = array.length, min;
        for (int i = 0; i < size-1; i++)
        {
            min = array[i];
            for (int j = i+1; j < size; j++)
                if (array[j] < array[j-1])
                    min = array[j];
            swap(array,min,i);
        }
    }

    public static void swap(int[] array,int i, int j)
    {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
