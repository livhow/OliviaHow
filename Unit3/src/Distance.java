//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
			//sqrt [(x2 - x1)^2 + (y2 = y1)^2]

	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = (xTwo - xOne);
		distance = distance * distance;
		yOne = (yTwo - yOne);
		yOne = yOne * yOne;
		distance = distance + yOne;
		distance = sqrt(distance);

	}

	public void print( )
	{
		System.out.println("distance == " + (String.format("%.3f", distance)));

	}
}