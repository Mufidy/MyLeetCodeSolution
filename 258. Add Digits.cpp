/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/

#include <iostream>
using namespace std;

int addDigits(int num)
{
	/*dr(n)= {if n=0,return 0;if n!=0,n%9=0, return 9;else return n%9}*/
	/*
	if (num == 0)
		return 0;
	int result = num % 9;
	if (result == 0)
		return 9;
	return result;
	*/
	/*second approach; dr(n)=1+(n-1)%9*/
	return 1 + (num - 1) % 9;
}

int main()
{
	int n = 38;
	cout << addDigits(n);
}