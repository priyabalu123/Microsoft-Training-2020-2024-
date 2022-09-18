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
