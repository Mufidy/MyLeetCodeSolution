/*
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

Update (2014-11-10):
Test cases had been added to test the overflow behavior.
 */

class Solution {
    public int reverse(int x) {
    	if(x==0 || x==-2147483648){
    		return 0;
    	}//special case;
    	int symbol = 1;
    	int r = 0;
    	int[] arr = new int[10];
    	int i = 0;
    	if(x<0){
    		symbol = -1;
    		x = -x;
    	}
    	while(x%10==0){
    		x = x/10;
    	}
    	while(x!=0){
    		arr[i]=x%10;
    		x = x/10;
    		i++;
    	}
//    	int result = 0;
//    	for(int j=0;j<i;j++){
//    		result += arr[j] * Math.pow(10, i-j-1);
//    	}
    	//next handle with overflow
    	double result = 0.0;
    	for(int j=0;j<i;j++){
    		result += arr[j] * Math.pow(10, i-j-1);
    	}
    	if(result>2147483647.0||result<-2147483647.0){
    		return 0;
    	}else{
    		r = (int)result;
    	}
    	
    	return r*symbol;
    }
}

public class ReverseInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int x = -2147483648;
		int i = s.reverse(x);
		System.out.println(i);
	}
}
