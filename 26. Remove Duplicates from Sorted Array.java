/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */

class Solution {
    public int removeDuplicates(int[] A) {
    	int i=1;
    	if(A.length==0){
    		i=0;
    	}
    	else if(A.length==1){
    	}
    	else{
	    	for(int j=1;j<A.length;j++){
	    		if(A[j]!=A[j-1]){
	    			A[i]=A[j];
	    			i++;
	    		}
	    	}
    	}
        return i;
    }
}

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,4,4,5};
		Solution s = new Solution();
		System.out.println(s.removeDuplicates(A));
	}

}
