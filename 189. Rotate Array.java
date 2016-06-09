package miaohf.leetcode.solutions;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2};
		rotate(nums,3);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]+"  ");
		}

		int[] nums2 = new int[12000];
		for(int i=0;i<12000;i++){
			nums2[i] = i+1;
		}
//		rotate(nums2,11939);
//		for(int i=0;i<nums2.length;i++){
//			System.out.println(nums2[i]+"  ");
//		}
	}

	public static void rotate(int[] nums, int k){
		// method 1
//		for(int i=0;i<k;i++){
//			int tmp = nums[nums.length-1];
//			for(int j=nums.length-1;j>0;j--){
//				nums[j]=nums[j-1];
//			}
//			nums[0] = tmp;
//		}
		
		//method 2
		if(k>=nums.length)
			k = k-nums.length;
		int tmp[] = new int[k];
		for(int i=0;i<k;i++){
			tmp[i] = nums[nums.length-k+i];
		}
		for(int i=nums.length-1;i>=k;i--){
			nums[i]=nums[i-k];
		}
		for(int i=0;i<k;i++){
			nums[i] = tmp[i];
		}
	}
	
}
