class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> set = new HashSet<>(wordDict);
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[s.length() + 1];
        q.add(0);

        while(q.size() > 0){

            int start = q.remove();

            if(start == s.length()){

                return true;

            }

            int end = start + 1;

            while(end <= s.length()){

                if(visited[end]){
                    end++;
                    continue;
                }

                if(set.contains(s.substring(start,end))){

                    q.add(end);
                    
                    visited[end] = true;
                }

                end++;




            }





        }

        return false;
        
    }
}