import java.util.*;

public class Apple extends Fruit
{
	public Apple()
	{
		name = "apple";
	}
	
	public Apple(Date r)
	{
		name = "apple";
		ripe = r;
	}
	
	public void prepare()
	{
		System.out.println("Core the " + name);
	}
}
