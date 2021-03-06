//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
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
		
		Class classSet = new Class();
		int count = 1;		
		
		do 
		{	
			out.println("Enter the name of student " + count + " : ");
			String studentName = keyboard.next();
			
			out.println("Enter the grades for " + studentName);
			out.println("Use the format x - grades ( 2 - 100 100) : ");
			String grades = keyboard.next();
			
			classSet.addStudent(count-1,new Student(studentName, grades));
		
		}while(count <= classNum);

		out.println("Failure List = " + classSet.getFailureList(70));	
		out.println("Highest Average = " + classSet.getStudentWithHighestAverage());
		out.println("Lowest Average = " + classSet.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",classSet.getClassAverage()));									

	}		
}
