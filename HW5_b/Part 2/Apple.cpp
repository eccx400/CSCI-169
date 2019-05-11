#include "Apple.h"

Apple::Apple(): Fruit()
{
	name = "apple";
}

Apple::Apple(time_t r): Fruit(ripe), Food(name)
{
	name = "apple";
	ripe = r;
}

void Apple::prepare()
{
	cout << "Core the " << name << endl;
}
