/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode r1 = result;
        while(l1!=null || l2!=null){
        	int value = 0;
        	if(l1!=null && l2!=null){
        		if(l1.val >= l2.val){
        			value = l2.val;
        			l2 = l2.next;
        		}else{
        			value = l1.val;
        			l1 = l1.next;
        		}
        	}else if(l1!=null && l2==null){
        		value = l1.val;
        		l1 = l1.next;
        	}else if(l1==null && l2!=null){
        		value = l2.val;
        		l2 = l2.next;
        	}
        	ListNode rt = new ListNode(value);
        	r1.next = rt;
        	r1 = rt;        	        	
        }
    	return result.next;
    }
}

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(7);
		l1.next = new ListNode(8);
		ListNode l2 = new ListNode(9);
		Solution s = new Solution();
		ListNode r = s.mergeTwoLists(l1, l2);
		System.out.print(r.val);
		while(r.next!=null){
			r = r.next;
			System.out.print("->"+r.val);
		}
	}

}
