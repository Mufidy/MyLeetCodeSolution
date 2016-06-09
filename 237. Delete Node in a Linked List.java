/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems

*/

package miaohf.leetcode.solutions;

import miaohf.leetcode.definitions.ListNode;
import miaohf.leetcode.definitions.TestListNode;

public class DeleteNodeinaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestListNode t = new TestListNode();
		ListNode tmp = t.root.next.next.next;
		deleteNode(tmp);
		t.print();
		
	}
	
	public static void deleteNode(ListNode node){
		ListNode pre = node;	
		node = node.next;
		while(node!=null){
			if(node.next == null){
				pre.val = node.val;
				pre.next = null;
				return;
			}
			pre.val = node.val;
			pre = node;
			node = node.next;
		}
	}

}
