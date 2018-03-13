//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

import java.lang.reflect.Array;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
		public Class(String name1, int stuCount)
	{
		name = name1;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.length; i++)
		{
			classAverage += getStudentAverage(i);
		}
		classAverage /= studentList.length;

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{

		for (int i = 0; i < studentList.length; i++)
		{
			if ( getStudentName(i) == stuName)	
			{
				return studentList[i].getAverage();
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();		
		return getStudentName(studentList.length - 1);
	}

	public String getStudentWithLowestAverage()
	{
		sort();		
		return getStudentName(0);
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for (int i = 0; i < studentList.length; i++)
		{
			if ( getStudentAverage(i) <= failingGrade)
			{
				output += getStudentName(i);
			}
		}

		return output;
	}
	
	public void sort()
	{
		Arrays.sort(studentList);
	}
	public String toString()
	{
		String output=""+getClassName()+"\n";
		return output;
	}  	
}
