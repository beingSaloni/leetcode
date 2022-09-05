class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
         boolean[] visited = new boolean[numCourses];
        
        boolean[] check = new boolean[numCourses];
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0 ; i<numCourses ;i++){
            
            if(!visited[i]){
                
                if(cycles(visited,check,prerequisites, i , ans)){
                    
                    return new int[0];
                }
                
            }
            
        }
        
        int[] anss = new int[numCourses];
        // System.out.println(ans.size());
        for(int i = 0 ; i < numCourses ; i++){
            
            anss[i] =  ans.remove(ans.size()-1);
            
        }
       
        return anss;
        
    }
       public static boolean cycles(boolean[] visited, boolean[] check ,int[][] prerequisites, int V , ArrayList ans){
        
        visited[V] = true;
        check[V] = true;
        
        for(int i = 0 ; i < prerequisites.length ; i++ ){
            
            if(prerequisites[i][1] == V){
                
                if(!visited[prerequisites[i][0]]){
                    
                    if(cycles(visited,check,prerequisites,prerequisites[i][0] , ans)){
                        
                        return true;
                    }
                }else if(check[prerequisites[i][0]]){
                    
                    return true;
                }
                
            }
            
            
            
            
        }
        ans.add(V);
        check[V] = false;
        
        return false;
    }
}