#include <Food.h>

Food::Food()
{
	name = "";
}

Food::Food(string n)
{
	name = n;
}

void Food::prepare()
{
	cout << name << endl;
}
