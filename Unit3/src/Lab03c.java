//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		int a,b,c;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a :: ");
		a = keyboard.nextInt();
		
		System.out.print("Enter b :: ");
		b = keyboard.nextInt();
	 
		System.out.print("Enter c :: ");
		c= keyboard.nextInt();
		
		Quadratic one = new Quadratic();
		one.Quadratic(a,b,c);
		one.setEquation(a,b,c);
		one.calcRoots();
		one.print();
		
   	
   	
		
		
	}
}