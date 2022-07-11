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
    public List<Integer> rightSideView(TreeNode root) {
           List<Integer> list = new ArrayList<>() ;
        if(root == null){
            
            return list;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
     
        list.add(root.val);
        while(q.size() > 0){
          
          int size = q.size();
          int var = 1000;
            while(size-- > 0){
                
           TreeNode temp = q.poll();
                
            if(temp.left != null){
                var = temp.left.val ;
                q.add(temp.left);
            }
                
            if(temp.right != null){
                var = temp.right.val ;
                q.add(temp.right);
            }
                
            
          
        
            }
            if(var != 1000){
            list.add(var);
            
            }
            
        }
        
        return list;
        
    }
    
    
    
}