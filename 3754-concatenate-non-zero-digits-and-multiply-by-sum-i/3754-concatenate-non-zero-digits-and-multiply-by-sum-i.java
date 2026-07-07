class Solution {
    public long sumAndMultiply(int n) {

        long sum = 0 ;

        String s = "" + n;

        char[] arr = s.toCharArray();

         s = "";

        for(int i = 0 ; i < arr.length ; i++  ){


           int curr = (int)(arr[i] -'0');

           sum = sum + curr ;


           if(arr[i] != '0'){

           s = s + arr[i];

           }




        }

        if(s.equals("")){
            return 0;
        }

        


        return sum*Long.parseLong(s) ;
        
    }
}