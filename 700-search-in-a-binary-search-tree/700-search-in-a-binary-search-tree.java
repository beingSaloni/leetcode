/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
//         if(root == null){
            
//             return null;
//         }
        
//         if(root.val > val){
            
//             return searchBST(root.left,val);
//         }
        
//         if(root.val < val){
            
//             return searchBST(root.right,val);
//         }
        
//         return root ;
        
        TreeNode current = root ;
        while(current!= null){
           
            if(current.val == val){
                
                return current;
            }
            
            if(current.val < val){
                
                current =current.right;
            }else{
                
                current = current.left ;
            }
            
        }
        
        
        return null;
        
        
    }
}