class Solution {
    
    public int[] deckRevealedIncreasing(int[] deck) {
        
        Queue<Integer> queue = new LinkedList<>(); 
        
        Arrays.sort(deck);
        
        for(int i =0 ; i < deck.length ; i++){
            
            queue.add(i);
        }
        
        int[] result = new int[deck.length];
        
        for(int i = 0 ; i < deck.length ; i++){
            
            result[queue.poll()] = deck[i];
            
            queue.add(queue.poll());
            
        }
        
        return result;
        
        
        
        
        
    }
}