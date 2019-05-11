#ifndef FRUIT_H
#define FRUIT_H
#include "Food.h"
#include <iostream>
#include <string>
#include <ctime>
#include "Food.h"

using namespace std;

class Fruit: class Food
{
public:
	time_t ripe;

	public Fruit();
	public Fruit(time_t r, string n);

	void ripeTime();
	string getName();
	time_t getDate();
}
