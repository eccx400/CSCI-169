import java.util.*;

public class Fruit extends Food implements Comparable<Fruit>
{
	public Date ripe;
	
	public Fruit()
	{
		name = "";
	}
	
	public Fruit( Date r, String n)
	{
		name = n;
		ripe = r;
	}
	
	public void ripeTime()
	{
		System.out.println("You can eat it on " + ripe);
	}
	
	public String getName()
	{
		return name;
	}
	
	public Date getDate()
	{
		return ripe;
	}

	@Override
	public int compareTo(Fruit a) 
	{
		return this.getDate().compareTo(a.getDate());
	}
}