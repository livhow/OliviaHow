//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;
	private int max;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
		max = 0;
	}

	public void setWords(String sentence)
	{
		max = Integer.MIN_VALUE;
		for(int i = 0; i < wordRay.length; i++)
		{
			if (wordRay[i].length() > max)
			{
				max = wordRay[i].length();
			}
			wordRay[i] = new StringBuffer(wordRay[i]).reverse().toString();
		}
		
		//System.out.println(Arrays.toString(wordRay));
		
		Collections.reverse(Arrays.asList(wordRay));
		
		//System.out.println(Arrays.toString(wordRay));
	}

	public String toString()
	{
		String output="";
		for(int r = 0; r < max; r++)
		{
			for(int c = 0; c < wordRay.length; c++)
			{
				if (r < wordRay[c].length())
				{
					output += wordRay[c].charAt(r);
				}
				else
				{
					output += " ";
				}
			}
			output += "\n";
		}
		return output+"\n\n";
	}
}