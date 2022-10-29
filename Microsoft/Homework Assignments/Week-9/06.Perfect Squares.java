public class Solution {
    public int numSquares(int n) {
        int res = n, num =2;
        while(num * num <=n){
            int x = n/(num*num), y = n%(num*num);
            res = Math.min(res, x + numSquares(y));
            ++num;
        }

        return res;
    }
}
//279. Perfect Squares
/*Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.*/
