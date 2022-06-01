/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public class Pair{
        
        int distance;
        TreeNode target;
        
        Pair(TreeNode _target , int _dis){
            
            distance = _dis;
            target = _target ;
        }
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<TreeNode, TreeNode> parentsMap = findParents(root);
        
        return findNodes(root, target,k,parentsMap);
       
    }
    
    public List<Integer> findNodes(TreeNode root, TreeNode target, int k , Map<TreeNode, TreeNode> parentMap ){
         if(root==null){
            return null;
        }
          Queue<Pair> q = new LinkedList<>();
        
        Set<TreeNode> seen = new HashSet<>();
        
        List<Integer> ans = new ArrayList<>();
        
       
        
        q.add(new Pair(target,k));
        
        while(q.size() > 0){
            
            Pair currentPair = q.poll();
            TreeNode currentNode =currentPair.target;
            int units =currentPair.distance ;
            
            if(seen.contains(currentNode) || units <  0)
                continue;
            seen.add(currentNode);
            
            if(units==0 ){
                ans.add(currentNode.val);
                continue;
            }
            
            if(currentNode.left != null){
                q.add(new Pair(currentNode.left,units-1));
            }
            
             if(currentNode.right != null){
                q.add(new Pair(currentNode.right,units-1));
            }
            
            if(parentMap.get(currentNode) != null){
                
                q.add(new Pair(parentMap.get(currentNode) , units -1));
            }
            
            
            
        }
        
        return ans;
    }
    
     public HashMap<TreeNode, TreeNode> findParents(TreeNode root){
        
         HashMap<TreeNode, TreeNode> parentMap = new  HashMap<TreeNode, TreeNode>();
        iterateTree(root , null,parentMap);
        return parentMap;
        
        
        
    }
    
    private void iterateTree(TreeNode currentNode , TreeNode currentParent,  HashMap<TreeNode, TreeNode> parentMap ){
        if(currentNode==null) 
            return ;
        
        parentMap.put(currentNode,currentParent);
        iterateTree(currentNode.left, currentNode,parentMap);
        iterateTree(currentNode.right, currentNode,parentMap);
        
        
    }
}