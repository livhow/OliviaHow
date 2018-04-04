//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 0;
		ySpeed = 0;
		
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int Wid, int Height)
	{
		super(x, y, Wid, Height);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int Wid, int Height, Color color)
	{
		super(x, y, Wid, Height, color);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int Wid, int Height, Color color, int xSpd, int ySpd)
	{
		super(x, y, Wid, Height, color);
		xSpeed = xSpd;
		ySpeed = ySpd;
	}
  
   //add the set methods
   
	public void setXSpeed(int x)
	   {
			xSpeed = x;
	   }
	public void setYSpeed(int y)
	   {
			ySpeed = y;
	   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window, Color.WHITE);
      int newX = (getX() + xSpeed);
      int newY = (getY() + ySpeed);
      setX(newX);
      setY(newY);
   
	  draw(window, Color.BLACK);
	 // System.out.println("moving ball" + getX() + " " +  getY());
   }
   
	public boolean equals(Object obj)
	{
		Ball ball = (Ball) obj;
		Block thingy = (Block) obj;
		if(thingy == (Block)this && xSpeed==ball.getXSpeed() && ySpeed==ball.getYSpeed()){
			return true;
		}
		return false;
	}   

   //add the get methods

	public int getXSpeed()
	   {
			return xSpeed;
	   }
	public int getYSpeed()
	   {
			return ySpeed;
	   }
   //add a toString() method
	public String toString()
	{
		String output = "";
		output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		output += " " + xSpeed + " " + ySpeed;
		output += "\n";
		return output;
	}
	
	public boolean didCollideLeft(Object obj){
		Paddle paddle = (Paddle) obj;
		if(this.getX()<=paddle.getX()+paddle.getWidth()-this.getXSpeed()
		&& this.getY()>=paddle.getY()
		&& this.getY()<=paddle.getY()+paddle.getHeight()){
			return true;
		}
			return false;
	}
	public boolean didCollideRight(Object obj){
		Paddle paddle = (Paddle) obj;
		if(this.getX()+this.getWidth()>=paddle.getX()-this.getXSpeed()
		&& this.getY()>=paddle.getY()
		&& this.getY()<=paddle.getY()+paddle.getHeight()){
			return true;
		}
		return false;
	}
	public boolean didCollideTop(Object obj){
		Block block = (Block) obj;
		//System.out.println(this.getY()+ " " + block.getY() + " " + block.getHeight());
		if(this.getY()<=block.getY()+block.getHeight()){
			return true;
		}
		return false;
	}
	public boolean didCollideBottom(Object obj) {
		Block block = (Block) obj;
		if(this.getY()>=block.getY()){
			return true;
		}
		return false;
	}
	
	public boolean didCollideRightWall(Object obj){
		Block block = (Block) obj;
		//System.out.println(this.getY()+ " " + block.getY() + " " + block.getHeight());
		if(this.getX()>= block.getX() + block.getWidth()){
			return true;
		}
		return false;
	}
	public boolean didCollideLeftWall(Object obj) {
		Block block = (Block) obj;
		if(this.getX()<= block.getX() - block.getWidth()){
			return true;
		}
		return false;
	}
}