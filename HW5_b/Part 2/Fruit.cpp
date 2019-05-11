#include "Fruit.h"

Fruit::Fruit(): Food()
{
	name = "";
}

Fruit::Fruit(time_t r, string n): Food(name)
{
	name = n;
	ripe = r;
}

void Fruit::prepare()
{
	cout << "You can eat it on: " << ripe << endl;
}

string Fruit::getName()
{
	return name;
}

time_t Fruit::getDate()
{
	return ripe;
}
