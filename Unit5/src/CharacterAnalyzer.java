//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 0;
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{

		theChar = c;
	}

	public char getChar()
	{
		char getChar = theChar;
		return getChar;
	}

	public boolean isUpper()
	{
		if (Character.isUpperCase(theChar))
		{
			return true;
		}

		return false;
	}

	public boolean isLower( )
	{
		if (Character.isLowerCase(theChar))
		{
			return true;
		}

		return false;
	}
	
	public boolean isNumber()
	{
		if(Character.isDigit(theChar))
		{
			return true;
		}

		return false;
	}	

	public int getASCII( )
	{
		return ((int)theChar);
	}

	public String toString()
	{
		if (isNumber())
		{
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";	 
		}
		
		if (isNumber()==false && isLower() && isUpper() == false)
		{
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	 
		}
		
		if (isNumber()==false && isLower()==false && isUpper())
		{
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	 
		}
	  return "Howdy";
	}
}