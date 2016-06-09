/*
 * Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
 */

package miaohf.leetcode.solutions;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(5));
		System.out.println(isPalindrome(10));
		System.out.println(isPalindrome(19191));
		System.out.println(isPalindrome(20442));
		System.out.println(isPalindrome(1000021));
	}
	
	public static boolean isPalindrome(int x){
		if(x<0){
			return false;
		}
		int size = 0;
		int xx = x;
		while(xx!=0){
			xx/=10;
			size++;
		}
		for(int i=0;i<size;i+=2){
			if(x%10!=x/(int)Math.pow(10, size-i-1))
				return false;
			x%=Math.pow(10, size-i-1);
			x/=10;
		}
		return true;
	}

}
