import java.util.*;
import java.lang.Integer;

class MainClass
{
	public static void main(String args[])
	{
		/**
		Date d = new Date(2000000000);
		Food gum = new Food("gum");
		Food las = new Food("lasagna");
		Fruit pom = new Fruit(d, "pomegranate");
		Fruit app = new Apple(d);
		Orange o = new Orange(d);
		Shrimp sh = new Shrimp();
		Seafood p = new Prawn();
		Seafood l = new Seafood("lobster");

		sh.prepare();
		app.prepare();
		pom.prepare();
		o.prepare();
		gum.prepare();
		p.prepare();
		l.prepare();
		las.prepare();
		las = app;
		las.prepare();

		o.ripeTime();
		pom.ripeTime();
		
		ArrayList<Object> a = new ArrayList<Object>(); //Input Arraylist
		ArrayList<Object> b = new ArrayList<Object>(); //Output Arraylist
		
		a.add("Food");
		a.add("Orange");
		a.add("Fruit");
		a.add("Papaya");
		a.add(new Integer(3932728));
		a.add("Apple");
		a.add("now");
		a.add("Food");
		a.add("sandwich");
		
		for(int i = 0; i < a.size(); i++)
		{
			if(a.get(i).equals("Food"))
			{	
				String s = a.get(i + 1).toString();
				Food foo = new Food(s);
				b.add(foo);
			}
			else if(a.get(i).equals("Fruit"))
			{
				String s = a.get(i + 1).toString();
				Integer num = (Integer) a.get(i + 2);

				Date time = new Date(num);
				Fruit fruit = new Fruit( time , s);
				b.add(fruit);
			}
			else if(a.get(i).equals("Apple") && (a.get(i + 1).toString() == "now"))
			{
				Date c = new Date();
				Apple apple = new Apple(c);
				b.add(apple);
			}
			else if(a.get(i).equals("Orange"))
			{
				Orange o = new Orange();
				b.add(o);
			}	
			else
			{
				continue;
			}
		}
		
		System.out.print("The Arraylist Output is: \n");
		for(Object j : b)
		{
				System.out.println(j.getClass() + " ");
		}
		*/
		
		Date d = new Date(2000000000);
		Date e = new Date(1980000000);
		Date f = new Date(2134000000);
		Date g = new Date(1024000000);
		
		Fruit pin = new Fruit(d, "Pineapple");
		Fruit ban = new Fruit(e, "Banana");
		Fruit app = new Fruit(f, "Apple");
		Fruit ora = new Fruit(g, "Orange");
		
		ArrayList<Fruit> a = new ArrayList<Fruit>();
		a.add(pin);
		a.add(ban);
		a.add(app);
		a.add(ora);
		
		System.out.print("The Arraylist Output is: \n");
		for(Object i : a)
		{
				System.out.println(((Fruit) i).getName() + " " + ((Fruit) i).getDate());
		}
	
		Collections.sort(a);
		System.out.println("\n");
		
		System.out.print("The Arraylist Output is: \n");
		for(Object k : a)
		{
				System.out.println(((Fruit) k).getName() + " " + ((Fruit) k).getDate());
		}
		
	}
}

