class Solution {
    public int findGCD(int[] nums) {

        int max = nums[0];


        int min = nums[0];


        for(int i = 0 ; i <   nums.length ; i++ ){


            max = Math.max(max , nums[i]);

            min = Math.min(min , nums[i]);


        }

        for(int i = min ; i > 1 ; i-- ){


            // System.out.println(i);


            if(min%i == 0 && max%i == 0){

                return i;
            }



        }





        return 1;
        
    }
}