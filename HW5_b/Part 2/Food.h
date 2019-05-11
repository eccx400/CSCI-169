#ifndef FOOD_H
#define FOOD_H
#include <iostream>
#include <string>
#include <ctime>

using namespace std;

class Food
{
public:
	string name;

	Food();
	Food(string n);
	void prepare();
}

