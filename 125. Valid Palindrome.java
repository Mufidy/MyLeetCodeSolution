/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */

package miaohf.leetcode.solutions;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		String s1 = "race a car";
		System.out.println(isPalindrome(s1));
	}
	
	public static boolean isPalindrome(String s) {
        char c[] = s.toCharArray();
        int size = c.length;
        int i=0,j=size-1;
        while(i<j){
        	if(c[i]<'0'||(c[i]>'9'&&c[i]<'A')||(c[i]>'Z'&&c[i]<'a')||c[i]>'z'){
        		i++;
        		continue;
        	}
        	if(c[j]<'0'||(c[j]>'9'&&c[j]<'A')||(c[j]>'Z'&&c[j]<'a')||c[j]>'z'){
        		j--;
        		continue;
        	}
        	if(c[i]>='a'&&c[i]<='z'){
        		c[i] += ('A'-'a');
        	}
        	if(c[j]>='a'&&c[j]<='z'){
        		c[j] += ('A'-'a');
        	}
        	if(c[i++]!=c[j--]){
        		return false;
        	}
        }
        
        return true;
    }

}
