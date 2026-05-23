class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indices =[]
        complements={}
        for i in range(len(nums)):
            difference = target - nums[i]
            if difference in complements:
                indices.append(complements[difference])
                indices.append(i)
            else:
                complements[nums[i]]=i

        return indices

            
