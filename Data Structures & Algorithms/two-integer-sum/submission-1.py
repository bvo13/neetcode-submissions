class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        complement = {}

        for i in range(len(nums)):
            if(not (complement.get(nums[i]) == None)):
                return [complement.get(nums[i]),i]
            complement[target-nums[i]] = i

        return None;


        