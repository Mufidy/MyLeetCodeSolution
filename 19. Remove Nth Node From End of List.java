/*
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head.next==null){
    		return null;
    	}
        ListNode result = head;
        ListNode front = result;
        ListNode back = result; 
        for(int i=0;i<n;i++){
        	front = front.next;
        }
        if(front==null){
        	return head.next;
        }
        while(front.next!=null){
        	front = front.next;
            back = back.next; 	
        }
        //System.out.print(back.val);
        ListNode tmp = back;
        tmp = tmp.next;
        tmp = tmp.next;
        back.next = tmp;
    	return result;
    }
}
public class RemoveNthNodeFromEndofList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		Solution s = new Solution();
		ListNode r = s.removeNthFromEnd(head, 5);
		System.out.print(r.val);
		while(r.next!=null){
			r = r.next;
			System.out.print("->"+r.val);
		}
	}
}
