class Solution {
    public int lastStoneWeightII(int[] stones) {
        int S=0;
        for(int i: stones)
            S+=i;
        int S2=0;
        int n=stones.length;
        //maximise S2
        boolean[][] dp = new boolean[S/2 +1][n+1];
        for(int i=0;i<=n;i++)
            dp[0][i]=true;
        //zero sum is always possible(just dont take any element in the array)
        
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=S/2;s++)
            {
                if(dp[s][i-1] || (s>=stones[i-1] &&dp[s-stones[i-1]][i-1]))
                {
                    dp[s][i]=true;
                    S2=Math.max(s,S2);
                }
                
            }
        }
        return S-2*S2;
        
    }
}
//1049. Last Stone Weight II
/*Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation:
We can combine 2 and 4 to get 2, so the array converts to [2,7,1,8,1] then,
we can combine 7 and 8 to get 1, so the array converts to [2,1,1,1] then,
we can combine 2 and 1 to get 1, so the array converts to [1,1,1] then,
we can combine 1 and 1 to get 0, so the array converts to [1], then that's the optimal value.*/
