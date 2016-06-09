/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
*/

package miaohf.leetcode.solutions;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstBadVersion f = new FirstBadVersion();
		System.out.println(f.firstBadVersion(2126753390));
	}
	
	public int firstBadVersion(int n){
		return this.find(1,n);
	}
	
	public int find(int left,int right){
		if(left==right)
			return left;
		int mid = left+(right-left)/2;
		if(this.isBadVersion(mid)){
			return find(left,mid);
		}
		return find(mid+1,right);
	}
	
	public boolean isBadVersion(int version){
		if(version >= 1702766719){
			return true;
		}
		return false;
	}

}
