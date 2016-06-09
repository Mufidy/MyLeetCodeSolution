/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

package miaohf.leetcode.solutions;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcd";
		String b = "abdd";
		String c = "a";
		String[] strs = {a,b,c};
		System.out.println(longestCommonPrefix(strs));
	}
	
	public static String longestCommonPrefix(String[] strs){
		String result = "";
		int index = 0;
		if(strs.length==0)
			return result;
		while(true){
			char tmp;
			if(index<strs[0].length()){
				tmp = strs[0].charAt(index);
			}else{
				break;
			}			
			for(int i=1;i<strs.length;i++){
				String stmp = strs[i];
				if(index < stmp.length()){
					if(stmp.charAt(index)==tmp){
						
					}
					else{
						return result;
					}
				}else{
					return result;
				}
			}
			result += tmp;
			index++;
		}
		return result;
	}

}
