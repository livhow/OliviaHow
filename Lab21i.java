//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("H:\\Unit14_2016 (1)\\Unit14_2016\\Unit14-Assignments\\lab21i.dat"));
		
		while (file.hasNext())
		{
			int size = file.nextInt();
			file.nextLine();
			Maze test = new Maze(size, file.nextLine());
			test.hasExitPath(0,0);
			out.println(test);
		}
	}
}