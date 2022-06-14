class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        boolean[] visited = new boolean[numCourses];
        
        int[] ans = new int[numCourses];
        
        Queue<Integer> q = new LinkedList<>();
        
        // 1 ----> 0
        // 2 ----> 0
        // 3 ----> 1
        // 3 ----> 2    
        
        int[] inorder = new int[numCourses];
        
        for(int i = 0 ; i < prerequisites.length ;i++){
            
           inorder[prerequisites[i][0]]++;
            
        }
        int c = 0;
        for(int i = 0 ; i < numCourses ;i++){
            
           if(inorder[i] == 0){
               
               q.add(i);
           }
            
        }
        
        while(q.size() > 0){
            
            int temp = q.poll();
            visited[temp] = true;
            ans[c++] =temp ;
            // System.out.println(temp);
            for(int i = 0 ; i< prerequisites.length ;i++){
                
                if(prerequisites[i][1]== temp ){
                    
                    if(!visited[prerequisites[i][0]]){
                        inorder[prerequisites[i][0]]--; 
                        
                        if( inorder[prerequisites[i][0]] == 0){
               
               q.add(prerequisites[i][0]);
           }
                        
                    }
                    
                }
                
            }
            
        }
        
        if(ans.length > 1 && ans[ans.length-1] == 0 && ans[ans.length-2] == 0){
            
            return new int[0];
            
        }
        
        return ans;
        
    }
}