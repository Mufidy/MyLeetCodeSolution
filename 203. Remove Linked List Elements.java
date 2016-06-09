/*
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0);
        ListNode t = result;
        ListNode cur = head;
        while(cur!=null){
        	if(cur.val != val){
        		t.next = new ListNode(cur.val);
        		t = t.next;
        		cur = cur.next;
        	}else{
        		cur = cur.next;
        	}
        }        
        return result.next;
    }
}

public class RemoveLinkedListElements {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(6);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		Solution s = new Solution();
		ListNode r = s.removeElements(head, 6);
		System.out.print(r.val);
		while(r.next!=null){
			r = r.next;
			System.out.print("->"+r.val);
		}
	}

}
