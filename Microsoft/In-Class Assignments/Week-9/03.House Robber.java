class Solution {
public int rob(int[] nums) {
int n = nums.length;
int prev = nums[0]; 
int prev2 = 0;
for(int i=1;i<n;i++){
int take = nums[i];
if(i>1) take+=prev2;
int notTake = prev;
int currI = Math.max(take,notTake);
prev2 = prev;
prev = currI;
}
return prev;
}
}
//198. House Robber
/*Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.*/
