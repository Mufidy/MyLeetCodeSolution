/*
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/

#include <iostream>
#include <string>
#include <math.h>
using namespace std;

class Solution {
public:
    int titleToNumber(string s) {
		int len = s.length();
		int total = 0;
		for (int i = 0; i < len; i++)
		{
			double t = pow(26,len-i-1);
			int m = (s[i]-64)*t;
			total += m;
				
		}
		return total;
    }
};

int main()
{
	Solution s;
	string str = "AAA";
	cout<<s.titleToNumber(str);
}
