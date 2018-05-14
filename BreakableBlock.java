import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class BreakableBlock extends Block
{
	private ArrayList<Block> blocks;
	
	public  BreakableBlock()
	{
	}
	
	public void drawAll(Graphics window)
	  {
		for (int i  = 0; i < blocks.size() ; i++)
		{
			window.setColor(blocks.get(i).getColor());
		    window.fillRect(blocks.get(i).getX(), blocks.get(i).getY(), blocks.get(i).getWidth(), blocks.get(i).getHeight());
		}
	  }
	
	public void drawEmAll( Graphics window, ArrayList<BreakableBlock> blocks )
	{
		for(int j = 0; j <blocks.size(); j++)
		{
			blocks.get(j).draw(window);
		}
	}
	public ArrayList<Block> getArray()
	{
		return blocks;
	}
	public void checkBlockCollisons(Ball ball)
	{
		for(int i = 0; i<blocks.size(); i++){
			if(ball.didCollideRight(blocks.get(i)) == true)
			{
				//System.out.println("I'm colliding right");
				ball.setXSpeed(-ball.getXSpeed());
				blocks.remove(i);
			}
			else if(ball.didCollideLeft(blocks.get(i)) == true)
			{
				//System.out.println("I'm colliding left");
				ball.setXSpeed(-ball.getXSpeed());
				blocks.remove(i);
			}
			else if(ball.didCollideTop(blocks.get(i)) == true)
			{
				System.out.println("I'm colliding bottom");
				ball.setYSpeed(-ball.getYSpeed());
				blocks.remove(i);
			}
			else if(ball.didCollideBottom(blocks.get(i)) == true)
			{
				System.out.println("I'm colliding top");
				ball.setYSpeed(-ball.getYSpeed());
				blocks.remove(i);
			}
		}
	}
	}
