class Solution {
    public int climbStairs(int n) {
    if (n == 1) return 1;
    int steps = 0;
    int[] fibnaciSequence = new int[n+1];
    fibnaciSequence[0] = 1;
    fibnaciSequence[1] = 1;
    for (int i = 2; i <= n ; i++){
        fibnaciSequence[i] = fibnaciSequence[i-1] + fibnaciSequence[i-2];
    }
    return fibnaciSequence[n];
        
    }
}
