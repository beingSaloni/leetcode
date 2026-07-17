class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length-1] != 9){

            digits[digits.length-1] =  digits[digits.length-1] + 1;

            return digits ;
        }

        int[] ans = new int[digits.length + 1] ;

         int r = 1 ;
        for(int i = digits.length  ; i > 0; i--){

            ans[i] = r + digits[i-1];

            r= ans[i]/10;

             if(ans[i] > 9){

                ans[i] = ans[i]%10;
               
            }

            digits[i-1] = ans[i];


            // System.out.println(r + " " + i);

            
        }

        ans[0] = r ;

        if(r == 0){

            return digits;
        }

        return ans;

        
        
    
        
        
    }
}