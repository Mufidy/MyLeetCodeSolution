/*
 * Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

 */

package miaohf.leetcode.solutions;

import java.util.Stack;

import miaohf.leetcode.definitions.TreeNode;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(7);
		TreeNode t3 = new TreeNode(1);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(6);
		TreeNode t6 = new TreeNode(9);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		TreeNode t = invertTree(root);
		System.out.println(t.right.right.val);
	}
	
	public static TreeNode invertTree(TreeNode root){
		if(root == null){
			return null;
		}
		TreeNode result = root;
		TreeNode now ;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			now = s.peek();
			s.pop();
			if(now.left != null || now.right != null){
				TreeNode tmp = now.left;
				now.left = now.right;
				now.right = tmp;
			}
			if(now.left != null){
				s.push(now.left);
			}
			if(now.right != null){
				s.push(now.right);
			}
		}
		return result;
	}

}
