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
    public TreeNode sortedArrayToBST(int[] nums) {
        
         return constrctBST( nums, 0 , nums.length-1);
    }
    
   private TreeNode constrctBST( int[] inorder , int start , int end){
        
        if(start > end){
            
            return null;
        }
        
        int mid = start + (end - start)/2 ;
        
        TreeNode ans = new TreeNode(inorder[mid]);
        
        ans.left = constrctBST(inorder , start , mid -1);
        
           ans.right = constrctBST(inorder , mid +1 , end);
        
        return ans;
        
        
    }

}