//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;

public class Grades
{
	private double[] grades;
	private String usableString;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);
		usableString = "";
	}
	
	public void setGrades(String gradeList)
	{
		//"5 - 90 85 95.5 77.5 88"
		int size = Integer.parseInt(gradeList.substring(0,1));
		grades = new double[size];
		usableString = gradeList.substring(gradeList.indexOf("-") + 1);
		Scanner file = new Scanner(usableString);
		int counter = 0;
		while (file.hasNext())
		{
			double grade = file.nextDouble();
			setGrade(counter, grade);
			counter++;
		}
	}
	
	public void setGrade(int spot, double grade)
	{

			grades[spot] = grade;
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++)
		{
			sum += grades[i];
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for( int i = 0; i < grades.length; i++)
		{
			if (grades[i] < low)
			{
				low = grades[i];
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for( int i = 0; i < grades.length; i++)
		{
			if (grades[i] > high)
			{
				high = grades[i];
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";





		return output;
	}	
}