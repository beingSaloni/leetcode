class Solution {
    public int[] frequencySort(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length/2 ; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
             nums[nums.length-1-i] = temp;
        }
        
        
     HashMap memo = new HashMap<Integer, Integer>();
        
       int[][] ans = new int[nums.length][2];
          
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            
            if(memo.containsKey(nums[i])){
                
                memo.put(nums[i],(int)memo.get(nums[i]) + 1);
                
            }else{

            memo.put(nums[i] , 1);
            ans[count++][0] = nums[i];
                
            }
            
        }
        
        // 1 2
        // 2 3
        // 3 1
        
        for(int i = 0 ; i < count ; i++){
           
            ans[i][1] = (int)memo.get(ans[i][0]);
             
        }
        
        Arrays.sort(ans,(a,b)-> a[1]-b[1]);
        
        
        
        int result[] = new int[ans.length];
        int index = 0;
        for(int i = 0 ; i < count ; i++){
            // System.out.println(ans[ans.length-count+i][0] + " " + ans[ans.length-count+i][1]);
            while(ans[ans.length-count+i][1]> 0){
              
            result[index++] = ans[ans.length-count+i][0];
                ans[ans.length-count+i][1]--;
            }
            
        }
        
        return result;
        
        
    
        
        
    }
}