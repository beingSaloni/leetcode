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
    public int sumNumbers(TreeNode root) {
        
       return solve(root);
        
    }
    
    public class TreeNodeWithAns{
        
        TreeNode treeNode;
        
        String s ;
         TreeNodeWithAns() {}
        TreeNodeWithAns(TreeNode treeNode) {this.treeNode = treeNode ;}
        TreeNodeWithAns(TreeNode treeNode , String s){
            
            this.treeNode = treeNode;
            this.s = s;
        }
        
    }
    
    public int solve(TreeNode root){
        
        Queue <TreeNodeWithAns> q = new LinkedList<TreeNodeWithAns>();
                
        q.add(new TreeNodeWithAns(root , "" + root.val));
        
      
        
        
        
        int ans =0 ;
        
        while(q.size() > 0){
            
            int tempSize = q.size();
            
            while(tempSize-- > 0){
                
                TreeNodeWithAns temp = q.poll();
                
                if(temp.treeNode.left == null && temp.treeNode.right == null){
                    
                    ans+= Integer.parseInt(temp.s);
                }
                
                if(temp.treeNode.left != null){
                    q.add(new TreeNodeWithAns(temp.treeNode.left , temp.s + temp.treeNode.left.val) );
                }
                
                if(temp.treeNode.right!= null){
                    q.add(new TreeNodeWithAns(temp.treeNode.right , temp.s + temp.treeNode.right.val));
                }
                
                
            }
            
            
            
        }
        
        return ans;
        
        
    }
}