class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        boolean[] visited = new boolean[numCourses];
        
        boolean[] check = new boolean[numCourses];
        
        
        for(int i = 0 ; i<numCourses ;i++){
            
            if(!visited[i]){
                
                if(cycles(visited,check,prerequisites, i)){
                    
                    return false;
                }
                
            }
            
        }
        
        
        return true;
        
    }
    
    public static boolean cycles(boolean[] visited, boolean[] check ,int[][] prerequisites, int V ){
        
        visited[V] = true;
        check[V] = true;
        
        for(int i = 0 ; i < prerequisites.length ; i++ ){
            
            if(prerequisites[i][1] == V){
                
                if(!visited[prerequisites[i][0]]){
                    
                    if(cycles(visited,check,prerequisites,prerequisites[i][0])){
                        
                        return true;
                    }
                }else if(check[prerequisites[i][0]]){
                    
                    return true;
                }
                
            }
            
            
            
            
        }
        
        check[V] = false;
        
        return false;
    }
    
}