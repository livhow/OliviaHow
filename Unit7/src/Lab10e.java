//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing Game - how many numbers would you like?");
		int response = keyboard.nextInt() ;
		
		GuessingGame test = new GuessingGame();
		test.setGuessingGame(response);
		test.playGame();
		out.println(test.toString());





	}
}