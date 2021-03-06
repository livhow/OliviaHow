//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound, guesses;
	private double saveAns;
	float percent;

	public GuessingGame()
	{
		setGuessingGame(0);
	}
	public void setGuessingGame(int stop)
	{
		upperBound = stop;
		guesses = 0;
		saveAns = 0.0;
		percent = 0.0f;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		double choice = Math.round(Math.random()*(upperBound - 1) + 1), input = 0;
		saveAns = choice;
		int counter = 0;

		while(choice != input)
		{
			System.out.println("Enter a number between 1 and " + upperBound);
			input = keyboard.nextInt() ;
			counter++;
		}
		guesses = counter;
		percent = (float)(counter*100/(upperBound));
	}

	public String toString()
	{
		String output="";
		output = "It took " + guesses + " guesses to guess " + saveAns + "\n" + "You guessed wrong " + percent + " percent of the time." ;
		return output;
	}
}