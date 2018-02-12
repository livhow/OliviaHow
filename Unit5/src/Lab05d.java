//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A

		out.print("Enter a letter :: ");
		char letter2 = keyboard.next().charAt(0);
		CharacterAnalyzer test1 = new CharacterAnalyzer(letter2);
		out.println(test1);   //1
		
		out.print("Enter a letter :: ");
		char letter3 = keyboard.next().charAt(0);
		CharacterAnalyzer test2 = new CharacterAnalyzer(letter3);
		out.println(test2);   //a
		
		out.print("Enter a letter :: ");
		char letter4 = keyboard.next().charAt(0);
		CharacterAnalyzer test3 = new CharacterAnalyzer(letter4);
		out.println(test3);   //7
		
		out.print("Enter a letter :: ");
		char letter5 = keyboard.next().charAt(0);
		CharacterAnalyzer test4 = new CharacterAnalyzer(letter5);
		out.println(test4);   //X
		
		
		
		
		
		
		
		
		

	}
}