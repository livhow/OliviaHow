//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.File;

public class Grades
{
	private ArrayList<Double> grades;
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
		grades = new ArrayList<Double>();
		//"5 - 90 85 95.5 77.5 88"
		int size = Integer.parseInt(gradeList.substring(0,1));
		for(int i = 0; i < size; i++)
		{
			grades.add((double) 0);
		}
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
			grades.set(spot,grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.size(); i++)
		{
			sum += grades.get(i);
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for( int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i) < low)
			{
				low = grades.get(i);
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for( int i = 0; i < grades.size(); i++)
		{
			if (grades.get(i) > high)
			{
				high = grades.get(i);
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";
		return output;
	}	
}