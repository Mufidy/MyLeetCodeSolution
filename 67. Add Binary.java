/*
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
*/

package miaohf.leetcode.solutions;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "10011";
		String b = "110";
		String a1 = "1111";
		String b1 = "1111";
		System.out.println(addBinary(a1,b1));
	}
	
	public static String addBinary(String a, String b){
		String result = "";
		if(a.length()<b.length()){
			String tmp = a;
			a = b;
			b = tmp;
		}//a is longer than b (a>=b)
		
		int asize = a.length();
		int bsize = b.length();
		int carry = 0;
		for(int i=bsize-1;i>=0;i--){
			int atmp = a.charAt(asize-bsize+i)-'0';
			int btmp = b.charAt(i)-'0';
			int rtmp = atmp + btmp + carry;
			if(rtmp>1){
				carry = 1;
				rtmp -= 2;
			}else{
				carry = 0;
			}
			String stmp = rtmp + result;
			result = stmp;
		}

		for(int i=asize-bsize-1;i>=0;i--){
			int rtmp = a.charAt(i)-'0' + carry;
			if(rtmp>1){
				carry = 1;
				rtmp = 0;
			}else{
				carry = 0;
			}
			String stmp = rtmp + result;
			result = stmp;
		}
		
		if(carry == 1){
			String stmp = 1 + result;
			result = stmp;
		}
		
		return result;
	}
}
