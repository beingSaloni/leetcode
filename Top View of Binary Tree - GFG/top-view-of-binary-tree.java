// { Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    
   static class Pair{
        
        Node tree;
        int d ;
        
        Pair( int d , Node tree ){
            
            this.tree = tree;
            this.d =d;
        }
        
        
    }
    
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer,Integer> memo = new HashMap<>();
       
        ArrayList<Integer> ans = new ArrayList<>();
        
        q.add(new Pair( 0 , root));
        
        int max= -10000;
        int min = 10000;
       
        while(q.size()> 0){
            
            int size = q.size();
            
            while(size-- > 0){
                
                Pair temp = q.poll();
                
                if(!memo.containsKey(temp.d)){
                memo.put(temp.d , temp.tree.data);
                if(min > temp.d){
                    min = temp.d;
                }
                
                if(max < temp.d){
                    
                    max= temp.d;
                }
                }
                
                if(temp.tree.left != null){
                    
                    q.add(new Pair( temp.d-1,temp.tree.left));
                    
               
                }
                
                if(temp.tree.right != null){
                    
                    q.add(new Pair(temp.d +1 ,temp.tree.right));
                    
                }
                
                
            }
            
        }
        
        for(int i = min ; i<= max ; i++){
            
           ans.add(memo.get(i));
        }
        
        return ans;
        
        
    }
}