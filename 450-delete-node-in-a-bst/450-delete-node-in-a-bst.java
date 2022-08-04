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
    
    private TreeNode findMinNode(TreeNode current){
        
        while(current.left != null)
            current = current.left ;
        
        return current ;
        
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null){
            return null;
        }
        
        if(root.val > key){
            
            root.left = deleteNode(root.left, key);
        }else if(root.val < key){
            
            
            root.right = deleteNode(root.right, key);
        }else{
            
            if(root.left == null && root.right == null){
                
                root = null ;
               
            } else if(root.left != null && root.right == null){
                
                root = root.left ;
                
                
            } else if(root.left == null && root.right != null){
                
                root = root.right ;
                
              
            }else{
                
                TreeNode subsNode = findMinNode(root.right);
                
                TreeNode temp = root;   // temp is allocated root's address 
                
                root.val = subsNode.val ; // root is changed so temp will also change
                subsNode.val = temp.val; // hence no use of this line
                
                // root.right = deleteNode(root.right ,  key  ); won't work bcoz key doesn't exist in the tree
                
                   root.right = deleteNode(root.right ,  temp.val  );
                
            }
            
            
            
        }
        return root;
        
    }
}