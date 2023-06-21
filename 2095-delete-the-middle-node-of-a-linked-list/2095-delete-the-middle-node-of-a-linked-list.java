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
    public ListNode deleteMiddle(ListNode head) {
        
     // fast and slow pointers
        
       //better code 
       if(head== null || head.next==null){
             return null;
         }
        
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=head;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
            
            //prev=slow;
        }
        prev.next=slow.next;
        return head;
    
        
        
        
        
        
        
        
        
        
//         if(head== null || head.next==null){
//             return null;
//         }
        
//         ListNode fast=head;
//         ListNode slow=head;
//         ListNode prev=head;
        
//         while( fast!=null && fast.next!=null){
//             fast=fast.next.next;
//             slow=slow.next;
            
//         }
        
//       ListNode nodeAf=slow.next;
        
//         while(prev.next!=slow){
//             prev=prev.next;
//         }
//         prev.next=nodeAf;
//         return head;
     
    
        
       
    
        
    }
}