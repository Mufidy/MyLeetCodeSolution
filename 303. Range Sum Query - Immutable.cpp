/*
Given an integer array nums, find the sum of the elements between indices i and j (i ¡Ü j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
*/

#include <iostream>
#include <vector>
using namespace std;

class NumArray 
{
public:
	vector<int> sum;

	NumArray(vector<int> &nums) 
	{
		int tmp = 0;
		for (int i = 0; i < nums.size(); i++)
		{
			tmp += nums.at(i);
			sum.push_back(tmp);
		}
	}

	int sumRange(int i, int j) 
	{
		if (i == 0)
		{
			return sum.at(j);
		}
		else
		{
			return sum.at(j) - sum.at(i-1);
		}
		
	}
};

int main()
{
	vector <int> nums = { -2, 0, 3, -5, 2, -1 };
	NumArray na(nums);
	cout << na.sumRange(0, 2) << endl;
	cout << na.sumRange(2, 5) << endl;
	cout << na.sumRange(1, 2) << endl;
}