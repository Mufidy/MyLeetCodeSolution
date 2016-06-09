/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

#include <iostream>
#include <vector>
using namespace std;

void moveZeroes(vector<int>& nums)
{
    int nonezero = 0;
    int len = nums.size();
    for (int i = 0; i < len; i++)
    {
        if (nums.at(i))
        {
            nums.at(nonezero) = nums.at(i);
            nonezero++;
        }
    }
    for (int i = nonezero; i < len; i++)
    {
        nums.at(i) = 0;
    }
}

int main()
{
    vector<int> nums = { 0, 1, 0, 3, 12};
    moveZeroes(nums);
    for (int i = 0; i < nums.size(); i++)
    {
        cout << nums.at(i) << endl;
    }
}