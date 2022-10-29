class Solution {
    public int climbStairs(int n) {
        // simple fibonacci problem
        int steps=0;
        int n1=0;
        int n2=1;
            for(int i=1; i<=n;i++){
                steps=n1+n2;
                n1=n2;
                n2=steps;
            }
        return steps;
    }
}
//70.Climbing stairs
/*Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps*/
