//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.Character.toUpperCase;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Paddle extends Block
{
   //instance variables
   private int speed;
   private boolean[] keys;
   public Paddle()
   {
		super(10,10, 10,10);
		speed =5;
   }
   //add the other Paddle constructors
   public Paddle(int sped)
   {
		super(10,10, 10,10);
		speed = sped;
   }
   public Paddle(int x, int y)
   {
		super(x,y, 10, 10);
		speed = 5;
   }
   public Paddle(int x, int y, int sped)
   {
		super(x,y, 10, 10);
		speed = sped;
   }
	public Paddle(int x, int y, int Wid, int Height,int sped)
	{
		super(x,y, Wid, Height);
		speed = sped;
	}
	public Paddle(int x, int y, int Wid, int Height, Color col, int sped)
	{
		super(x,y, Wid, Height, col);
		speed = sped;
	}

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY((getY() + speed));
	   draw(window);
   }
   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY((getY() - speed));
	   draw(window);
   }

   public int getPaddleSpeed()
   {
		return speed;
   }	
    
   public String toString()
	{
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		output += " " + speed;
		output += "\n";
		return output;
	}
}