class Solution {
   public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            
            for (int j = coins[i]; j < dp.length; j++) {
                if (dp[j - coins[i]] != Integer.MAX_VALUE) {
				
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
    }
}
//322. Coin Change
/*Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1*/
