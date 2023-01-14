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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(q == null && p == null){
            
            return true;
        }
        
          if(q == null || p == null){
            
            return false;
        }
        
       Queue<TreeNode> q1 = new LinkedList<>();
        
        Queue<TreeNode> q2 = new LinkedList<>();
        
        q1.add(p);
        q2.add(q);
        
        while(q1.size() > 0){
            
            int size = q1.size();
            
            while(size-- > 0){
                
                TreeNode temp1 = q1.poll();
                
                TreeNode temp2 = q2.poll();
                
                if(temp1.val != temp2.val){

                    return false;
                }
                if(temp1.left != null || temp2.left != null){
                    
                    if(temp2.left == null || temp1.left == null ){
                      
                        return false;
                    }
                    
                    q1.add(temp1.left);
                    q2.add(temp2.left);
                    
                }
                
                if(temp1.right != null || temp2.right != null){
                    
                    if(temp2.right == null || temp1.right == null ){
                        
                         
                        return false;
                    }
                    
                    q1.add(temp1.right);
                    q2.add(temp2.right);
                    
                }
                
               
                
                
            }
            
             if(q1.size() != q2.size()){
                    return false;
                }
            
        }
        
        return true;
        
        
    }
}