class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] intervals = new int[n];
        Arrays.fill(intervals, -1);
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] == 0) continue;
            int left = i - ranges[i] >= 0 ? i - ranges[i] : 0;
            int right = i + ranges[i];
            intervals[left] = Math.max(intervals[left], right);
        }
        if (intervals[0] == -1) return -1;
        int longest = intervals[0];
        int count = 1;
        int i = 0;
        while (longest < n) {
            int temp = Integer.MIN_VALUE;
            for (; i <= longest; i++) {
                int val = intervals[i];
                if (val == -1) continue;
                temp = Math.max(temp, val);
            }
            if (temp <= longest) return -1;
            longest = temp;
            count++;
        }
        return count;
    }
}
//1326. Minimum Number of Taps to Open to Water a Garden
/*Input: n = 5, ranges = [3,4,1,1,0,0]
Output: 1
Explanation: The tap at point 0 can cover the interval [-3,3]
The tap at point 1 can cover the interval [-3,5]
The tap at point 2 can cover the interval [1,3]
The tap at point 3 can cover the interval [2,4]
The tap at point 4 can cover the interval [4,4]
The tap at point 5 can cover the interval [5,5]
Opening Only the second tap will water the whole garden [0,5]*/
