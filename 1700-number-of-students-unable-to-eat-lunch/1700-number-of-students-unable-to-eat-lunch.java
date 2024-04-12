class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0 ; i < students.length ; i++){
            
            q.add(students[i]);
        }
        
        
       for(int i = 0 ; i < students.length ; i++){
           
           int c = 0 ;
           
           
           while(q.peek() != sandwiches[i] ){
               
                if(c==q.size()){
               
               return students.length - i ;
           }
               
               q.add(q.poll());
               c++;
           }
           
          
           
           q.remove();
           
           
          
           
       }
        
        return 0;
        
        
        
    }
}