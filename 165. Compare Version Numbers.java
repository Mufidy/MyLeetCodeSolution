/*
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
*/

package miaohf.leetcode.solutions;

public class CompareVersionNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v1 = "3.2";
		String v2 = "3.10";
		String v3 = "12.11";
		String v4 = "2";
		System.out.println(compareVersion(v1,v2));
		System.out.println(compareVersion(v1,v3));
		System.out.println(compareVersion(v1,v4));
	}
	
	public static int compareVersion(String version1, String version2){
		String [] r1 = version1.split("\\.");
		String [] r2 = version2.split("\\.");
		
		int size1 = r1.length;
		int size2 = r2.length;
		int i = 0;
		while(i<size1 && i<size2){
			 if(Integer.parseInt(r1[i])>Integer.parseInt(r2[i])){
				 return 1;
			 }
			 if(Integer.parseInt(r1[i])<Integer.parseInt(r2[i]))
			 {
				 return -1;
			 }
			 i++;
		}
		if(size1<size2){
			while(i<size2){
				if(Integer.parseInt(r2[i])==0){
					i++;
				}else{
					return -1;
				}
			}
		}else if(size1>size2){
			while(i<size1){
				if(Integer.parseInt(r1[i])==0){
					i++;
				}else{
					return 1;
				}
			}
		}
		return 0;

	}

}
