class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer>Map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(Map.containsKey(target-nums[i])){
                ans[0]=Map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
            else{
                Map.put(nums[i],i);
            }
        }
        return ans;
    }
}
/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
