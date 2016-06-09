/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
*/

#include <iostream>
#include <string>
#include <vector>
using namespace std;

string reverseVowels(string s) 
{
	char vow[10] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
	int length = s.length();
	vector<int> indexs;
	vector<char> vowels;
	for (int i = 0; i < length; i++)
	{
		bool isVowel = false;
		for (int j = 0; j < 10; j++)
			if (s[i] == vow[j])
				isVowel = true;
		if (!isVowel)
			continue;
		indexs.push_back(i);
		vowels.push_back(s[i]);		
	}
	int indexLen = indexs.size();
	for (int i = 0; i < indexLen / 2; i++)
	{
		char tmp = s[indexs[i]];
		s[indexs[i]] = s[indexs[indexLen - 1 - i]];
		s[indexs[indexLen - 1 - i]] = tmp;
	}
	return s;
}

int main()
{
	string s = "leetcode";
	string s1 = "aA";
	cout << reverseVowels(s1);
}