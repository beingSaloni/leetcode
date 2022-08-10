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
    public TreeNode balanceBST(TreeNode root) {
        
        ArrayList in = new ArrayList<Integer>();
        inorder(root , in );
        
        
        return constrctBST( in, 0 , in.size()-1);
        
    }
    
    private void inorder(TreeNode curr, ArrayList in){
        
        if(curr == null){
            return ;
        }
        
        inorder(curr.left,in);
        in.add(curr.val);
        
        inorder(curr.right, in);
    }
    
    private TreeNode constrctBST( ArrayList preorder , int start , int end){
        
        if(start > end){
            
            return null;
        }
        
        int mid = start + (end - start)/2 ;
        
        TreeNode ans = new TreeNode((int)preorder.get(mid));
        
        ans.left = constrctBST(preorder , start , mid -1);
        
           ans.right = constrctBST(preorder , mid +1 , end);
        
        return ans;
        
        
    }
    
    
    
    
    
    
}