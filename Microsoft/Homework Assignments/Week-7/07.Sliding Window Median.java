public class Solution {

    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(

        new Comparator<Integer>() {

            public int compare(Integer i1, Integer i2) {

                return i2.compareTo(i1);

            }

        }

    );

	          public double[] medianSlidingWindow(int[] nums, int k) {

        int n = nums.length - k + 1;

	if (n <= 0) return new double[0];

        double[] result = new double[n];

        

        for (int i = 0; i <= nums.length; i++) {

            if (i >= k) {

        	result[i - k] = getMedian();

        	remove(nums[i - k]);

            }

            if (i < nums.length) {

        	add(nums[i]);

            }

        }

        

        return result;

    }

    

    private void add(int num) {

	if (num < getMedian()) {

	    maxHeap.add(num);

	}

	else {

	    minHeap.add(num);

	}

	if (maxHeap.size() > minHeap.size()) {

            minHeap.add(maxHeap.poll());

	}

        if (minHeap.size() - maxHeap.size() > 1) {

            maxHeap.add(minHeap.poll());

        }

    }

	

    private void remove(int num) {

	if (num < getMedian()) {

	    maxHeap.remove(num);

	}

	else {

	    minHeap.remove(num);

	}

	if (maxHeap.size() > minHeap.size()) {

            minHeap.add(maxHeap.poll());

	}

        if (minHeap.size() - maxHeap.size() > 1) {

            maxHeap.add(minHeap.poll());

        }

    }

	

    private double getMedian() {

	if (maxHeap.isEmpty() && minHeap.isEmpty()) return 0;

	    

	if (maxHeap.size() == minHeap.size()) {

	    return ((double)maxHeap.peek() + (double)minHeap.peek()) / 2.0;

	}

	else {

            return (double)minHeap.peek();

	}

    }

}
//480. Sliding Window Median
/*Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [1.00000,-1.00000,-1.00000,3.00000,5.00000,6.00000]
Explanation: 
Window position                Median
---------------                -----
[1  3  -1] -3  5  3  6  7        1
 1 [3  -1  -3] 5  3  6  7       -1
 1  3 [-1  -3  5] 3  6  7       -1
 1  3  -1 [-3  5  3] 6  7        3
 1  3  -1  -3 [5  3  6] 7        5
 1  3  -1  -3  5 [3  6  7]       6*/
