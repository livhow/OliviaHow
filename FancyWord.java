//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat = new char[0][0];
	}

   public FancyWord(String s)
	{
	   int end = s.length();
	   mat = new char[end][end];
	   
	   for(char[] row: mat)
	   {
		   Arrays.fill(row,' ');
	   }
	   for(int i = 0; i < end; i++)
	   {
		   mat[0][i] = s.charAt(i);
		   mat[end-1][i] = s.charAt(i);
		   mat[i][i] = s.charAt(i);
		   mat[i][end-i-1] = s.charAt(end - i - 1);
	   }
	}

	public String toString()
	{
		String output="";
		for (int r = 0; r < mat.length; r++)
		{
			for (int c = 0; c < mat[r].length; c++)
			{
				output += mat[r][c];
			}
			output += "\n";
		}
		return output+"\n";
	}
}