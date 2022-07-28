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
        
        if(root == null){
            
            return new TreeNode(val);
        }
        
        
        TreeNode ans = new TreeNode(root.val);
        
        if(val < root.val){
            
           ans.left = insertIntoBST(root.left , val);
        }else{
            
            ans.left = root.left ;
        }
        
         if(val > root.val){
            
           ans.right = insertIntoBST(root.right , val);
        }else{
            
            ans.right = root.right;
        }
        
        
        return ans;
        
        
        
    }
}