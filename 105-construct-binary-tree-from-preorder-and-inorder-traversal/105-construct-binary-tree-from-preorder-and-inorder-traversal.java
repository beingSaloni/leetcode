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
        
        int[] rootindex = new int[1];
        return constructtree(preorder , inorder , 0 , preorder.length , rootindex );
        
    }
    
    public static TreeNode constructtree(int[] pre , int[] in , int start , int end , int[] rootindex){
        
        if(start> end || rootindex[0] >= in.length){
            
            return null;
        }
        
        
        TreeNode result = new TreeNode(pre[rootindex[0]]);
        
        
        
        int i = 0;
        
        for(i = start ; i < end ;i++ ){
            
            if(in[i]==pre[rootindex[0]]){
                break;
            }
            
        }
        
        rootindex[0]++;
        
        result.left = constructtree(pre,in,start,i-1 ,rootindex );
        result.right= constructtree(pre,in,i+1,end ,rootindex );
        
        return result;
    }
}