/*
Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.

Credits:
Special thanks to @amrsaqr for adding this problem and creating all test cases.

Subscribe to see which companies asked this question
*/

#include <iostream>
using namespace std;

int RangeBitwiseAnd(int m, int n) 
{
	if (m==0)
	{
		return 0;
	}
      int max = m^n;
	  int result = -1;
	  while (max!=0 )
	  {
		  result *= 2;
		  max /= 2;
	  }
	  return result&m;
}

int main()
{
	int n = 0,m=0;
	while (cin>>m>>n)
	{
		cout<<RangeBitwiseAnd(m,n);
	}
	return 0;
}
