//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Word implements Comparable<Word>
{
	private String word;

	public Word()
	{
		word = "";
	}
	public Word( String s )
	{
		setWord(s);
	}
	
	public void setWord(String s)
	{
		word = s;
	}
	
	public int compareTo( Word rhs )
	{
		return 0;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < Words.length; i++)
		{
			output += Words[i] + "\n";
		}
		return output;
	}
}