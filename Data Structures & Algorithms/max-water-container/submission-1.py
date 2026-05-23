class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left = 0
        right = len(heights)-1
        maxWater = min(heights[left],heights[right])*(right-left)
        while(left<right):
            water = min(heights[left],heights[right])*(right-left)
            if(water>maxWater):
                maxWater = water
            if(heights[left]<heights[right]):
                left+=1
            else:
                right-=1
        return maxWater

        