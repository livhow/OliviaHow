//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "";

	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
   		word=s;
   }

	public boolean findLetter(char c)
	{
		word = word.toLowerCase();
		c = Character.toLowerCase(c);
		int loc = word.indexOf(c);
		
		if( loc >= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean findSubString(String s)
	{
		word = word.toLowerCase();
		s = s.toLowerCase();
		if (word.contains(s))
		{
			return true;
		}


		return false;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}