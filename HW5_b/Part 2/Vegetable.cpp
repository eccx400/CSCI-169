#include "Vegetable.h"

Vegetable::Vegetable(): Food()
{
	name = "";
}

Vegetable::Vegetable(time_t e, string n): Food(name)
{
	name = n;
	expiration = e;
}

time_t Vegetable::expireTime()
{
	return expiration;
}

string Vegetable::getName()
{
	return name;
}
