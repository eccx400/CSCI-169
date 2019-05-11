import java.util.*;

public class Food
{
	public String name;
	
	public Food()
	{
		name = "";
	}
	
	public Food(String n)
	{
		name = n;
	}
	
	public void prepare()
	{
		System.out.println("Prepare the " + name);
	}
}
