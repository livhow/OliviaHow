//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileUsed;
	private String fileName;
	private String currentDirectory = System.getProperty("user.dir");

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}
	public Histogram(char[] values, String fName)
	{
			count = new ArrayList<Integer>();
			letters = new ArrayList<Character>();
			for( int i = 0; i < values.length; i++)	
			{
				letters.add(values[i]);
			}
			out.println("search letters = "+letters);
			fileName = currentDirectory + "\\src\\" + fName;
			fileUsed = fName;
	}

	public void loadAndAnalyzeFile() throws IOException
	{
			for (int i = 0; i < letters.size(); i++)
			{
				count.add(0);
			}
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext())
			{
				String tester = file.next();
				for(int i = 0; i < tester.length(); i++)
				{
					for(int j = 0;j < letters.size(); j++)
					{
						if(tester.charAt(i) == (letters.get(j)))
								{
									count.set(j, count.get(j) + 1);
								}
					}
				}
			}
	}

	public char mostFrequent()
	{
		int hold = 0;
		for( int i = 0; i < count.size(); i++)
		{
			if (count.get(i) > count.get(hold))
			{
				hold = i;
			}
		}
		return letters.get(hold);
	}

	public char leastFrequent()
	{
		int hold = 0;
		for( int i = 0; i < count.size(); i++)
		{
			if (count.get(i) < count.get(hold))
			{
				hold = i;
			}
		}
		return letters.get(hold);
	}

	public String toString()
	{
	   return fileUsed
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}