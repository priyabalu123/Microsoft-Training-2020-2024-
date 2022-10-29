class Solution {
    public int minHeightShelves(int[][] books, int shelf_width) {
        int n = books.length;
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + books[i - 1][1];
            int height = books[i - 1][1];
            int width = books[i - 1][0];
            for (int j = i - 1; j > 0 && width + books[j - 1][0] <= shelf_width; j--) {
                height = Math.max(height, books[j - 1][1]);
                width += books[j - 1][0];
                dp[i] = Math.min(dp[i], height + dp[j - 1]);
            }
        }
        return dp[n];
    }
}
//1105. Filling Bookcase Shelves
/*Input: books = [[1,1],[2,3],[2,3],[1,1],[1,1],[1,1],[1,2]], shelf_width = 4
Output: 6
Explanation:
The sum of the heights of the 3 shelves is 1 + 3 + 2 = 6.
Notice that book number 2 does not have to be on the first shelf.*/
