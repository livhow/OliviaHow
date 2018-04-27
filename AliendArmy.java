import java.util.List;

public class AliendArmy extends AlienHorde
{
	private List<Alien> aliens;
	
	public AliendArmy(int size, int size2)
	{
		super(size, size2);
	}
	
	public void moveEmAllUnder()
	{
		for(int j = 0; j <aliens.size(); j++)
		{
			if(aliens.get(j).getX() >= 1000)
			{
	      	 if(aliens.get(j).getX()> 900)
	      	 {
	      		 aliens.get(j).setY(aliens.get(j).getY()+50);
	      		 aliens.get(j).setSpeed(-(aliens.get(j).getSpeed()));
	      	 }
	      	 else if (aliens.get(j).getX() > - 100)
	      	 {
	      		aliens.get(j).setY(aliens.get(j).getY()+50);
	      		aliens.get(j).setSpeed(-(aliens.get(j).getSpeed()));
	      	 }
			}
			aliens.get(j).move("RIGHT");
		}
	}
}
