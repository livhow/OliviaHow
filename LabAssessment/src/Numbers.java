
import java.lang.Math;
public class Numbers 
{
	private int[] someGoofyNumbers;

	public static void main(String[] args)
	{
		System.out.println(isGoofy(3));
		System.out.println(isGoofy(10)); // could not figure out how to truncate
		//System.out.println(getSomeGoofyNumbers(3));
	}
	
	public static boolean isGoofy(int goofy)
	{
		int sum = 0;
		int onesPlace = goofy % 10;
		int tensPlace = goofy%10;
		if (goofy >= 0)
		{
			if (goofy > 9)
			{
				if (goofy % tensPlace == 0)
				{
					sum += tensPlace;
				}
				if (goofy % onesPlace == 0)
				{
					sum += onesPlace;
				}
			}
			else
			{
				sum = onesPlace;
			}
		}
		if (sum % 2 != 0 && sum > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int[] getSomeGoofyNumbers(int howMany)
	{
		int holdList;
		int counter = 0;
		int count = 0;
		holdList = someGoofyNumbers[howMany];
		for (int i =0; i <= howMany; i++)
		{
				while (counter <= howMany)
				{
					if( isGoofy(count+1))
					{
						holdList[i] = count + 1;
					}
					counter++;
				}
		}

		return holdList;
	}
}
