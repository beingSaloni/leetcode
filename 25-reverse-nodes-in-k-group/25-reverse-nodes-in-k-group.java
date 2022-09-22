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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        return solve(head,k);
        
       
        
    }
    
    private ListNode solve(ListNode head, int k){
        
        if(head == null){
            return null;
        }
        
        ListNode ans = valid(head,k);
        if(ans != null){
            
            ListNode temp = ans.next;
            
            
            ans.next =null ;
            
            ListNode reversedLL = reverseList(head);
            head.next = solve(temp,k);
            
            return reversedLL ;
            
            
            
        }
        
        return head;
        
        
    }
    
      public ListNode reverseList(ListNode head) {
        
        
        ListNode prev = null ;
        
        ListNode ahead = null ;
        
        ListNode current = head ;
        
        
        
       while(current != null){
           
           ahead = current.next ;
           current.next =prev;
           prev = current ;
           current = ahead;
           
       }
        
       
        
        return prev;
        
        
        
        
    }
    
    private ListNode valid(ListNode head, int k){
        
        int r = 1;
        ListNode temp = head ;
        
        while(temp!= null && r < k){
            
            temp = temp.next ;
            r++;
            
        }
        
        return temp ;
        
    }
    
}