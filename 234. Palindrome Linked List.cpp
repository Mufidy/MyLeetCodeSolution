//
//  main.cpp
//  234. Palindrome Linked List
//
//  Created by WangLu on 16/6/18.
//  Copyright © 2016年 MiaoHaifei. All rights reserved.
//

/*
 234. Palindrome Linked List
 
 Given a singly linked list, determine if it is a palindrome.
 
 Follow up:
 Could you do it in O(n) time and O(1) space?
 */

#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    bool isPalindrome(ListNode* head) {
        //first loop, get the length of the linked list
        int length = 0;
        ListNode* current = head;
        while (current!=NULL) {
            length ++;
            current = current->next;
        }
        //second loop, reverse the first half of the list
        current = head;
        ListNode* pre = NULL;
        ListNode* tmp = NULL;
        for (int i=0; i<length/2; i++) {
            tmp = current->next;
            current->next = pre;
            pre = current;
            current = tmp;
        }
        //if length is odd, remove the (length/2)th node
        if (length%2 == 1) {
            current = current->next;
        }
        //compare; list (0,1,...,n-1) become (n/2,n/2-1,...,0) and (n/2+1,n/2+2,...n-1)
        for (int i=0; i<length/2; i++) {
            if (pre->val != current->val) {
                return false;
            }
            pre = pre->next;
            current = current->next;
        }
        return true;
    }
};

int main(int argc, const char * argv[]) {
    ListNode l0(0);
    ListNode l1(1);
    ListNode l2(2);
    ListNode l3(2);
    ListNode l4(1);
    l0.next = &l1;
    l1.next = &l2;
    l2.next = &l3;
    l3.next = &l4;
    Solution s;
    std::cout << s.isPalindrome(&l1) << endl;
    return 0;
}
