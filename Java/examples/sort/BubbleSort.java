package examples.sort;
import java.util.Scanner;
public class BubbleSort
{
    public static void sort(int[] array)
    {
        int size = array.length;
        for(int i = 0; i < size; i++)
        {
            for(int j = 1; j < size - i; j++)
            {
                if(array[j] > array[j-1])
                    swap(array, j,j-1);
            }
        }
    }

    public static void swap(int[] array,int i, int j)
    {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int size = in.nextInt();
        int[] array =new int[size];
        for(int i = 0;i < size; i++)
            array[i] = in.nextInt();
        BubbleSort.sort(array);
        for(int element : array)
            System.out.printf("%d ",element);
    }
}
