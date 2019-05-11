#ifndef TOMATO_H
#define TOMATO_H
#include <iostream>
#include <string>
#include <ctime>
#include "Fruit.h"
#include "Vegetable.h"

using namespace std;

class Tomato: public Fruit, public Vegetable
{
	Tomato();
	Tomato(time_t e, time_t r, string n);
}
