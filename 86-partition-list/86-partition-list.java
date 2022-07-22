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
    public ListNode partition(ListNode head, int x) {
        
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        
        ListNode copy1 =l1;
            ListNode copy2 = l2;
        
        while(head!=null){
            
            if(head.val >= x){
                
                
                l2.next = head;
                l2 = head ;
            }else{
                
             
                l1.next = head;
                 l1 =head;
            }        
            head=head.next;
        }
        
        l2.next = null ;
        l1.next =copy2.next;
        
        return copy1.next ;
        
        
        
    }
}