/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lA =0;
        int lB = 0;
        
        ListNode tempA = headA ;
        ListNode tempB = headB ;
        while( tempA != null ){
            lA++;
            tempA = tempA.next ;
        }
        
        while( tempB != null ){
            lB++;
            tempB = tempB.next ;
        }
        
        
        while(lA > lB){
            lA--;
            headA =headA.next;
        }
        
        while(lA < lB){
            lB--;
            headB =headB.next;
        }
        if(headB==headA){
return headB ;
            }
        
        while(headB != null && headA != null){
            
            if(headB.next == headA.next){
                return headB.next;
            }
            
            headB= headB.next ;
            headA= headA.next;
            
        }
        
        
        
        return null;
    }
}