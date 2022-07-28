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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
//         if(root == null){
            
//             return new TreeNode(val);
//         }
        
//         if(val < root.val){
            
//            root.left = insertIntoBST(root.left , val);
//         }
//          if(val > root.val){
            
//            root.right = insertIntoBST(root.right , val);
//         }
        
        
//         return root;
        if(root == null){
            return  new TreeNode(val);
        }
        
        TreeNode curr = root ;
        TreeNode prev = null ;
        while(curr!= null){
            prev= curr ;
            if(curr.val < val){
                curr = curr.right;
                
            }else{
                
                curr =curr.left;
            }
        }
        
        if(prev.val > val){
            prev.left =  new TreeNode(val);
        }else{
              
            prev.right = new TreeNode(val);
        
        }
        
        
        return root ;
    }
}