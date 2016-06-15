//
//  main.cpp
//  leetcode
//
//  Created by MiaoHaifei on 16/6/15.
//  Copyright © 2016年 MiaoHaifei. All rights reserved.
//

/*
 268. Missing Number
 Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 
 For example,
 Given nums = [0, 1, 3] return 2.
 
 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
 

#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // using sum = n*(n+1)/2 to find missing number
        int max = 0;
        int sum = 0;
        for (int i=0; i<nums.size(); i++) {
            if (nums[i]>max) {
                max = nums[i];
            }
            sum+=nums[i];
        }
        int actSum = max*(max+1)/2;
        int diff = actSum - sum;
        if (diff == 0 ) {
            if (max==nums.size()) {
                return 0;
            }
            return max+1;
        }
        return diff;
    }
};

int main(int argc, const char * argv[]) {
    // insert code here...
    //vector<int> nums = {0,1,3,4,2,5,8,7};
    vector<int> nums ={1};
    Solution s;
    cout<<s.missingNumber(nums)<<endl;
    return 0;
}
