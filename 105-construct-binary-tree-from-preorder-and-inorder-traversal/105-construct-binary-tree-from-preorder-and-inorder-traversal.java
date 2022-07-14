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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int[] preindex = {0};
        
       return solve(preorder,inorder,0,preorder.length-1, preindex);
        
    }
    
    public static TreeNode solve(int[] preorder , int[] inorder , int start , int end , int[] index){
        
        
        if(start > end || index[0] >= preorder.length ){
            
            return null;
        }
        
        int i =0;
        for(i = 0; i < end ; i++){
            
            if(preorder[index[0]] == inorder[i]){

              break;
            }
        }
        
        
        
        TreeNode ans = new TreeNode(preorder[index[0]]);
        
        index[0]++;
        
        ans.left = solve(preorder,inorder,start,i-1, index);
        
        ans.right= solve(preorder, inorder,i+1 ,end, index) ;
        
        return ans;
        
        
    }
    
}