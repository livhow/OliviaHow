//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		
	}

	public void Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		
		// -b +/- (sqrt b2 -4ac)/2a
		
		rootOne = (b * b) - (4 * a * c);
		rootOne = Math.sqrt(rootOne);
		rootTwo = rootOne;
		rootOne = (b * -1) + rootOne;
		rootTwo = (b * -1) - rootTwo;
 	}

	public void calcRoots( )
	{
		rootTwo = rootTwo / (2 * a);
		rootOne = rootOne / (2 * a);

	}

	public void print( )
	{
		System.out.println("rootone :: " + (String.format("%.3f", rootOne)));
		System.out.println("roottwo :: " + (String.format("%.3f", rootTwo)));

	}
}