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
    public boolean hasCycle(ListNode head) {
        
       // if there is cycle in linked two pointers will meet at some point 
       ListNode fast=head;
       ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
                return true;
        }
        
        return  false;
    }
}