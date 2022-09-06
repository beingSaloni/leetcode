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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1 = reverseList(l1);
            
            
        l2 =  reverseList(l2);
        
        
        return  reverseList(addTwoNumbers1(l1,l2));
        
    }
    
    public ListNode reverseList(ListNode head) {
        
        
        ListNode prev = null ;
        
        ListNode tempNode = null ;
        
        ListNode current = head ;
        
        
        
        while(current != null ){
            
           tempNode = current.next ;
            current.next = prev ;
            prev = current ;
            current = tempNode ;
            
        }
        
       
        
        return prev;
        
        
        
        
    }
    
      public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        
      
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