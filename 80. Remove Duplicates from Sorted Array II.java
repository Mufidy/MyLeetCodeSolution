/*
 * Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 */

class Solution {
    public int removeDuplicates(int[] A) {
    	int i=1;
    	int count = 1;
    	if(A.length==0){
    		i=0;
    	}
    	else if(A.length==1){
    	}
    	else{
	    	for(int j=1;j<A.length;j++){
	    		if(A[j]!=A[j-1]){
	    			count = 1;
	    			A[i]=A[j];
	    			i++;
	    			count = 1;
	    		}else{
	    			if(count<2){
	    				A[i]=A[j];
		    			i++;
		    			count ++;
	    			}			
	    		}
	    	}
    	}
        return i;
    }
}

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,1,1,2,2,3};
		Solution s = new Solution();
		System.out.println(s.removeDuplicates(A));
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]+" ");
		}		
	}

}
