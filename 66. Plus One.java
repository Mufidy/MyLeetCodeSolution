/*Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int result[] = new int[digits.length];
        int j=digits.length-2;
        int carry = 0;
        int t = digits[digits.length-1]+1;
        if(t>=10){
        	carry = 1;
        	result[digits.length-1] = t%10;
        }else{
        	result[digits.length-1] = t;
        }
        for(int i=digits.length-2;i>=0;i--){
        	int val = digits[i]+carry;
        	if(val>=10){
        		carry = 1;
        		val %= 10;
        	}else{
        		carry = 0;
        	}
        	result[j] = val;
        	j--;
        }
        if(carry == 0){
        	return result;
        }else{
        	int[] result2 = new int[digits.length+1];
        	result2[0] = 1;
        	for(int i=0;i<digits.length;i++){
        		result2[i+1] = result[i];        		
        	}
        	return result2;
        }        
    }
}

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int digits[] = {2,1,3,2,5};
		int r[] = s.plusOne(digits);
		for(int i=0;i<r.length;i++){
			System.out.print(r[i]+"->");
		}
	}

}
