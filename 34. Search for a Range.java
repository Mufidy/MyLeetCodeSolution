/*
 * Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */

package miaohf.leetcode.solutions;

public class SearchforaRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 7, 7, 8, 8, 10};
		int[] nums2 = {2,2};
		SearchforaRange s = new SearchforaRange();
		int[] r = s.searchRange(nums2, 2);
		System.out.println(r[0]+"  "+r[1]);
	}
	
	public int[] searchRange(int[] nums, int target){
		int[] result = {nums.length,-1};
		int left = 0, right = nums.length-1;
		if(nums.length==0){
			result[0] = -1;
			return result;
		}
		if(nums.length==1 && nums[0]==target){
			result[0]=result[1]=0;
			return result;
		}
			
		while(left != right){
			int mid = left + (right-left)/2;
			if(nums[mid] < target){
				left = mid + 1;
			}else if(nums[mid] > target){
				right = mid;
			}else{
				if(mid < result[0]){
					result[0] = mid;
					right = mid;
				}					
			}
		}
		if(nums[left]==target){
			result[0] = left;
		}
		left = 0;
		right = nums.length-1;
		while(left != right){
			int mid = left + (right-left)/2;
			if(nums[mid] < target){
				left = mid + 1;
			}else if(nums[mid] > target){
				right = mid;
			}else{
				if(mid > result[1]){
					result[1] = mid;
					left = mid+1;
				}					
			}
		}
		if(nums[right]==target){
			result[1] = right;
		}
		if(result[0]==nums.length)
			result[0] = -1;
		return result;
	}
	


}