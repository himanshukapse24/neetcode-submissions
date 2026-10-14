/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headOne = list1, headTwo = list2, newHead = new ListNode();
        ListNode currHead = newHead;

        while (headOne != null && headTwo != null) {
            if (headOne.val <= headTwo.val) {
                
                currHead.next = headOne;
                headOne = headOne.next;
            } else {
                currHead.next = headTwo;
                headTwo = headTwo.next;
            }

            currHead = currHead.next;

        }

        if(headOne != null){
                currHead.next = headOne;
        }else{
                currHead.next = headTwo;
        }
        return newHead.next;
    }
}