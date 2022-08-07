class Solution {
    
    private static Map<String, Long> memoizedPermutations = new HashMap<>();
    private static int MOD = 1000000007;
    
    public int countVowelPermutation(int n) {
        return (int) ((helper(n, 'a') + helper(n, 'e') + helper(n, 'i') + helper(n, 'o') + helper(n, 'u')) % MOD);
    }
    
    private long helper(int n, char currentChar) {
        if (n == 1) return 1L;
        String key = String.valueOf(n) + String.valueOf(currentChar);
        long val = memoizedPermutations.getOrDefault(key, -1L);
        if (val != -1L) return val;
        switch (currentChar) {
            case 'a':
                val = helper(n-1, 'e');
                break;
            case 'e':
                val = (helper(n-1, 'a') + helper(n-1, 'i'));
                break;
            case 'i':
                val = (helper(n-1, 'a') + helper(n-1, 'e') + helper(n-1, 'o') + helper(n-1, 'u'));
                break;
            case 'o':
                val = (helper(n-1, 'i') + helper(n-1, 'u'));
                break;
            case 'u':
                val = (helper(n-1, 'a'));
                break;
            default :
                // throw new IllegalArgumentException("Character can only be one of the vowels - 'a', 'e', 'i', 'o' and 'u'.");
                return 0;
        }
        memoizedPermutations.put(key, val % MOD);
        return val;
    }
}