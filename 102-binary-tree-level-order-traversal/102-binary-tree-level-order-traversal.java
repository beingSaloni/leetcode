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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root ==  null){
            
            return ans;
        }
        
       
        
        q.add(root);
        
        while(q.size() > 0){
            
            int size = q.size() ;
             List<Integer> list =new ArrayList<>();
            while(size-- > 0){
                
                
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left!= null){
                    
                    q.add(temp.left);
                }
                 if(temp.right!= null){
                    
                    q.add(temp.right);
                }
                
                
                
            }
            ans.add(list);
        }
        
        return ans ;
        
    }
}