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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null){
            
            return head;
        }
        
          
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null ){
            fast = fast.next.next;
            slow =slow.next ;
            
        }
        
       
        
        ListNode rightside = slow.next ;
        slow.next = null ;
        ListNode leftside = head ;
        
        
        ListNode sortLeft = sortList(leftside);
        ListNode sortRight = sortList(rightside);
        
        return mergeTwoLists(sortLeft,sortRight);
        
        
        
        
        
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result = new ListNode(-1) ;
        
        ListNode copy = result;
        
        
        while(list1 != null || list2 != null ){
            
            if(list1 == null){
                result.next = list2 ;
                
                result = result.next;
                list2 = list2.next ;
                continue;
            }
            
            if(list2 == null){
                
            result.next = list1 ;
                result = result.next;
                list1 = list1.next;
                continue;
                
            }
            
            
            if(list1.val < list2.val){
               result.next = list1;
                list1 = list1.next ;
            }else{
                  result.next = list2 ;
                  list2 = list2.next ;
            }
            result = result.next;
            
        }
        
        
        
        return copy.next;
        
    }
    
//      public ListNode middleNode(ListNode head) {
        
//         if(head==null){
//             return null;
//         }
        
//         ListNode fast = head;
//         ListNode slow = head;
        
//         while(fast.next != null && fast.next.next != null ){
//             fast = fast.next.next;
//             slow =slow.next ;
            
//         }
        
//         // if(fast.next != null){
//         //     return slow.next;
//         // }
        
//         return slow ;
//     }
}