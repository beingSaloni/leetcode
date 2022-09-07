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
    
    public class pair{
        boolean flag;
        TreeNode tree;
        
        pair(TreeNode tree , boolean flag){
            
            this.tree = tree;
            this.flag = flag;
            
        }
    }
    
    public TreeNode pruneTree(TreeNode root) {
        
       return solve(root).tree;
        
    }
    
    public pair solve(TreeNode root ){
        
        if(root == null){
            
            return new pair(null, false);
        }
        
        
        pair left = solve(root.left );
        pair right = solve(root.right );
        
        
        
        
        if(left.flag && right.flag){
            
            return new pair(new TreeNode(root.val, left.tree, right.tree) , true);
        }
        
         if(left.flag ){
            
            return new pair(new TreeNode(root.val,left.tree , null) , true);
        }
        
         if(right.flag ){
            
            return new pair(new TreeNode(root.val,null , right.tree) , true);
        }
        
        if(root.val == 1){
          
            return new pair(new TreeNode(1) , true);
            
        }
        
        return new pair(null, false);
        
     
        
        
        
        
        
    }
}