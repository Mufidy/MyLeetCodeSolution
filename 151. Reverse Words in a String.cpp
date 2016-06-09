/*
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Update (2015-02-12):
For C programmers: Try to solve it in-place in O(1) space.
*/

#include <iostream>
#include <string>
using namespace std;

void reverseWords(string &s)
{
	string result;
	string tmp;
	int length = s.length();
	int i=0;
	while (s[i]==' ')
	{
		i++;
	}
	while (s[length-1]==' ')
	{
		length --;
	}
	for (; i < length; i++)
	{
		if (s[i]!=' ')
		{
			tmp += s[i];
		}else
		{
			result = tmp +" "+ result;
			tmp = "";
			while (s[i]==' ')
			{
				i++;
			}
			i--;
		}
		if (i==length-1)
		{
			result = tmp +" "+ result;
		}
	}
	s = result.substr(0,result.length()-1);
}

int main()
{
	string s = "  the sky    is blue  ";
	reverseWords(s);
	cout<<s;
}
