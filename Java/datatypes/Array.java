package datatypes;
import java.util.Scanner;
import java.util.ArrayList;
public class Array
{
	public static void main(String[] args)
	{
		int[] numbers;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter numbers in a single line sperated by space");
		Scanner inputLine=new Scanner(input.nextLine());
		ArrayList<Integer> numberList=new ArrayList<Integer>();
		while(inputLine.hasNextInt())
			numberList.add(inputLine.nextInt());
		numbers=createArray(numberList);
		printArray(numbers);
		reverseArray(numbers);
		printArray(numbers);
		input.close();
	}
	public static int[] createArray(ArrayList<Integer> list)
	{
		int array[],size;
		size=list.size();
		array=new int[size];
		for(int i=0;i<size;i++)
			array[i]=list.get(i);
		return array;
	}
	public static void reverseArray(int[] array)
	{
		int size=array.length;
		for(int i=0;i<size/2;i++)
		{
			array[i]+=array[size-i-1];
			array[size-i-1]=array[i]-array[size-i-1];
			array[i]-=array[size-i-1];
		}
	}
	public static void printArray(int[] array)
	{
		System.out.println(createArrayList(array));
	}
	public static ArrayList<Integer> createArrayList(int[] array)
	{
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for(int element:array)
			arrayList.add(element);
		return arrayList;
	}
}
