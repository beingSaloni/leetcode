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
    public ListNode removeNodes(ListNode head) {
        
      
        ListNode reverse =  reverse(head);
        
        ListNode temp = new ListNode(reverse.val) ;
        
        ListNode copyOfTemp = temp;
        
        int prev = reverse.val;
        
        reverse = reverse.next;
        
        while(reverse != null){
            
            if(reverse.val >= prev){
                
                
                
                ListNode xx = new ListNode(reverse.val);
                
                temp.next  = xx;
                prev = reverse.val ;
                temp =temp.next ;
            }
            
            reverse = reverse.next ;
            
           
            
          
            
        }
        
        return reverse(copyOfTemp);
        
        
        
        
        
        
        
    }
    
    public ListNode reverse(ListNode head){
        
        
        ListNode now = head ;
        ListNode past = null;
        ListNode future = null ;
        
        while(now != null ){
           
            future = now.next ;
            now.next = past;
            past = now ;
            now = future ;
            
            
        }
        
        return past;
        
        
    }
    
}