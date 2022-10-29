class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;
    public KthLargest(int k, int[] nums) {
        List<Integer> list= new ArrayList<Integer>();  
        for(int i = 0; i < Math.min(k, nums.length); ++i) list.add(nums[i]);
        pq = new PriorityQueue<>(); pq.addAll(list);
        this.k = k;
        for(int i = k; i < nums.length; ++i) {
            pq.add(nums[i]);
            pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > k) pq.poll();
        return pq.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 8, 2}, stream = new int[]{3, 5, 10, 9, 4};
        KthLargest obj = new KthLargest(3, nums);
        for(int num : stream) System.out.print(obj.add(num) + " ");
    }
}
//703. Kth Largest Element in a Stream
/*Input
["KthLargest", "add", "add", "add", "add", "add"]
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
Output
[null, 4, 5, 5, 8, 8]

Explanation
KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
kthLargest.add(3);   // return 4
kthLargest.add(5);   // return 5
kthLargest.add(10);  // return 5
kthLargest.add(9);   // return 8
kthLargest.add(4);   // return 8*/
