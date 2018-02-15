//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats check = new LoopStats();
		check.setNums(1,5);
		check.getEvenCount();
		check.getOddCount();
		check.getTotal();
		check.toString();
		out.println(check);
		
		check.setNums(2,8);
		check.getEvenCount();
		check.getOddCount();
		check.getTotal();
		check.toString();
		out.println(check);
		
		check.setNums(5,15);
		check.getEvenCount();
		check.getOddCount();
		check.getTotal();
		check.toString();
		out.println(check);
		
		
		
					
	}
}