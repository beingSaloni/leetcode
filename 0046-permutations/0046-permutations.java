class Solution {

    static List<List<Integer>> ans ;
    public List<List<Integer>> permute(int[] nums) {

        ans = new ArrayList<List<Integer>>();

        solve(nums , new ArrayList<>());

        return ans;
        
    }

    private void solve(int[] nums , List<Integer> list){

        if(list.size() == nums.length){

            ans.add(new ArrayList<>(list));
            return;


        }

        for(int i = 0 ; i < nums.length ; i++){

            if(list.contains(nums[i])){
                continue;
            }

            list.add(nums[i]);

            solve(nums,list);

            list.remove(list.size()-1);


        }



    }
}