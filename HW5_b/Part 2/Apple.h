#ifndef APPLE_H
#define APPLE_H
#include <iostream>
#include <string>
#include <ctime>
#include "Fruit.h"

using namespace std;

class Apple: public Fruit
{
public:

	Apple();
	Apple(time_t r);
	void prepare();
}
