//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore = 0, leftScore = 0;

	public Pong()
	{
		//set up all variables related to the game
		
		ball=new Ball(10, 100, 10,10, Color.BLUE);
		
		leftPaddle=new Paddle(30,10,10,50,4);
		rightPaddle=new Paddle(750,10,10,50,4);

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window)
   {
	   paint(window);
   }

   public void paint(Graphics window)
   {

	   //set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(450, 0, 200, 150);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("rightScore: " + rightScore, 500, 50);
		graphToBack.drawString("leftScore: " +leftScore, 500, 30);

		Block topWall = new Block(0, 0, 800, 10, Color.GREEN);
		Block bottomWall = new Block(0, 560, 800, 10, Color.GREEN);
		
		Block rightWall = new Block(775, 0, 10, 800, Color.BLUE);
		Block leftWall = new Block(0, 0, 10, 800, Color.RED);
		
		topWall.draw(graphToBack);
		bottomWall.draw(graphToBack);
		leftWall.draw(graphToBack);
		rightWall.draw(graphToBack);
		
		
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		ball.moveAndDraw(graphToBack);

	/*	if(!(ball.getX()+ball.getWidth()<=rightPaddle.getX() && ball.getX()+ball.getWidth()>=leftPaddle.getX()+leftPaddle.getWidth())
				&&!(ball.didCollideLeft(leftPaddle)) && !(ball.didCollideRight(rightPaddle)) && !(ball.didCollideTop(leftPaddle)) 
						&& !(ball.didCollideBottom(rightPaddle)))
		{
			if(ball.getX()<=rightPaddle.getX()-ball.getWidth()) {
				rightScore++;
			}
			if(ball.getX()>=leftPaddle.getX()+leftPaddle.getWidth()-ball.getWidth()) {
				leftScore++;
			}


			//graphToBack.clearRect(0, 0, 800, 600);
			//update(graphToBack);
		}
*/
		
		//see if the ball hits the top or bottom wall 

		if(ball.didCollideBottom(bottomWall))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.didCollideTop(topWall)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		if(ball.didCollideLeftWall(leftWall))
		{
			rightScore++;
			ball.setXSpeed(-ball.getXSpeed());
			ball.setX(300);
			ball.setY(300);
		}
		if(ball.didCollideRightWall(rightWall)){
			leftScore++;
			ball.setXSpeed(-ball.getXSpeed());
			ball.setX(300);
			ball.setY(300);
		}

		//see if the ball hits the left paddle
		
		if(ball.didCollideLeft(leftPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		if(ball.didCollideRight(rightPaddle)) {
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the paddles need to be moved
		
		
		if(keys[1] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[0] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
		}
   
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}