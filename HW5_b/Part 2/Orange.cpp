#include "Orange.h"

Orange::Orange(): Fruit()
{
	name = "orange";
}

Orange::Orange(time_t r, string n): Food(name), Fruit(ripe)
{
	name = n;
	ripe = r;
}

void Orange::prepare()
{
	cout << "Peel the " << name << endl;
}
