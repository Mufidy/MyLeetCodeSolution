/*
Write a function that takes an unsigned integer and returns the number of ¡¯1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011, so the function should return 3.
*/

#include <iostream>
#include <stdint.h>

using namespace std;

class Solution
{
public:
	int hammingWeight(uint32_t n)
	{
		int count = 0;
		int a[32];
		
		while (n!=0)
		{
			if (n%2==1)
			{
				count++;
				n --;
			}else
			{
				n=n/2;
			}			
		}
		return count;
	}

};

int main()
{
	Solution s;
	uint32_t n = 11;
	int x = s.hammingWeight(n);
	cout<<x;
	return 1;
}