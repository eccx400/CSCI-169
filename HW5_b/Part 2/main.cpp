#include <iostream>
#include <string>
#include <ctime>
#include "Food.h"
#include "Fruit.h"
#include "Apple.h"
#include "Orange.h"
#include "Vegetable.h"
#include "Tomato.h"

using namespace std;

int main()
{
	Tomato tot(2000000000, 1900000000, "Tomato");
	tot.ripeTime();
	tot.getName();
	tot.getDate();
	tot.expireTime();
}
