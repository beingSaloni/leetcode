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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
      int c = 1;
        ListNode abc = head;
        ListNode copy = head;
        
        ArrayList<Integer> list = new ArrayList<>();
        int check = 0;
        
        while(head != null){
            
            if(c>=left && c<= right){
                
                list.add(head.val);
                check++;
                
                
                
            }
            
            head = head.next;
            c++;
            
        }
        
      
        c = 1;
        
        while(abc != null){
            
            if(c>=left && c<= right){
                
                abc.val = list.get(check-1);
                check--;
                
                
                
            }
            
            abc = abc.next;
            c++;
            
        }
        
        
        return copy;     
    }
}