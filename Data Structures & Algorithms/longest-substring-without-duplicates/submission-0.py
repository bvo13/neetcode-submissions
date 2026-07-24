class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        unique = set()
        l = 0
        r = 0
        max=0
        while r<len(s):
            if s[r] not in unique:
                unique.add(s[r])
                r+=1
            else:
                unique.remove(s[l])
                l+=1
            if r-l>max:
                max = r-l
        
        return max