//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("",0);
	}

	public void setTriangle( String let, int sz )
	{
		size =sz;
		letter = let;
	}
	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output = "";
		for(int i = 0; i <= size; i++)
	    {
			for(int k=0; k<=(size -i); k++)
	        {
	            output = output + (" ");
	        }
			for(int j=0; j<=i; j++)
	        {
	            output = output + (letter);
	        }
	        output = output + ("\n");
	    }
		return output;
	}
}