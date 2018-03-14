//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("H:\\Unit11\\Unit11-2016\\Unit11-Assignments\\Lab19b\\gradebook.dat"));

		String className = file.nextLine();
		int classSize = file.nextInt();
		
		file.nextLine();
		
		Class classSet = new Class();
		for(int i = 0; i < classSize; i++)
		{
			String name = file.nextLine();
			String gradeList = file.nextLine();

			classSet.addStudent(i, new Student(name, gradeList));
		}
		
		System.out.println(classSet);
		
		out.println("Failure List = " + classSet.getFailureList(70));	
		out.println("Highest Average = " + classSet.getStudentWithHighestAverage());
		out.println("Lowest Average = " + classSet.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",classSet.getClassAverage()));
		







	}		
}