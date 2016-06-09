/*
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */

class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

class Solution{
	public ListNode deleteDuplicates(ListNode head){
		if(head==null){
			return null;
		}
		ListNode result = new ListNode(head.val-1);
		ListNode l1 = head;
		ListNode l2 = result;
		while(l1!=null){
			if(l1.val==l2.val){
				l2.next=null;//very important!!!!!
				l1=l1.next;
			}else{
				l2.next = l1;
				l2 = l2.next;
				l1 = l1.next;
			}
		}
		return result.next;
	}
}

public class RemoveDuplicatesfromSortedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		Solution s = new Solution();
		ListNode r = s.deleteDuplicates(head);
		System.out.print(r.val);
		while(r.next!=null){
			r = r.next;
			System.out.print("->"+r.val);
		}
	}	
}
