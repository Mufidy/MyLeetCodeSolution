/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
*/
#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
	string convertToTitle(int n) {

		string result = "";
		while (n != 0)
		{
			char c = 'A';
			int t = n % 26;
			if (t == 0)
			{
				t = 26;
				n = n - 26;
			}
			c += t - 1;
			n = n / 26;
			string tmp = c + result;
			result = tmp;
		}
		return result;
	}
};


int main()
{
	Solution s;
	cout<<s.convertToTitle(26)<<endl;//AZ(Z)
	cout<<s.convertToTitle(27)<<endl;//AA~
	cout<<s.convertToTitle(52)<<endl;//BZ(AZ)
	cout<<s.convertToTitle(702)<<endl;//AAZ(ZZ)
	cout<<s.convertToTitle(703)<<endl;//AAA~
	cout<<s.convertToTitle(677)<<endl;//AZA(ZA)
}
