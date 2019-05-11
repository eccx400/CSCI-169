#include "Tomato.h"

Tomato::Tomato(): public Fruit, public Vegetable
{
	name = "";
}

Tomato::Tomato(time_t e, time_t r, string n): public Fruit(name, ripe), public Vegetable(expire)
{
	expire = e;
	ripe = r;
	name = n;

	cout << e.getClass() << endl;
	cout << r.getClass() << endl;
	cout << n.getClass() << endl;
}
