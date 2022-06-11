class Solution {
    public int minOperations(int[] A, int x) {
    int n = A.length, res = n + 1;
    Map<Integer, Integer> presum = new HashMap<>();
    presum.put(0, -1);

    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += A[i];
        presum.put(sum, i);
    }

    sum = 0;
    for (int i = n - 1; i >= 0; i--) {
        if (presum.containsKey(x - sum)) {
            res = Math.min(res, n - i + presum.get(x - sum));
        }
        sum += A[i];
    }
    return res == n + 1 ? -1 : res;
}
}