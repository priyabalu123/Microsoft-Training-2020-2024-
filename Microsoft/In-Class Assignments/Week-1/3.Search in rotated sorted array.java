class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
/*Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4*/
