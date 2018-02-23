//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(0);
	}

	public Prime(int num)
	{
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		int counter = 2;
			while (counter < number)
			{
				if (number % counter == 0)
				{
					return false;
				}
				counter++;
			}
		return true;
	}

	public String toString()
	{
		String output = "";
		if (isPrime())
		{
			output = number + " is prime." + "\n";
		}
		else
		{
			output = number + " is not prime." + "\n";
		}
		return output;
	}
}