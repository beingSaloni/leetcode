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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        if(head.next == null){
            
            return head;
        }
        
        ListNode temp = new ListNode(head.val);
        
        ListNode ans = temp;
        
        while(head != null){
            
            temp.next = new ListNode(gcd(temp.val , head.next.val));
            
            
            temp = temp.next;
            
            temp.next = new ListNode(head.next.val);
            
            temp = temp.next;
          
            head = head.next;
            
            if(head.next == null){
                break;
            }
            
        }
        
        return ans;
       
        
    }
    
    private int gcd(int a1 , int a2){
        
        for(int i = Math.min(a1,a2) ; i > 1 ; i--){
            
            if(a1 % i == 0 && a2 % i == 0){
                
                return i;
            }
            
        }
        
        return 1;
        
    }
    
    
    
    
}