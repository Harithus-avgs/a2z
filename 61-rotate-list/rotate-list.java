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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0 ){
            return head;
        }
        int size=0;
        ListNode sizee = head;
        while(sizee!=null){
            sizee=sizee.next;
            size++;
        }

        int rem=k%size;
        if(rem==0){
            return head;
        }
        
        for(int i=0;i<rem;i++){
            ListNode temp=head;
            ListNode prev=head;
            while(temp.next!=null){
                temp = temp.next;
            }
            while(prev.next!=temp){
                prev = prev.next;
            }
            temp.next = head;
            prev.next = null;
            head=temp;
            
        }
        return head;
    }
}