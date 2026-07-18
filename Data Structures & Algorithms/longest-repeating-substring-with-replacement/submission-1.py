class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        char_tally = {}
        left = 0
        right = 0
        maximum = 1
        curr = 0
        while right < len(s):
            if s[right] in char_tally:
                char_tally[s[right]]+=1
            else:
                char_tally[s[right]]=1
            right+=1
            sequence = right-left
            if (sequence-max(char_tally.values()))>k:
                char_tally[s[left]]-=1
                left+=1
                sequence-=1
            if sequence>maximum:
                maximum = sequence
        return maximum
            
            