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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth == 1){
            TreeNode temp = new TreeNode(val , root , null) ;
             root = temp ;
            
            return root ;
        }
        
        solve(root , val , depth -2  );
        
        return root ;
        
    }
    
    public void solve(TreeNode root , int val , int depth){
        
         if(root == null || depth < 0){
            return ;
        }
        if(depth == 0){
             TreeNode temp ;
            if(root.left == null){
                
                root.left = new TreeNode(val);
            }else{
            
             temp = new TreeNode(val , root.left , null);
            
            root.left = temp ;
            }
            
            if(root.right == null){
                root.right = new TreeNode(val);
            }else{
                
            temp = new TreeNode(val , null , root.right);
            
            root.right = temp ;
            }
            return;
            
        }
        
       
        
        
        solve(root.left , val , depth-1) ;
        solve(root.right , val , depth -1);
        
    }
}