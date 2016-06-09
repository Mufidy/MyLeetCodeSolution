/*
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */

package miaohf.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = generate(5);
		for(int i=0;i<list.size();i++){
			List<Integer> a = list.get(i);
			System.out.print("[");
			for(int j=0;j<a.size();j++){
				System.out.print(a.get(j)+" ");
			}
			System.out.println("] ");
		}
		
		List<Integer> l = getRow(1);
		for(int j=0;j<l.size();j++){
			System.out.print(l.get(j)+" ");
		}
	}
	
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(numRows<1){
			return result;
		}
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		result.add(l1);
		for(int i=1;i<numRows;i++){
			List<Integer> li = new ArrayList<Integer>();
			li.add(1);
			List<Integer> ltmp = result.get(i-1);
			for(int j=1;j<i;j++){
				li.add(ltmp.get(j-1)+ltmp.get(j));
			}
			li.add(1);
			result.add(li);
		}
		return result;
	}
	
	public static List<Integer> getRow(int rowIndex){
		rowIndex++;
		List<Integer> result = new ArrayList<Integer>();
		if(rowIndex<0)
			return result;
		result.add(1);
		for(int i=1;i<rowIndex;i++){
			int last = result.get(0);
			for(int j=1;j<i;j++){
				int tmp = result.get(j);
				result.set(j, result.get(j)+last);
				last = tmp;
			}
			result.add(1);
		}
		return result;
	}

}
