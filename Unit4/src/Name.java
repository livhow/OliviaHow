//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		int local = name.indexOf(" ");
		return name.substring(0, local);
	}

	public String getLast()
	{
		int local = name.indexOf(" ");
		return name.substring(local + 1);
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}