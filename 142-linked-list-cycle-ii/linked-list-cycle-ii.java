/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
        ListNode fast = head;
 int cnt = 0;
        while(fast!=null && fast.next!=null){
           
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cnt+=1;
                break;
            }
        }
                    if(cnt==0) return null; ;

                    slow = head;
                    while(slow!=fast){
                        slow=slow.next;
                        fast=fast.next;
                    }
return slow;
        
    }
}