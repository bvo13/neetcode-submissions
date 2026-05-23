class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices)<2:
            return 0
        l = 0
        r = 1
        max = 0
        while r<len(prices):
            if prices[r]-prices[l]>max:
                max = prices[r]-prices[l]
            if prices[l]>prices[r]:
                l+=1
            else:
                r+=1
        
        return max

        