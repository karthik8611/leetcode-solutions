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
    public boolean isPalindrome(ListNode head) {
        
        List<Integer> list1 = new ArrayList<>();
           List<Integer> list2 = new ArrayList<>();
        
        if(head==null || head.next==null) return true;
        
        
        ListNode node= head;
        while(node!=null){
            list1.add(node.val);
            node=node.next;
           }
        
        list2.addAll(list1);
        Collections.reverse(list2);
        return list1.equals(list2);
        
        
    }
}