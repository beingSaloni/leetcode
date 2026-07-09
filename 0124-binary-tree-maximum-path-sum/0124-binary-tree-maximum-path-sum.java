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
    int[] ans = new int[1];
    public int maxPathSum(TreeNode root) {


        // traverse sum of one leaf to another 
        // head to leaf
        ans[0] = -100000000;

        solve(root);

        return ans[0];
        
    }

    private int solve(TreeNode root){

        if(root ==  null){

            return 0;
        }


        int left = solve(root.left);
        int right = solve(root.right);

        int currPath = left + root.val + right ;

       

        int curr = root.val + Math.max(left, right) ;

         ans[0] = Math.max(root.val, Math.max(curr ,Math.max(ans[0] , currPath)));


        return Math.max(root.val ,root.val + Math.max(left, right));



        



    }
}