/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Intersection_of_Two_Linked_Lists
{
    class ListNode
    {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    class Solution
    {
        public ListNode GetIntersectionNode(ListNode headA, ListNode headB)
        {
            ListNode la = headA;
            ListNode lb = headB;
            int lenA = 0;
            int lenB = 0;
            while (la != null)
            {
                lenA++;
                la = la.next;
            }
            while (lb != null)
            {
                lenB++;
                lb = lb.next;
            }
            la = headA;
            lb = headB;
            if (lenA > lenB)
            {
                for (int i = 0; i < lenA - lenB; i++)
                {
                    la = la.next;
                }
            }
            if (lenA < lenB)
            {
                for (int i = 0; i < lenB - lenA; i++)
                {
                    lb = lb.next;
                }
            }
            while (la != null && lb != null)
            {
                if (la == lb)
                    return la;
                la = la.next;
                lb = lb.next;
            }
            return null;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            ListNode a1 = new ListNode(1);
            ListNode a2 = new ListNode(2);
            ListNode b1 = new ListNode(3);
            ListNode b2 = new ListNode(4);
            ListNode b3 = new ListNode(5);
            ListNode c1 = new ListNode(6);
            ListNode c2 = new ListNode(7);
            ListNode c3 = new ListNode(8);
            a1.next = a2;
            a2.next = c1;
            c1.next = c2;
            c2.next = c3;
            b1.next = b2;
            b2.next = b3;
            b3.next = c1;
            Solution s = new Solution();
            Console.WriteLine(s.GetIntersectionNode(a1, b1).val);
            Console.Read();
        }
    }
}
