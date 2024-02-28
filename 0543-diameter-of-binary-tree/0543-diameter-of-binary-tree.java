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
    public int diameterOfBinaryTree(TreeNode root) {
        
        int[]  ans = new int[1];
        solve(root , ans);
        
        return ans[0];
        
    }
    
    private int solve(TreeNode root , int[] ans){
        
        if(root == null){
            return 0;
        }
        
        int leftSubtree = solve(root.left , ans);
        
        int rightSubtree = solve(root.right , ans);
        
        int subTree = leftSubtree + rightSubtree ;
        
        ans[0] = Math.max(subTree , ans[0]);
        
        return Math.max(leftSubtree, rightSubtree) + 1;
        
        
        
    }
    
}