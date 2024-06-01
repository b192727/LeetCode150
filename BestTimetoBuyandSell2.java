//Problem Link: https://rb.gy/lmcjx1

//code
class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        int start = prices[0];
        int end = prices[0];

        for(int i = 1 ; i < prices.length ; i ++)
        {
            if(prices[i] > prices[i-1]) {
                end = prices[i];
            }
            else {
                profit += (end-start);
                start = prices[i];
                end = prices[i];
            }
        }
        profit += (end-start);
        return profit;
    }
}
