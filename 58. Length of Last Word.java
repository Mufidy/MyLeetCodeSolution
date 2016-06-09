/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 */

class Solution{
	public int lengthOfLastWord(String s){
		String a[] = s.split(" ");
		return a[a.length-1].length();
	}
}
public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello World";
		Solution ss = new Solution();
		System.out.println(ss.lengthOfLastWord(s));
	}

}
