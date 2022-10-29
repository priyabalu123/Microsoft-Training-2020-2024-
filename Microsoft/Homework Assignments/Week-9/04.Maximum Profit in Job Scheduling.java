class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int t[][]=new int[startTime.length][4];
    for(int i=0;i<startTime.length;i++)
    {
        t[i][0]=startTime[i];
        t[i][1]=endTime[i];
        t[i][2]=profit[i];
    }
    Arrays.sort(t,(a,b)->a[1]-b[1]);
    int ans=0;
    TreeMap<Integer,Integer> mp=new TreeMap<>();
    for(int i=0;i<t.length;i++)
    {
        Integer tmp=mp.floorKey(t[i][0]);
        int pro=tmp==null?0:mp.get(tmp);
        ans=Math.max(ans,t[i][2]+pro);
        mp.put(t[i][1],ans);
    }
    return ans;
    }
}
//1235. Maximum Profit in Job Scheduling
/*Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
Output: 120
Explanation: The subset chosen is the first and fourth job. 
Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.*/
