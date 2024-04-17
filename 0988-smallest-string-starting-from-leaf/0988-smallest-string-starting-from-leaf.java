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
    public String smallestFromLeaf(TreeNode root) {
        
    String[] ans = new String[1];
        
        ans[0] = "~"; // dummy value '~' > 'z'
        
        solve(root , "" , ans);
        
        return ans[0];
        
    }
    
    public void solve(TreeNode root , String s , String[] ans){
        
        if(root == null){
            
            return;
        }
        
         s = (char)(root.val + 'a') + s ;
        
        if(root.left == null && root.right == null){
            
           
            
           int c = s.compareTo(ans[0]);
            
            if( c < 0){
                 ans[0] = s ;
            }
            
            return ;
        }
        
        solve(root.left , s , ans) ;
        solve(root.right , s , ans);
        
        
        
    }
    
    
    
}