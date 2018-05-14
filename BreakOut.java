import static java.lang.Character.toUpperCase;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class BreakOut extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle playerPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int score = 0;
	private ArrayList<Block> blocks;
	
	public BreakOut()
	{
		//set up variables
		
		ball=new Ball(100, 250, 10, 10, Color.BLUE);
		
		playerPaddle=new Paddle(300,300,40,40,4);
		keys = new boolean[4];

		buildBlocks();
		
		ArrayList<Block> blocked = new ArrayList<Block>();

		setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);	
		
		int x = 10;
		}
	//starts the key thread to log key strokes
	
	public void update(Graphics window)
	  {
		paint(window);
	  }

	public void paint(Graphics window)
	   {
			Graphics2D twoDGraph = (Graphics2D)window;
			if(back==null)
			   back = (BufferedImage)(createImage(getWidth(),getHeight()));

			Graphics graphToBack = back.createGraphics();
			
			graphToBack.setColor(Color.WHITE);
			graphToBack.fillRect(450, 0, 200, 150);
			graphToBack.setColor(Color.BLACK);
			graphToBack.drawString("Score: " + score, 300, 200);

			Block topWall = new Block(0, 0, 800, 10, Color.WHITE);
			Block bottomWall = new Block(0, 560, 800, 10, Color.WHITE);
			
			Block rightWall = new Block(775, 0, 10, 800, Color.WHITE);
			Block leftWall = new Block(0, 0, 10, 800,Color.WHITE);
			
			topWall.draw(graphToBack);
			bottomWall.draw(graphToBack);
			leftWall.draw(graphToBack);
			rightWall.draw(graphToBack);
			
			
			playerPaddle.draw(graphToBack);
			ball.moveAndDraw(graphToBack);
			//blocks.drawAll(graphToBack);
			for(int i = 0; i < blocks.size(); i++)
			{
				blocks.get(i).draw(graphToBack);
			}
			
			// Wall Collisions
			
			if(ball.didCollideBottom(bottomWall))
			{
				ball.setYSpeed(-ball.getYSpeed());
			}
			if(ball.didCollideTop(topWall)){
				ball.setYSpeed(-ball.getYSpeed());
			}
			if(ball.didCollideLeftWall(leftWall))
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
			if(ball.didCollideRightWall(rightWall)){
				
				ball.setXSpeed(-ball.getXSpeed());
			}
			
			// Paddle Collisions
			if(ball.didCollideLeft(playerPaddle)) 
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
			
			if(ball.didCollideRight(playerPaddle)) 
			{
				ball.setXSpeed(-ball.getXSpeed());
			}
			
			if(ball.didCollideTop(playerPaddle)) {
				ball.setYSpeed(-ball.getYSpeed());
			}
			if(ball.didCollideBottom(playerPaddle)) {
				ball.setYSpeed(-ball.getYSpeed());
			}
			// block collisions
			
			for(int i = 0; i<blocks.size(); i++){
				if(ball.didCollideRight(blocks.get(i)) == true)
				{
					ball.setXSpeed(-ball.getXSpeed());
					blocks.remove(i);
					score++;
				}
				else if(ball.didCollideLeft(blocks.get(i)) == true)
				{
					ball.setXSpeed(-ball.getXSpeed());
					blocks.remove(i);
					score++;
				}
				else if(ball.didCollideTop(blocks.get(i)) == true)
				{
					ball.setYSpeed(-ball.getYSpeed());
					blocks.remove(i);
					score++;
				}
				else if(ball.didCollideBottom(blocks.get(i)) == true)
				{
					ball.setYSpeed(-ball.getYSpeed());
					blocks.remove(i);
					score++;
				}
			}
			//see if the paddles need to be moved
			
			if(keys[1] == true)
			{
				//move up
				playerPaddle.moveUpAndDraw(graphToBack);
			}
			if(keys[0] == true)
			{
				//move down
				playerPaddle.moveDownAndDraw(graphToBack);
			}
			if(keys[3] == true)
			{
				// move left
				playerPaddle.moveLeftAndDraw(graphToBack);
			}
			if(keys[2] == true)
			{
				// move right
				playerPaddle.moveRightAndDraw(graphToBack);
			}
			twoDGraph.drawImage(back, null, 0, 0);
			}

		public void keyPressed(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=true; break;
				case 'S' : keys[1]=true; break;
				case 'A' : keys[2]=true; break;
				case 'D' : keys[3]=true; break;
			}
		}

		public void keyReleased(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=false; break;
				case 'S' : keys[1]=false; break;
				case 'A' : keys[2]=false; break;
				case 'D' : keys[3]=false; break;
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
	public void buildBlocks()
	{
		blocks = new ArrayList<Block>();
		int x = 5;
		for (int i  = 0; i < 17; i++)
		{
			blocks.add(new Block(x, 0, 40, 40, Color.BLUE));
			blocks.add(new Block(x, 520, 40, 40, Color.BLUE));
			x += 45;
		}
		x = 40;
		int y = 45;
		for (int i  = 0; i < 10 ; i++)
		{
			blocks.add(new Block(0, y, 40, 40, Color.BLUE));
			blocks.add(new Block(750, y, 40, 40, Color.BLUE));
			y += 45;
		}
		
		x = 60;
		for (int i  = 0; i < 14; i++)
		{
			blocks.add(new Block(x,42, 40, 40, Color.RED));
			blocks.add(new Block(x, 450, 40, 40, Color.RED));
			x += 45;
		}
		x = 100;
		y = 100;
		for (int i  = 0; i < 8 ; i++)
		{
			blocks.add(new Block(60, y, 40, 40, Color.RED));
			blocks.add(new Block(660, y, 40, 40, Color.RED));
			y += 45;
		}
	}
	
	
	
}
