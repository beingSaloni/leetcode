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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        
        
        
        solve(root , target);
        
        if(root.val == target && root.left == null && root.right == null){
            
            return null;
        }
        
        return root ;
    }
    
    public void solve(TreeNode root , int t){
        
        if(root == null){
            
            return;
        }
        
        solve(root.right ,t);
        solve(root.left ,t);
        
        
        if(root.left != null && root.left.val == t && root.left.left == null && root.left.right==null){
            
            
            
            root.left = null ;
            
            
        }
        
         if(root.right != null && root.right.val == t && root.right.left == null && root.right.right==null){
            
            
            
            root.right = null ;
            
            
        }
        
        
        
       
        
        
    }
    
}