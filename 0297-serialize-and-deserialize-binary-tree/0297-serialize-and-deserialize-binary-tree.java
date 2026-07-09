/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private void solve1(TreeNode root , StringBuilder sb){

        if(root == null){

            sb.append("X").append(",");
        }else{

            sb.append(root.val).append(",");
            solve1(root.left , sb);
            solve1(root.right , sb);


        }


    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        solve1(root,sb);

        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");

        return solve2(arr , new int[1]);
        
    }

    public TreeNode solve2(String[] arr , int[] i){

        if(arr[i[0]].equals("X")){
            return null ;
        }

        

        TreeNode node = new TreeNode(Integer.valueOf(arr[i[0]]));

        i[0] = i[0] + 1;
        

        node.left = solve2(arr , i);

         i[0] = i[0] + 1;
        node.right =solve2(arr,i);

        return node;


    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));