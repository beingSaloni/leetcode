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
    public boolean findTarget(TreeNode root, int k) {
        
      ArrayList<Integer> list = new ArrayList<>();
        pre(root , list);
        
        int[] arr = new int[list.size()];
        
        for(int i = 0;i < arr.length ; i++){
            
            arr[i] = list.remove(list.size()-1);
        }
        
       int start = 0;
        int end = arr.length-1 ;
        while(start < end ){
            
             if(arr[start] + arr[end] == k){
                 
                 return true;
             } 
            
            if(arr[start] + arr[end] > k){
                 
                 start++;
             }else if(arr[start] + arr[end] < k){
                 
                 end--;
             } 
            
            
            
        }
        
        return false;
        
        
    }
    
    private void  pre(TreeNode root ,ArrayList list){
        
        if(root == null){
            return;
        }
        
        pre(root.left , list);
        
        list.add(root.val);
        
        pre(root.right , list);
        
        
        
    }
}