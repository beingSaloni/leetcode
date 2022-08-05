/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
      return solve(root,p,q);
        
    }
    
    private TreeNode solve(TreeNode root , TreeNode p , TreeNode q){
        
        
        
         if(p.val > root.val && q.val > root.val){
            
            return solve(root.right , p ,q);
        }
        
        if(p.val < root.val && q.val < root.val){
            
            return solve(root.left , p ,q);
        }
        
        return root ;
        
        
        
        
    }
}