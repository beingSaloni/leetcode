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
    public int goodNodes(TreeNode root) {
        
        // 
        int[] ans = new int[1];
        solve(root , root.val , ans);
        
        return ans[0];
        
        
        
    }
    
    public static void solve(TreeNode root, int max , int [] ans){
        
        if(root == null){
            return;
        }
        
        if(root.val >= max){
            
            ans[0]++;
        }
        
        
            max = Math.max(root.val, max) ;
        
        
        solve(root.right, max , ans);
        
        solve(root.left, max, ans);
        
        
        
    }
    
}