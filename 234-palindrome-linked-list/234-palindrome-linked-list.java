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
        
        if(head== null || head.next == null){
            
            return true;
            
        }
        
        ListNode midNode = middleNode(head);
        
        ListNode rightHalf = midNode.next;
        
        midNode.next =null;
        ListNode leftHalf = head;
        
        return compare(leftHalf, reverseList(rightHalf));
        
    }
    
    private boolean compare(ListNode left , ListNode right){
        
        ListNode leftcopy = left ;
        ListNode rightcopy = right;
        
        while(leftcopy!= null && rightcopy!=null){
            
            if(leftcopy.val != rightcopy.val){
                return false;
            }
            
            leftcopy = leftcopy.next;
            rightcopy =rightcopy.next;
            
        }
        return true;
    }
    
       public ListNode middleNode(ListNode head) {
        
        if(head==null){
            return null;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow =slow.next ;
            
        }
        
       
        
        return slow ;
    }
       public ListNode reverseList(ListNode head) {
        
        
        ListNode copy = head ;
        
        ListNode result = head ;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        
        while(copy != null ){
            
            stack.push(copy.val);
            copy = copy.next ;
            
        }
        
        while(!stack.empty()){
            
            result.val = stack.pop();
            
            result = result.next;
            
            
        }
        
        return head;
        
        
        
        
    }
    
    
}