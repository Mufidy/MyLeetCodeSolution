/*
 * Given a binary tree, find its maximum depth.

 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

package miaohf.leetcode.solutions;

import miaohf.leetcode.definitions.TreeNode;

public class MaximumDepthofBinaryTree {

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
		System.out.println(maxDepth(root));//expected 4
	}

	public static int maxDepth(TreeNode root){
		if(root == null)
			return 0;		
		return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
	}
}
