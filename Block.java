//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color = Color.RED;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.BLACK;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
		color = Color.RED;
	}
	public Block(int x, int y, int Wid, int Height)
	{
		xPos = x;
		yPos = y;
		width = Wid;
		height = Height;
		color = Color.BLACK;
	}
	public Block(int x, int y, int Wid, int Height, Color col)
	{
		xPos = x;
		yPos = y;
		width = Wid;
		height = Height;
		color = col;
	}
   //add the other set methods
   
	public void setX(int x)
	   {
			xPos = x;
	   }
	public void setY(int y)
	   {
			yPos = y;
	   }
	public void setWidth(int Wid)
	   {
			width = Wid;
	   }
	public void setHeight(int Height)
	   {
			height = Height;
	   }
	public void setColor(Color col)
	{
		color = col;
	}
	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	//get methods
	public int getX()
	   {
			return xPos;
	   }
	public int getY()
	   {
			return yPos;
	   }
	public int getWidth()
	   {
			return width;
	   }
	public int getHeight()
	   {
			return height;
	   }
	public Color getColor()
	   {
				if( color == null)
				{
					color = Color.BLACK;
				}
			return color;
	   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block rhs = (Block)obj;
		if(getX() == rhs.getX() && getY() == rhs.getY() && getWidth() == rhs.getWidth() && getHeight() == rhs.getHeight())
		{
			return true;
		}
		return false;
	}   

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		String output = "";
		output += xPos + " " + yPos + " " + width + " " + height;
		if(color == null)
		{
			color = Color.BLACK;
		}
			output += " " + color;
		output += "\n";
		return output;
	}
}