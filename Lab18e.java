//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<String> wordy = new ArrayList<String>();
		
		Scanner file = new Scanner(new File("H:\\Unit12-2016\\Unit12-2016\\Unit12-Assignments\\lab18e\\lab18e.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		while(file.hasNext())
		{
			wordy.add(file.next());
		}
		System.out.println(wordy);
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
				{
					Word word1 = new Word(wordy.get(i));
					Word word2 = new Word(wordy.get(j));

					if (word1.compareTo(word2) == 1)	
					{
						String hold = wordy.get(i);
						wordy.set(i, wordy.get(j));
						wordy.set(j, hold);
					}		
					
					String alpha = "abcdefghijklmnopqrstuvwxyz";
					
					if (word1.compareTo(word2) == 0)	
					{
						if(alpha.indexOf(wordy.get(i).substring(0,1)) > alpha.indexOf(wordy.get(j).substring(0,1)))
								{
									String hold = wordy.get(i);
									wordy.set(i, wordy.get(j));
									wordy.set(j, hold);
								}
					}
				}
		}
		System.out.println(wordy);
		for(int i = size-1; i >= 0; i--) 
		{
			System.out.println(wordy.get(i));
		}
	}
}
