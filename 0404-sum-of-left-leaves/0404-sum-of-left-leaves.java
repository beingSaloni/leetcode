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
    public int sumOfLeftLeaves(TreeNode root) {
        
       return solve(root);
        
    }
    public int solve(TreeNode root){
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        int ans  = 0;
        
        while(q.size() > 0){
            
            
            int count = q.size();
            while(count-- > 0){
                TreeNode temp = q.poll();
            if(temp.left!=null){
                q.add(temp.left);
                if(temp.left.left == null && temp.left.right==null){
                    ans+=temp.left.val;
                }
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            }   
            
        }
        
        return ans;
        
    }
}