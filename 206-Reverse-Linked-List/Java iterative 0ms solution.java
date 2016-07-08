/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (head != null && head.next != null)
    {
        ListNode pivot = head;
        ListNode frontier = null;
        while (pivot != null && pivot.next != null)
        {
            frontier = pivot.next;
            pivot.next = pivot.next.next;
            frontier.next = head;
            head = frontier;
        }
    }
    
    return head;
    }
};