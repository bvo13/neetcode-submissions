class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0
        else:
            max = 1
        
        for num in nums:
            if num-1 not in nums:
                continue
            else:
                n = num+1
                curr = 2
                while n in nums:
                    curr+=1
                    n+=1
                if curr>max:
                    max = curr
        
        return max