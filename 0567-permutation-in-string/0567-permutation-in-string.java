class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        int[] memo1 = new int[26];

        int[] memo2 = new int[26];

        for(int i = 0 ; i < s1.length() ; i++){

            memo1[s1.charAt(i) - 'a']++;
            memo2[s2.charAt(i) - 'a']++;


        }

        if(Arrays.equals(memo1 , memo2)){

            return true;
        }

        for(int i = s1.length() ; i < s2.length() ; i++){

            memo2[s2.charAt(i) - 'a']++;
            memo2[s2.charAt(i - s1.length()) - 'a']--;

             if(Arrays.equals(memo1 , memo2)){

            return true;
        }

            


        }


        return false;


        
    }
}