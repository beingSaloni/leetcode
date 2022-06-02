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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int[] rootindex = {postorder.length - 1};
        
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int j = 0 ; j < postorder.length ;j++){
            map.put(inorder[j] , j);
        }
        
        // rootindex[0] = inorder.length - 1;
        
      return constructTree(inorder,postorder,0,inorder.length-1,rootindex,map);
        
    }
    
    public static TreeNode constructTree(int[] in , int[] post , int start , int end , int[] rootindex ,HashMap memo){
        
        if(start > end || rootindex[0] < 0){
            
            return null;
        }
        
        TreeNode result = new TreeNode(post[rootindex[0]]);
        
//         int i = -1;
        
//         for(i = start ; i < end ;i++){
            
//             if(in[i] == post[rootindex[0]]){
//                 break;
//             }
            
//         }
        
//         rootindex[0]--;
        
     
        
        int i = (int)memo.get(post[rootindex[0]]);
       
         rootindex[0]--;
        result.right = constructTree(in , post,  i+1 ,end , rootindex,memo);
        result.left = constructTree(in , post, start , i-1 , rootindex,memo);
        
        return result;
    }
    
    
    
}