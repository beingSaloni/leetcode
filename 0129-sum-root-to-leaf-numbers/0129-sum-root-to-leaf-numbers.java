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
    public int sumNumbers(TreeNode root) {
        
        return  solve(root , "" );
        
    }
    
    public int solve(TreeNode root , String s ){
        
        if(root == null){
            
            return 0;

        }
        
        if(root.left == null && root.right == null){
            
            return Integer.parseInt(s + root.val) ;
        }
        
        int left = 0 ;
        
        int right = 0;
        
        if(root.left!= null){
        
         left = solve(root.left , s + root.val);
        }
        
        if(root.right != null){
         right =  solve(root.right , s + root.val);
        }
        
        return left + right ;
        
        
    }
    
}