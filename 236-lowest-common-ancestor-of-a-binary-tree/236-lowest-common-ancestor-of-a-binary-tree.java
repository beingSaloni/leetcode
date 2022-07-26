/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int[] arr = new int[2];
       TreeNode ans = solve(root , p ,q , arr);
        
       
        if(arr[0] == 1 && arr[1] == 1){
            
            
            return ans;

        }
        
        return null;
        
    }
    
    public static TreeNode solve(TreeNode root , TreeNode p , TreeNode q , int[] arr){
        
        if(root == null){
               return null ;
        }
    
        
        TreeNode left = solve(root.left, p ,q , arr);
         TreeNode  right = solve(root.right,p,q,arr);
          
           
        
        
        
        if(root == p ){
            arr[0] = 1;
            return root;
        }
        
        
        if(root == q){
            arr[1] =1;      
            return root;
        }
        
         if(left != null && right != null){
                return root;
            }
        
        
        if(left != null ){
                return left;
            }
        
        if(right != null){
                return right;
            }
        
        
        
          
        return null;
        
    }
    
}