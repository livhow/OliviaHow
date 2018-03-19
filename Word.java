//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word = s;
	}
	
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(vowels.contains(word.substring(i, i+1)))
			{
				vowelCount++;
			}
		}
		
		return vowelCount;
	}
	public int compareTo(Word rhs)
	{
		if (numVowels() > rhs.numVowels())
		{
			return 1;
		}
		else if (numVowels() == rhs.numVowels())
		{
			return 0;
		}
		if (numVowels() < rhs.numVowels())
		{
			return -1;
		}
		return 72;
	}

	public String toString()
	{
		return word;
	}
}
