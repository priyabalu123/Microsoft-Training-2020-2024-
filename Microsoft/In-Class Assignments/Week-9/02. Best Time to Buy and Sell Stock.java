class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0], diff=0;
        for(int i=1;i<prices.length;i++){
            //if i sell
            int myprofit=prices[i]-min;
            if(myprofit>diff){
                diff=myprofit;
            }
            if(min>prices[i]){
                min=prices[i];
            }
        }
        return diff;
    }
}
//121. Best Time to Buy and Sell Stock
/*Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
