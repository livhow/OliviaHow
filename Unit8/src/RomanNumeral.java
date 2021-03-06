//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public Integer getNumber()
	{
		int local = 0;
		number = 0;
		for (int i = 0; i < roman.length(); i++)
		 {
			for(int a = 0; a < LETTERS.length; a++)
			{
				if( ((i + 1) < roman.length()) && (roman.substring(i, i+2).equals(LETTERS[a])))
				{
					local = a;
					number += NUMBERS[local];
					i++;
				}
				else if ((Character.toString(roman.charAt(i)).equals(LETTERS[a]) && (LETTERS[local].length() == 1)))
				{
					local = a;
					number += NUMBERS[local];
				}
			}
		 }
		return number;
	}

	public String toString()
	{
		String output = "";
		for (int i = 0; i < NUMBERS.length; i++)
		{
			while (number >= NUMBERS[i])
			{
				output = output + LETTERS[i];
				number -= NUMBERS[i];
			}
		}
		
		return output + "\n";
	}
}