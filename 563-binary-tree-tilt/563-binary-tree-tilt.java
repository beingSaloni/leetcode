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
    
    class Pair{
        
        int left ;
        int right ;
        Integer val ;
        
        Pair(int V , int left , int right){
            this.val = V;
            this.left = left;
            this.right = right;
        }
        
    }
    
    
    public int findTilt(TreeNode root) {
        
        int[] ans = new int[1];
        solve(root, ans);
        
        return ans[0];      
        
    }
    
    public  Pair solve(TreeNode root , int[] sum){
        
        if(root == null){
            
            return new Pair( 0 , 0 , 0);
        }
        
        if(root.left == null && root.right == null){
            
              Pair ans = new Pair(root.val , 0 , 0);
            
            return ans;
        }
        
        if(root.left == null ){
            
               Pair right = solve(root.right, sum);
            
              Pair ans = new Pair(root.val , 0 , right.right + right.left + right.val );
            
             sum[0] = sum[0] + Math.abs(0- ans.right);
            
            return ans;
        }
        
         if(root.right == null ){
            
               Pair left = solve(root.left, sum);
            
              Pair ans = new Pair(root.val , left.right + left.left + left.val  , 0);
             
              sum[0] = sum[0] + Math.abs(ans.left - 0);
            
            return ans;
        }
        
        
        
        // left
        
       Pair left = solve(root.left, sum);
        
        // right
        
       Pair right = solve(root.right, sum);
        
        Pair ans = new Pair(root.val , left.left + left.right + left.val , right.right + right.left + right.val);
        
        sum[0] = sum[0] + Math.abs(ans.left - ans.right);
        
        return ans;
        
       
        
        
    }
    
    
}