//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	private int[] array;

	public Grades()
	{
		setGrades(array);
	}

	public void setGrades(int[] array1)
	{
		array = array1;
	}
	private double getSum()
	{
		double sum=0.0;
		for( int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0, sum = 0.0;
		
		sum = getSum();
		average = sum/(array.length);
		
		return average;
	}

	public String toString()
	{
		String output = "";
		for( int i = 0; i < array.length; i++)	
		{
			output = output+ ("Grade " + i + ": " + array[i] + "\n");
		}
		output = output + "Average = " + getAverage();
		return output;
	}



}