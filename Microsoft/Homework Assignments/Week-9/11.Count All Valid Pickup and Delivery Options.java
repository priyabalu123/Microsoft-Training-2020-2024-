class Solution {
    public int countOrders(int n) {
        long res = 1;
        long mod = 1000000007;
        for (int i = 1; i <= n; i++) {
            res = res * (2 * i - 1) * i % mod;
        }
        return (int)res;
    }
}
//1359. Count All Valid Pickup and Delivery Options
/*Input: n = 1
Output: 1
Explanation: Unique order (P1, D1), Delivery 1 always is after of Pickup 1.*/
