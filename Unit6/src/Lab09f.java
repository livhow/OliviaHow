//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		//add test cases
		
		LetterRemover check = new LetterRemover();
		check.setRemover("olivia olivia olivia", 'o');
		check.removeLetters();
		check.toString();
		out.println(check);
		

		check.setRemover("I am Sam I am Sam I am Sam", 'a');
		check.removeLetters();
		check.toString();
		out.println(check);
		
											
	}
}