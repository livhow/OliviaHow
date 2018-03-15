//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		out.println("What is the name of this class? ");
		Scanner keyboard = new Scanner(System.in);
		String className = keyboard.nextLine();

		out.println("How many students are in this class?");
		int classNum = keyboard.nextInt();
		
		Class classSet = new Class(className,classNum);
		int count = 1;		
		while(count <= classNum)
		{
			Scanner keyboard2 = new Scanner(System.in);
			out.println("Enter the name of student " + count + " : ");
			String studentName = keyboard2.next();
			
			out.println("Enter the grades for " + studentName);
			out.println("Use the format x - grades ( 2 - 100 100) : ");
			String grades = keyboard2.next();
			
			classSet.addStudent(count-1,new Student(studentName, grades));
			count++;
		}

		System.out.println("Failure List = " + classSet.getFailureList(40));	
		System.out.println("Highest Average = " + classSet.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + classSet.getStudentWithLowestAverage());
								
		System.out.println(String.format("Class Average = %.2f",classSet.getClassAverage()));									

	}		
}