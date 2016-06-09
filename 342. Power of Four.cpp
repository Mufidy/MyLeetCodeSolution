/*
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?*/

#include <iostream>
using namespace std;

bool isPowerOfFour(int num) 
{
	/*if (num == 0)
		return false;
	while (num%4==0)
	{
		num /= 4;
	}
	if (num == 1)
		return true;
	return false;*/

	// without loop
	// check only one 1 is set
	if ((num&(num - 1)) != 0)
		return false;
	// no 2,8,32...
	if (num & 0x55555555)
		return true;
	return false;
}

int main()
{
	cout << isPowerOfFour(16) << endl;
	cout << isPowerOfFour(5) << endl;
	cout << isPowerOfFour(-242) << endl;

}