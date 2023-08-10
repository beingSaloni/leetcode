class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
       ArrayList<Integer> inner = new ArrayList<>(); 
        
         List<List<Integer>> outer = new ArrayList<List<Integer>>(); 
        
        Arrays.sort(nums);
        helper(nums , 0 , inner , outer );
        

        
        return outer ;
    }
    
    public static void helper(int[] nums , int i , ArrayList inner , List<List<Integer>> outer){
        
        
        if(nums.length <= i){
            
            List<Integer> rr = new ArrayList<Integer>(inner); // creating new list rr which is independent                                                           // from getting affected to changes in inner  
            
            
     // outer.add(inner); ----> this won't work bcoz inner would change with recursive calls
         if(!outer.contains(rr)){
            outer.add(rr);                   // we are passing same outer every time 
         }
            return  ;
        }
        
        
        
             
 
        
        inner.add(nums[i]);
        
        helper(nums, i+1 , inner, outer);
        inner.remove(inner.size()-1);
        
             helper(nums, i+1 , inner , outer);
        
        
       
    }
    
    
    
}