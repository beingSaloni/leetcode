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
    public boolean isValidBST(TreeNode root) {
       
        int[] prev = { Integer.MIN_VALUE , 0} ;
      return  inorder(root ,prev  );
    }
    
    public boolean inorder(TreeNode root , int[] prev){
        
        if(root == null){
            
            return true;
        }
        
        
        boolean left = inorder(root.left , prev);
        
        if(left == false){
            
            return false;
        }
        
        
//         System.out.println(root.val + " " + prev[0]);
        
        
        if(prev[0] == Integer.MIN_VALUE && root.val ==  Integer.MIN_VALUE ){
           prev[1]++;
        }
        
        if(root.val <= prev[0] && prev[0] != Integer.MIN_VALUE ){
            return false;
        }
        
        if(prev[1] > 1){
            
            return false ;
        }
        
        
         
        
        
           prev[0] = root.val ;
       // System.out.println(root.val + " " + prev[0]);
        
        return inorder(root.right , prev);
        
        
        
    }
    
}