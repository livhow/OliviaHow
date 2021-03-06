//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student implements Comparable
{
	private String myName;
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades(gradeList);
	}
	
	public void setGrade(int spot, double grade)
	{
		
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return (myGrades.getSum()/myGrades.getNumGrades());
	}

	public double getAverageMinusLow()
	{
		return ( (myGrades.getSum() - myGrades.getLowGrade()) / (myGrades.getNumGrades() -1));
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	public boolean equals(Object obj)
	{
		Student rhs = (Student)obj;
		return(getAverage() == rhs.getAverage());
	}
	public int compareTo(Object obj)
	{
		Student rhs = (Student)obj;
		if( getAverage() >= rhs.getAverage())
		{
			return 1;
		}
		else if( getAverage() <= rhs.getAverage())
		{
			return -1;
		}
		return 0;
	}
	public String toString()
	{
		return "";
	}	
}
