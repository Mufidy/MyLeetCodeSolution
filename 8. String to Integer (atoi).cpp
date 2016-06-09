/*
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

Update (2015-02-10):
The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.
*/

#include <iostream>
#include <string>
using namespace std;

int myAtoi(string str)
{
	/*int result = 0;
	int flag = 0;
	int flagCount = 0;
	int i = 0;
	while (str[i]=='-'||str[i]=='+')
	{
		if (str[i] == '+')
		{
			flag++;
		}
		else
		{
			flag--;
		}
		flagCount++;
		if (flagCount > 1)
			return 0;
		i++;
	}
	for (; i < str.length(); i++)
	{
		char tmp = str[i];
		if (tmp>='0'&&tmp<='9')
		{
			result *= 10;
			result += tmp-'0';
		}
	}
	return flag>=0 ? result : -result;*/
}

int main()
{
	string s;
	while (cin>>s)
	{
		cout<<myAtoi(s)<<endl;
	}
}
