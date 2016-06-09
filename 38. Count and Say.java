/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
*/

class Solution {
	public String countAndSay(int n){
		if(n==1){
			return "1";
		}
		String str = "1";
		for(int i=1;i<n;i++){
			char[] s = str.toCharArray();
			if(s.length==1){
				str = "1"+s[0];
				s = null;
			}else{
				int j = 1;
				char tmp = s[0];
				int count = 1;
				String stmp = "";
				while (j<s.length){
					if(s[j]==tmp){
						count++;
						if(j==s.length-1){
							stmp += count;
							stmp += tmp;
						}
						j++;
					}else{
						stmp += count;
						stmp += tmp;
						tmp = s[j];
						count = 1;
						if(j==s.length-1){
							stmp += count;
							stmp += tmp;
						}
						j++;
					}
				}
				str = stmp;
				s = null;
			}			
		}
		return str;
	}
}

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.countAndSay(5));
	}

}
