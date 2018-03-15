import java.io.File;
import java.util.Scanner;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
	   System.out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("gradebook.dat"));

		String className = file.nextLine();
		int classSize = file.nextInt();
		
		file.nextLine();
		
		Class classIt = new Class();
		for(int i = 0; i < classSize; i++)
		{
			String name = file.nextLine();
			String gradeList = file.nextLine();

			classIt.addStudent(i, new Student(name, gradeList));
		}
		
		System.out.println(classIt);
		
		System.out.println("Failure List = " + classIt.getFailureList(40));	
		System.out.println("Highest Average = " + classIt.getStudentWithHighestAverage());
		System.out.println("Lowest Average = " + classIt.getStudentWithLowestAverage());
								
		System.out.println(String.format("Class Average = %.2f",classIt.getClassAverage()));
}
   }