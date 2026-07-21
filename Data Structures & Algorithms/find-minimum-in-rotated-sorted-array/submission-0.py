class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1
        middle = (left+right)//2
        while left<right:
            if nums[middle]>nums[middle+1]:
                return nums[middle+1]
            elif nums[middle]>nums[left]:
                left = middle
                middle = (left+right)//2
            else:
                right = middle
                middle = (left+right)//2
        return nums[0]