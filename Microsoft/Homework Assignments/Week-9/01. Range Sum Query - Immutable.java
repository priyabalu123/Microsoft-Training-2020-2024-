class NumArray {
    private int arr[];
    public NumArray(int[] nums) {
        this.arr = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left;i<=right;i++)
            sum += this.arr[i];
        return sum;
    }
}
//303. Range Sum Query - Immutable
/*Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3*/
