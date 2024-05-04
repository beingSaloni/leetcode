class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
       
        int c = 0;
        Arrays.sort(people);
        
        //3 3 4 5
        
           int i = 0;
            
            for(int j = people.length -1 ; j >= 0 ; j--){
                
                
                
                
                if(people[i] + people[j] <= limit){
                              
                    System.out.println(i + " " + j);
                    i++;
                }
                    c++;
                
            if(j<=i){
                    break;
                }
            
        }
        
        
        return c;
    }
}