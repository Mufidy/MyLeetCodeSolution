/*
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer
*/

#include <iostream>
#include <stdint.h>
using namespace std;

class Solution {
public:
	uint32_t reverseBits(uint32_t n) {
        uint32_t result = 0;
		uint32_t tmp = 0;
		for (int i = 0; i < 32; i++)
		{
			tmp = n&1;//last bit
			n/=2;
			result*=2;
			if (tmp)
			{
				result++;
			}
		}
		return result;
	}
};

int main()
{
	uint32_t n = 43261596;
	Solution s;
	cout<<s.reverseBits(n);
}
