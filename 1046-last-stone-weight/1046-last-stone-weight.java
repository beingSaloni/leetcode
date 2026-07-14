class Solution {
    public int lastStoneWeight(int[] stones) {

        int size = stones.length ;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones){

            q.add(i);
        }

        while(q.size() > 1){

            int curr1 = q.poll();

            int curr2 = q.poll();

            if(Math.abs(curr1-curr2) > 0){

                q.add(Math.abs(curr1-curr2));
            }


            if(q.size() == 0){

                return 0;
            }


        }


        return q.poll();


        
    }
}