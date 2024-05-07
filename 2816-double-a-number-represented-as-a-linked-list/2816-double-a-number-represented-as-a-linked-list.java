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
    public ListNode doubleIt(ListNode head) {
        
        ListNode rr = reverseList(head) ;
        
        return reverseList(addTwoNumbers( rr , rr));
        
    }
    
    public ListNode reverseList(ListNode head) {
        
        ListNode prev =null;
        ListNode curr = head;
        ListNode tempNode = null;
        
        while(curr!= null){
            
            tempNode = curr.next ;
            curr.next = prev ;
            prev= curr ;
            curr = tempNode ;
            
            
            
        }
        
        return prev ;
        
    }
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
      
        ListNode result = new ListNode();
        ListNode copy = result ;
        int carry = 0;
        while(l1 != null || l2 != null || carry >= 1){
            int sum = 0 ;
            if( l1 != null){
                 sum = sum + l1.val ;
                
                l1 = l1.next ;
                
            }
            if(l2 != null){
                
                sum = sum + l2.val ;
                
                l2 = l2.next ;
                
                
            }
            sum = sum + carry ;
            
            ListNode temp = new ListNode( sum%10);
            
            result.next = temp ;
            
            result = result.next ;
            
            carry = sum/10;
            
            
            
            
        }
        
        
        return copy.next ;
    }
}