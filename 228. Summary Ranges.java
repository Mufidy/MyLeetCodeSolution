/*
 * Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */

package miaohf.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public static void main(String[] args){
		int [] nums = {0,1,2,4,6,8,9,10};
		List<String> x = summaryRanges(nums);
		for(int i = 0;i<x.size();i++){
			System.out.println(x.get(i));
		}
	}
	
	public static List<String> summaryRanges(int[] nums){
		ArrayList<String> result = new ArrayList<String>();
		if(nums.length==0)
			return result;
		if(nums.length==1){
			result.add(nums[0]+"");
			return result;
		}
		int now = nums[0];
		int step = 1;
		for(int i=1;i<nums.length;i++){
			if(nums[i] - step == now){
				step++;				
			}else{
				String tmp = null;
				if(step == 1){
					tmp = nums[i-1]+"";
				}else{
					tmp = now + "->" + nums[i-1];
				}				
				result.add(tmp);								
				now = nums[i];
				step = 1;
			}
			if(i==nums.length-1){				
				String tmp = null;
				if(step == 1){
					tmp = nums[i]+"";
				}else{
					tmp = now + "->" + nums[i];
				}				
				result.add(tmp);
			}				
		}		
		return result;
	}
}
