//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		quickSort(list, 0, list.length - 1);
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if (low < high)
		{
			int split = partition(list, low, high);
			System.out.println("Pass: " + passCount + " " + Arrays.toString(list) + "\n");
			passCount++;
			quickSort(list, low, split);
			quickSort(list, split + 1, high);
		}
	}

	private static int partition(Comparable[] list, int low, int high)
	{
		Comparable pivot = list[low];
		int bot = low  -1;
		int top = high + 1;
		
		while(bot < top)
		{
			while(list[++bot].compareTo(pivot) < 0);
			while(list[--top].compareTo(pivot) > 0);
				if (bot >= top)	
				{
					return top;
				}
			Comparable holder = list[top];
			list[top] = list[bot];
			list[bot] = holder;
		}
		return 0;
	}
}