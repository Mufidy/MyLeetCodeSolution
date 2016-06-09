/*
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
*/

#include <iostream>
#include <vector>
using namespace std;

int findDuplicate(vector<int>& nums) 
{
	vector<int> n(nums.size(), 0);
	for (int i = 0; i < nums.size(); i++)
	{
		n[nums[i]]++;
		if (n[nums[i]] > 1)
			return nums[i];
	}
	return -1;
}

int main()
{
	vector<int> nums = { 1, 2, 3, 3, 4, 5, 6, 7 ,3};
	cout << findDuplicate(nums);
}