/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

Subscribe to see which companies asked this question
*/
#include <iostream>
#include <string>
using namespace std;

string reverseString(string s) 
{
	int len = s.length();
	for (int i = 0; i < len/2; i++)
	{
		char temp = s[i];
		s[i] = s[len-1-i];
		s[len - 1 - i] = temp;
	}
	return s;
}

int main()
{
	string s = "Hello";
	cout << reverseString(s);
}