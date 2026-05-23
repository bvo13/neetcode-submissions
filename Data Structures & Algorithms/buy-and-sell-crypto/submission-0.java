class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int windowStart=0;
        for(int windowEnd=0; windowEnd<prices.length;windowEnd++){
            if(prices[windowEnd]>prices[windowStart]&&((prices[windowEnd]-prices[windowStart])>profit)){
                profit= prices[windowEnd]-prices[windowStart];
            }
            if(prices[windowEnd]<prices[windowStart]){
                windowStart=windowEnd;
            }
        }
        return profit;
    }
}
