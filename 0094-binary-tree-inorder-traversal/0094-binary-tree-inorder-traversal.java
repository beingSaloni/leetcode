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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        // List<Integer> list = new ArrayList<>();
      return inorder(root,new ArrayList<>());
//         return list;
        
        
    }
    
    public List<Integer> inorder(TreeNode root, List<Integer> list){
        
        if(root == null){
            return list ;
        }
        
        if(root.left == null && root.right == null){
            list.add(root.val);
            return list;
        }
        if(root.left==null){
            list.add(root.val);
            inorder(root.right, list);
            System.out.println(root.val);
            return list;
        }
         
        inorder( root.left, list) ;
         if(root.right==null){
          
              list.add(root.val);
              System.out.println(root.val);
            return list;
        }
        
           list.add(root.val);
         System.out.println(root.val);
            inorder(root.right, list);
        return list ;
        
    }
}