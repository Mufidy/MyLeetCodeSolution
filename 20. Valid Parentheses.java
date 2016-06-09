/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

package miaohf.leetcode.solutions;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid(")]"));
	}
	
	public static boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length();i++){
			char c = s.charAt(i);
			if(c=='('||c=='{'||c=='[')
				stack.push(c);
			else if(stack.isEmpty()){
				return false;
			}else{
				if(c==')'){
					if(stack.peek()=='(')
						stack.pop();
					else
						return false;
				}else if(c=='}'){
					if(stack.peek()=='{')
						stack.pop();
					else
						return false;
				}else if(c==']'){
					if(stack.peek()=='[')
						stack.pop();
					else
						return false;
				}
			}				
		}
		if(!stack.isEmpty())
			return false;
		return true;
	}

}
