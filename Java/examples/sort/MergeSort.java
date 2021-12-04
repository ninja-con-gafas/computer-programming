package examples.sort;
import java.util.Arrays;
import java.util.Scanner;
public class MergeSort
{
    public static int[] sort(int[] array)
    {
        return sort(array,0,array.length-1);
    }

    public static int[] sort(int[] array, int leftIndex, int rightIndex)
    {
        if(leftIndex < rightIndex)
        {
            int midIndex = (leftIndex + rightIndex) / 2;
            sort(array,leftIndex,midIndex);
            sort(array,midIndex+1,rightIndex);
            merge(array,leftIndex,midIndex,rightIndex);
        }
        return array;
    }
    
    public static void merge(int[] array,int leftIndex, int midIndex, int rightIndex)
    {
        int leftPointer = leftIndex, rightPointer = midIndex + 1, pointer = 0;
        int[] mergedArray = new int[array.length];
        while(leftPointer <= midIndex && rightPointer <= rightIndex)
        {
            if(array[leftPointer] <= array[rightPointer])
            {
                mergedArray[pointer] = array[leftPointer];
                pointer++;
                leftPointer++;
            }
            else
            {
                mergedArray[pointer] = array[rightPointer];
                pointer++;
                rightPointer++;
            }
        }
        while(leftPointer <= midIndex)
        {
            mergedArray[pointer] = array[leftPointer];
            pointer++;
            leftPointer++;
        }
        while(rightPointer <= rightIndex)
        {
            mergedArray[pointer] = array[rightPointer];
            pointer++;
            rightPointer++;
        }
        for(leftPointer = leftIndex, pointer = 0; leftPointer <= rightIndex; leftPointer++,pointer++)
            array[leftPointer] = mergedArray[pointer];
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();
        System.out.println(Arrays.toString(sort(array)));
    }
}
