//
//  main.cpp
//  1. Two Sum
//
//  Created by WangLu on 16/6/18.
//  Copyright © 2016年 MiaoHaifei. All rights reserved.
//

/*
 1. Two Sum
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 
 You may assume that each input would have exactly one solution.
 
 Example:
 Given nums = [2, 7, 11, 15], target = 9,
 
 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 UPDATE (2016/2/13):
 The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */

#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> numsPos;
        vector<int> result;
        for (int i=0; i<nums.size(); i++) {
            unordered_map<int, int>::iterator it = numsPos.find(target-nums[i]);
            if (it==numsPos.end()) {
                numsPos[nums[i]]=i;
            }else{
                int index = it->second;
                result.push_back(index);
                result.push_back(i);
                return result;
            }
        }
        return result;
    }
};

int main(int argc, const char * argv[]) {
    // insert code here...
    Solution s;
    vector<int> nums = {2,7,11,15};
    int target = 9;
    vector<int> result = s.twoSum(nums, target);
    cout<<"Result:"<<endl;
    for (int i=0; i<result.size(); i++) {
        cout<<result[i]<<endl;
    }
    return 0;
}
