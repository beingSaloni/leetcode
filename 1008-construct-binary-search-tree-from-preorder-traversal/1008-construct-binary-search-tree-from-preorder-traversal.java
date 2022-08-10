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
    public TreeNode bstFromPreorder(int[] preorder) {
        
       return solve(preorder , new int[]{0} , 0 , 10000);
    }
    
    private TreeNode solve(int[] pre , int[] index , int min , int max){
        
        if(index[0] >= pre.length || pre[index[0]] >= max || pre[index[0]] <= min){
            
            return null;
        }
        
        int val = pre[index[0]++] ;
        
        TreeNode ans = new TreeNode(val);
        
        ans.left = solve(pre , index  , min , val) ;
        
        ans.right = solve(pre, index , val , max);
        
        return ans;
        
        
    }
    
}