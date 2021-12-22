package examples.sort;
import java.util.Arrays;
import java.util.Scanner;
public class QuickSort
{
    public static void sort(int[] array)
    {
        sort(array, 0, array.length-1);
    }
    public static void sort(int[] array, int start, int end)
    {
        if (start < end)
        {
            int partitionIndex = partition(array, start, end);
            sort(array, 0, partitionIndex - 1);
            sort(array, partitionIndex + 1, end);
        }
    }
    public static int partition(int[] array, int start, int end)
    {
        int pivot = array[end];
        int partitionIndex = start;
        for (int iterator = start; iterator < end; iterator++)
        {
            if (array[iterator] <= pivot)
            {
                int temp1 = array[iterator];
                array[iterator] = array[partitionIndex];
                array[partitionIndex] = temp1;
                partitionIndex++;
            }
        }
        int temp2 = array[partitionIndex];
        array[partitionIndex] = array[end];
        array[end] = temp2;
        return partitionIndex;
    }
    public static void swapArrayElements(int[] array, int index1, int index2)
    {
        array[index1] = array[index1] + array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] = array[index1] - array[index2];
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
