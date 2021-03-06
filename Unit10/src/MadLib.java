//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		this();
		loadVerbs();
		loadNouns();
		loadAdjectives();
		
		try{
			
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext())
			{
				String thing = file.next();
				if(thing.equals("#"))
				{
					out.print( getRandomNoun() + " ");
				}
				else if(thing.equals("@"))
				{
					out.print( getRandomVerb() + " ");
				}
				else if(thing.equals("&"))
				{
					out.print( getRandomAdjective() + " ");
				}
				else
				{
					out.print(thing + " ");
				}
			}
	
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try
		{
			Scanner nounList = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while (nounList.hasNext())
				{
					nouns.add(nounList.next());
				}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem! Nouns");
		}	
		
	}
	
	public void loadVerbs()
	{
		try
		{
			Scanner verbList = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while (verbList.hasNext())
				{
					verbs.add(verbList.next());
				}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem! Verbs");
		}	
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner adjList = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while (adjList.hasNext())
				{
				adjectives.add(adjList.next());
				}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem! Adject");
		}
	}

	public String getRandomVerb()
	{
		String randomVerb = verbs.get((int)(Math.random() * verbs.size()));
		return randomVerb;
	}
	
	public String getRandomNoun()
	{
		String randomNoun = nouns.get((int)(Math.random() * nouns.size()));
		return randomNoun;
	}
	
	public String getRandomAdjective()
	{
		String randomAdj = adjectives.get((int)(Math.random() * adjectives.size()));
		return randomAdj;
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}