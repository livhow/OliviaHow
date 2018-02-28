//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

   public Triples()
	{
		this(0);
	}
   public Triples(int num)
	{
		number = 0;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int limit = Math.min(a, b);
	    limit = Math.min(limit, c);
	    for(int n = limit; n >= 2; n--)
	    {
	        if ( (a % n == 0) && (b % n == 0) && (c % n == 0) )
	        {
	            return n;
	        }
	    }
		return 1;
	}

	public String toString()
	{
		String output="";

		for(int c=1;c < number; c++)
		{
            for(int b=1;b < number; b++)
            {
                for(int a=1;a < number-2; a++)
                {
                    if(a*a + b*b == c*c)
                    {
                        if (greatestCommonFactor(a,b,c) <= 1 )
                        {
                        	output = output + (a + " " + b + " " + c) + "\n";
                        }
                    }
                }
            }
        }
		return output + "\n";
	}
}