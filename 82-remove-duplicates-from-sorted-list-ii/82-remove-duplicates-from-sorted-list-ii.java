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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        
        dummy.next = head ;
        
        ListNode prev = dummy ;
        ListNode curr = head ;
        
        while(curr!= null){
            boolean flag = false ;
            while(curr.next != null && curr.val == curr.next.val){
                
                curr = curr.next ;
                flag = true ;
                
            }
            
            if(flag){
                prev.next = curr.next ;
            }else{
                prev = curr;
            
            }
            
            curr = curr.next;
            
        }
        
        return dummy.next ;
        
    }
}