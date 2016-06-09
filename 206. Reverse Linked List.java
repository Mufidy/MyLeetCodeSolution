/*
 * Reverse a singly linked list.

click to show more hints.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
    	ListNode result = null;
        ListNode cur = head;
        while(cur!=null){
        	ListNode tmp = new ListNode(cur.val);
        	tmp.next = result;
        	result = tmp;
        	cur = cur.next;
        }        
        return result;
    }
}

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		Solution s = new Solution();
		ListNode r = s.reverseList(head);
		System.out.print(r.val);
		while(r.next!=null){
			r = r.next;
			System.out.print("->"+r.val);
		}
	}

}
