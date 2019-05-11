#ifndef VEGETABLE_H
#define VEGETABLE_H
#include <iostream>
#include <string>
#include <ctime>
#include "Food.h"

using namespace std;

class Vegetable: public Food
{
public:
	time_t expiration;	

	Vegetable();
	Vegetable(time_t e, string n);

	string getName();
	time_t expireTime();
}
