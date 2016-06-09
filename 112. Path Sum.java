/*
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example
Given the below binary tree and sum = 22,
              5
              
            4   8
               
          11  13  4
                 
        7    2      1
return true, as there exist a root-to-leaf path 5-4-11-2 which sum is 22.
 */

package miaohf.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import miaohf.leetcode.definitions.TreeNode;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode t1 = new TreeNode(4);
		TreeNode t2 = new TreeNode(8);
		TreeNode t3 = new TreeNode(11);
		TreeNode t4 = new TreeNode(13);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(7);
		TreeNode t7 = new TreeNode(2);
		TreeNode t8 = new TreeNode(5);
		TreeNode t9 = new TreeNode(1);
		root.left = t1;
		root.right=t2;
		t1.left=t3;
		t2.left=t4;t2.right=t5;
		t3.left=t6;t3.right=t7;
		t5.left=t8;t5.right=t9;
		List<List<Integer>> r = hasPathSumII(root,5);
		for(int i=0;i<r.size();i++){
			List<Integer> t = r.get(i);
			for(int j=0;j<t.size();j++){
				System.out.print(t.get(j)+"  ");
			}
			System.out.print("\n");
		}
	}
	
	public static boolean hasPathSum(TreeNode root, int sum) {
		if(root==null)
			return false;
		if(root.left==null && root.right==null && root.val==sum)
			return true;
		return hasPathSum(root.left,sum - root.val)||hasPathSum(root.right,sum - root.val);
	}
	
	public static List<List<Integer>> hasPathSumII(TreeNode root, int sum) {
		final int left = 1;
		final int right = 2;
		final int leftEmpty = 3;
		final int rightEmpty = 4;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		List<Integer> tmp = new ArrayList<Integer>();
		Stack<Integer> flag = new Stack<Integer>();
		if(root==null)
			return result;
		int tmpSum = 0;
		int count = 0;
		TreeNode tmpNode = null;
		nodeStack.push(root);
		flag.push(0);
		while(!nodeStack.isEmpty()){
			tmpNode = nodeStack.peek();
			int lr = flag.peek();
			tmpSum += tmpNode.val;
			tmp.add(tmpNode.val);
			count++;
			nodeStack.pop();
			flag.pop();
			System.out.print(tmpNode.val+"  "+tmpSum+" \n");
			if(tmpNode.left==null && tmpNode.right==null){
				if(tmpSum == sum && lr!= rightEmpty && lr != leftEmpty){
					List <Integer> iList = new ArrayList<Integer>();
					for(int i=0;i<count;i++){
						iList.add(tmp.get(i));
					}
					result.add(iList);
				}
				if(lr==left || lr==leftEmpty){
					tmpSum -= tmp.get(--count);
					tmp.remove(count);
				}else if(lr==right || lr==rightEmpty){
					tmpSum -= tmp.get(--count);
					tmp.remove(count);
					tmpSum -= tmp.get(--count);
					tmp.remove(count);					
				}
				continue;
			}
			if(tmpNode.right!=null){
				nodeStack.push(tmpNode.right);
				flag.push(right);
			}else{
				nodeStack.push(new TreeNode(0));
				flag.push(rightEmpty);
			}
			
			if(tmpNode.left!=null){
				nodeStack.push(tmpNode.left);
				flag.push(left);
			}else{
				nodeStack.push(new TreeNode(0));
				flag.push(leftEmpty);
			}
		}
		
		return result;
	}

}
