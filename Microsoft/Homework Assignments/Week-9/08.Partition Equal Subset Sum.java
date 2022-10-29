class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;
        int target = sum/2;
        
        Set<Integer> set = new HashSet();
        set.add(0);
        
        for (int num: nums) {
            Set<Integer> tempSet = new HashSet<Integer>(set);
            for (Integer subInt : tempSet) {
                if (subInt + num == target) return true;
                if (subInt + num < target) set.add(subInt + num);
            } 
        }
        
        return false;
    }
}
//416. Partition Equal Subset Sum
/*Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].*/
