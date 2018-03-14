//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;
//import static java.util.Arrays.*;

import java.lang.reflect.Array;

public class Class
{
	private String name;
	private List<Student> studentList;
	
	public Class()
	{
		name="";
		studentList = new ArrayList<Student>();
	}
		public Class(String name1)
	{
		name = name1;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(int stuNum, Student s)
	{
		
		studentList.add(stuNum, s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for (int i = 0; i < studentList.size(); i++)
		{
			classAverage += getStudentAverage(i);
		}
		classAverage /= studentList.size();

		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{

		for (int i = 0; i < studentList.size(); i++)
		{
			if ( getStudentName(i) == stuName)	
			{
				return studentList.get(i).getAverage();
			}
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();		
		return getStudentName(studentList.size() - 1);
	}

	public String getStudentWithLowestAverage()
	{
		sort();		
		return getStudentName(0);
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for (int i = 0; i < studentList.size(); i++)
		{
			if (getStudentAverage(i) <= failingGrade)
			{
				output += getStudentName(i);
			}
		}

		return output;
	}
	
	public void sort()
	{
		Collections.sort(studentList);
	}
	public String toString()
	{
		String output=""+getClassName()+"\n";
		return output;
	}  	
}
