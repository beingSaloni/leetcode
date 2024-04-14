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
    public int sumOfLeftLeaves(TreeNode root) {
        
        return solve(root , 0);
        
    }
    
    public int solve(TreeNode root , int check){
        
        if(root == null){
            return 0;
        }
        
        
        
        if(root.left == null && root.right == null ){
            
            if(check ==1){
                
                return root.val;

            }
           
            return 0;
            
           
            
        }
        // System.out.println(solve(root.right));
        
        return solve(root.left , 1) + solve(root.right , 0);
        
        
        
    }
}