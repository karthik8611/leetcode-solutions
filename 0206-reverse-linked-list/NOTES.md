// itertive approach- tc:o(n)  sc:o(1)
ListNode prev=null;
ListNode curr=head;
ListNode forw=null;
while(curr!=null){
forw=curr.next;
curr.next=prev;
prev=curr;
curr=forw;
}
return prev;
//
// this is recursive approach tc:o(n) sc:o(n) --> due to recursion stack
//  if(head==null || head.next ==null){
//             return head;
//         }
//         ListNode newHead=reverseList(head.next);
//         head.next.next=head;
//         head.next=null;
//         return newHead;