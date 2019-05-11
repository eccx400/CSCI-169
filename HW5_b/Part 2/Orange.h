#ifndef ORANGE_H
#define ORANGE_H
#include <iostream>
#include <string>
#include <ctime>
#include "Fruit.h"

using namespace std;

class Orange: public Fruit
{
	public Orange();
	public Orange(time_t r, string n);

	void prepare();
}
