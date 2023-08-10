class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        Arrays.sort(nums);
        solve(ans , nums, 0 , inner);
        return ans;
    }
    
    private void solve(List<List<Integer>> ans , int[] nums, int index , List<Integer> inner ){
        
        if(index >= nums.length){
           
            List<Integer> result = new ArrayList<>(inner);
            
            if(!ans.contains(result)){
            ans.add(result);
            }
            return ;
        }
        
     
        inner.add(nums[index]);
        solve(ans, nums , index +1, inner);
        
        inner.remove(inner.size()-1);
        solve(ans, nums, index + 1, inner);
    } 
    
}