//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Rectangle;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		super(x,y);
		speed = 0;
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	  speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
        window.fillRect(getX(), getY(), 5, 5);
	}
	
	public void move( String direction )
	{
		if(direction.equals("LEFT"))
		{
           setX(getX()-getSpeed());
       }
       else if(direction.equals("RIGHT"))
       {
           setX(getX()+getSpeed());
       }
       else if(direction.equals("DOWN"))
       {
           setY(getY()+getSpeed());
       }
       else if(direction.equals("UP"))
       {
           setY(getY()-getSpeed());
       }
	}

	public String toString()
	{
		return "";
	}
}
