//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private List<Alien> bossAliens;
	private int aliensDead = 0;
	
	public AlienHorde()
	{
		aliens = new ArrayList<Alien>();
		bossAliens = new ArrayList<Alien>();
	}
	public AlienHorde(int size, int size2)
	{
		aliens = new ArrayList<Alien>();
		int x = 50;
		int y = 10;
		size2 = size2;
		for (int j  = 0; j < size2; j++)
		{
			for (int i  = 0; i < size; i++)
			{
				aliens.add(new Alien(x, y, 40, 40, 2));
				x += 50;
			}
			x = 50;
			y -= 50;
		}
	}

	public void addIt(Alien al)
	{
		aliens = new ArrayList<Alien>();
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int j = 0; j <aliens.size(); j++)
		{
			aliens.get(j).draw(window);
		}
	}
	
	public void drawBigGuy( Graphics window )
	{
		int x  = 50;
		
		for (int i  = 0; i < 4; i++)
			{
				bossAliens.add(new Alien(x, 50, 70, 70, 2));
				x += 100;
			}
			x = 50;
		/*for(int j = 0; j <bossAliens.size(); j++)
		{
				bossAliens.get(j).draw(window);
		}
		*/
	}

	public void moveEmAll()
	{
		for(int j = 0; j <aliens.size(); j++)
		{
			if(aliens.get(j).getX() <= 1000)
			{
	      	 if(aliens.get(j).getX()> 900)
	      	 {
	      		 aliens.get(j).setY(aliens.get(j).getY()+50);
	      		 aliens.get(j).setSpeed(-(aliens.get(j).getSpeed()));
	      	 }
	      	 else if (aliens.get(j).getX() < - 100)
	      	 {
	      		aliens.get(j).setY(aliens.get(j).getY()+50);
	      		aliens.get(j).setSpeed(-(aliens.get(j).getSpeed()));
	      	 }
			}
			aliens.get(j).move("RIGHT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		 for(int i = 0; i < shots.size(); i++)
         {
             for(int j = 0; j < aliens.size(); j++)
             {
            	 if((shots.get(i).getX() + shots.get(i).getWidth()) > (aliens.get(j).getX()) 
           			  && shots.get(i).getX() < aliens.get(j).getX() + aliens.get(j).getWidth()
           			  && (shots.get(i).getY() <= aliens.get(j).getY() + aliens.get(j).getHeight())
           			  && (shots.get(i).getY() >= aliens.get(j).getY() - aliens.get(j).getHeight()))
                 {
                     aliens.remove(j);
                     shots.remove(i);
                     aliensDead++;
                 }

             }
         }
	}
	public int getDeadAliens()
	{
		return aliensDead;
	}
	public String toString()
	{
		return "";
	}
}
