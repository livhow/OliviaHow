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
import java.util.ArrayList;
import java.util.Date;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;

	/* uncomment once you are ready for this part
	 *
   private AlienHorde horde;
	private Bullets shots;
	*/
	private ArrayList<Ammo> shots;
	private AlienHorde aliens;
	private AlienHorde bossAliens;
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		shots = new ArrayList<Ammo>();
		aliens = new AlienHorde(10, 3);
		bossAliens = new AlienHorde();
		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(300, 500, 60, 60, 5);
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}
	
   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;
		
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack=  back.createGraphics();


		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		ship.draw(graphToBack);
		/*for (Alien a : aliens)
		{
			a.draw(graphToBack);
		}
		*/
		
		aliens.drawEmAll(graphToBack);

		for(int i = 0; i <shots.size(); i++)
		{
			shots.get(i).draw(graphToBack);
			shots.get(i).move("UP");
		}
		
		/*
		for(int j = 0; j <aliens.size(); j++)
		{
			aliens.get(j).draw(graphToBack);
			if(aliens.get(j).getX() <= 1000)
			{
          	 if(aliens.get(j).getX()>750)
          	 {
          		 aliens.get(j).setY(aliens.get(j).getY()+50);
          		 aliens.get(j).setSpeed(-(aliens.get(j).getSpeed()));
          	 }
          	 else if (aliens.get(j).getX() < 10)
          	 {
          		aliens.get(j).setY(aliens.get(j).getY()+50);
          		aliens.get(j).setSpeed(-(aliens.get(j).getSpeed()));
          	 }
			}
			aliens.get(j).move("RIGHT");
		}
		*/
		aliens.moveEmAll();
		
		bossAliens.drawEmAll(graphToBack);
		bossAliens.moveEmAll();

		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		/*if(keys[2] == true)
		{
			ship.move("UP");
		}if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		*/
		if(keys[4] == true)
		{
			Ammo shot = new Ammo(ship.getX()+28, ship.getY(), 3);
            shots.add(shot);
            keys[4]=false;
		}

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		
	/*	for(int i = 0; i < shots.size(); i++)
          {
              for(int j = 0; j < aliens.size(); j++)
              {
            	  if((shots.get(i).getX() + shots.get(i).getWidth()) > (aliens.get(j).getX()) 
            			  && shots.get(i).getX() < aliens.get(j).getX() + aliens.get(j).getWidth()
            			  && (shots.get(i).getY() <= aliens.get(j).getY() + aliens.get(j).getHeight())
            			  && (shots.get(i).getY() >= aliens.get(j).getY() - aliens.get(j).getHeight()))
                  {
            		  shots.remove(i);
            		  aliens.remove(j);
                  }
              }
          }
	*/
		aliens.removeDeadOnes(shots);
		if(aliens.getDeadAliens() == 10)
		{
			bossAliens.drawBigGuy(graphToBack);
		}
		
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

