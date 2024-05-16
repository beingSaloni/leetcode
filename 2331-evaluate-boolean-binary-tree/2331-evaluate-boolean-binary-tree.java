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
    public boolean evaluateTree(TreeNode root) {
        
      return  solve(root);
        
    }
    
    public boolean solve(TreeNode root){
        
        
        if(root.left == null && root.right == null){
            
            if(root.val == 1) return true;
            
            return false;
        }
        
        if(root.val == 3){
            
            return solve(root.left) && solve(root.right);
        }
        
        return solve(root.left) || solve(root.right);
        
        
        
        
        
        
    }
    
}