//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	public Monster()
	{
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}
	
	//write an initialization constructor with an int parameter ht
	public Monster(int ht)
	{
		myHeight = ht;
	}

	//write an initialization constructor with int parameters ht and wt

	public Monster(int ht, int wt)
	{
		myHeight = ht;
		myWeight = wt;
	}

	//write an initialization constructor with int parameters ht, wt, and age

	public Monster(int ht, int wt, int age)
	{
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age

	public void setHeight(int ht)
	{
		myHeight = ht;
	}
	public void setWeight(int wt)
	{
		myWeight = wt;
	}
	public void setAge(int age)
	{
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	
	public int getHeight()
	{
		return myHeight;
	}
	
	public int getWeight()
	{
		return myWeight;
	}
	public int getAge()
	{
		return myAge;
	}
	
	//creates a new copy of this Object
	
	public Object clone()
	{ 
		return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Monster rhs = (Monster)obj;
		return (myHeight == rhs.getHeight() && myWeight == rhs.getWeight() && myAge == rhs.getAge());
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;

		if (myHeight >= rhs.getHeight() && myWeight >= rhs.getWeight())
		{
			if (myHeight == rhs.getHeight() && myWeight == rhs.getWeight())
			{
				return 0;
			}
			return 1;
			
		}
		else if (myHeight <= rhs.getHeight() && myWeight <= rhs.getWeight())
		{
			if (myHeight == rhs.getHeight() && myWeight == rhs.getWeight())
			{
				return 0;
			}
			return -1;
		}
		return 72;
	}

	public String toString()
	{
		String output = myHeight + " " + myWeight + " " + myAge;
		return output;
	}
	
	
}