package examples;
import java.util.Scanner;
import java.util.ArrayList;
public class Classification
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int size, numbers[];
        size=input.nextInt();
        numbers=new int[size];
        for(int i=0;i<size;i++)
            numbers[i]=input.nextInt();
        classifyNumbers(size,numbers);
        input.close();
    }
    public static void classifyNumbers(int size,int[] array)
    {
        boolean printPositiveFirst=Math.abs(array[0])==array[0], hasPositive=false, hasNegative=false;
        ArrayList<Integer> positiveList, negativeList;
        positiveList=new ArrayList<Integer>();
        negativeList=new ArrayList<Integer>();
        for(int i=0;i<size;i++)
        {
            if(Math.abs(array[i])==array[i])
            {
                hasPositive=true;
                positiveList.add(array[i]);
            }
            else
            {
                hasNegative=true;
                negativeList.add(array[i]);
            }
        }
        displayNumbers(printPositiveFirst,hasPositive,hasNegative,positiveList,negativeList);
    }
    public static void printArrayList(ArrayList<Integer> arrayList)
    {
        for(int element: arrayList)
            System.out.printf("%d ",element);
        System.out.println();
    }
    public static void displayNumbers(boolean printPositiveFirst,boolean hasPositive,boolean hasNegative,ArrayList<Integer> positiveList,ArrayList<Integer> negativeList)
    {
        if(hasPositive && hasNegative)
        {
            if(printPositiveFirst)
            {
                printArrayList(positiveList);
                printArrayList(negativeList);
            }
            else
            {
                printArrayList(negativeList);
                printArrayList(positiveList);
            }
        }
        else if(hasPositive)
        {
            printArrayList(positiveList);
            System.out.println("Array doesn't have negative numbers");
        }
        else
        {
            printArrayList(negativeList);
            System.out.println("Array doesn't have positive numbers");
        }
    }
}
