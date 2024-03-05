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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        
        if(head.next==null) return null;
        int k=0;
        
        ListNode temp=head;
       
        while(temp!=null){
          k++;
            temp=temp.next;
        }
        
        if(k==n){
            ListNode newHead=head.next;
            head=null;
            return newHead;
        }
        
        int nodeToDelete=k-n;
        
        ListNode node =head;
        int s=0;
        
        while(node!=null){
               s++;
            
            if(s==nodeToDelete){
                node.next=node.next.next;
            }
            node=node.next;
         
            
            
            
        }
        
        
    return head;
        
        
        
    }
}