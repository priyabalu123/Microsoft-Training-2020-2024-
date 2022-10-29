class Solution 
{
    public int mincostTickets(int[] days, int[] costs) 
    {
        int[] dp = new int[366];
        dp[0] = 0; //no days to travel, no need to spend anything..!!!
            
        int j=0; //to iterate days array
        for(int i=1;i<=365;i++)
        {
          
            if(j==days.length)
                break; //when we are done with our travel days we break.
            
            if(days[j] != i) // if the day is not a travel day, just put the previous day cost.
                dp[i] = dp[i-1];
            
            else
            {
                int one = costs[0] + dp[i-1];
                int seven = costs[1] + dp[Math.max(0, i-7)];
                int thirty = costs[2] + dp[Math.max(0, i-30)];
                
                dp[i] = Math.min(one, Math.min(seven, thirty));
                
                j++;
            }
        }
        
        //System.out.println(Arrays.toString(dp));
        return dp[days[days.length-1]];

    }
}
//983. Minimum Cost For Tickets
/*Input: days = [1,4,6,7,8,20], costs = [2,7,15]
Output: 11
Explanation: For example, here is one way to buy passes that lets you travel your travel plan:
On day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.
On day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, ..., 9.
On day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.
In total, you spent $11 and covered all the days of your travel.*/
