class Solution {
    public int fib(int n) {
        if (n < 2) return n;
        int a = 0, b = 1, temp;
        for (int i = 1; i < n; i++) {
            temp = a;
            a = b;
            b += temp;
        }
        return b;
    }
}
//509. Fibonacci Number
/*Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.*/
