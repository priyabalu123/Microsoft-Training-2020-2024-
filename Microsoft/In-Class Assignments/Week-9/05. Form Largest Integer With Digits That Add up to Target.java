class Solution {
    public String largestNumber(int[] cost, int target) {
        
        int len = cost.length;
        String dp[][] = new String[len + 1][target + 1];
        
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= target; j++) {
                
                if (i == 0 || j == 0) {
                    dp[i][j] = "";
                    continue;
                }
                
                String old = dp[i - 1][j];
                String s = "";
                
                if (j >= cost[i - 1]) {
                    int newj = j - cost[i - 1];
                    if (dp[i][newj].equals("") && newj > 0)
                        s = "";
                    else
                        s = s + String.valueOf(i) + dp[i][newj];
                }
                if (s.length() == old.length())
                    dp[i][j] = s.compareTo(old) > 0 ? s : old;
                if (s.length() != old.length())
                    dp[i][j] = s.length() > old.length() ? s : old;
            }
        }
        return dp[len][target].equals("") ? "0" : dp[len][target];
    }
}
//1449. Form Largest Integer With Digits That Add up to Target
/*Input: cost = [4,3,2,5,6,7,2,5,5], target = 9
Output: "7772"
Explanation: The cost to paint the digit '7' is 2, and the digit '2' is 3. Then cost("7772") = 2*3+ 3*1 = 9. You could also paint "977", but "7772" is the largest number.
Digit    cost
  1  ->   4
  2  ->   3
  3  ->   2
  4  ->   5
  5  ->   6
  6  ->   7
  7  ->   2
  8  ->   5
  9  ->   5
*/
