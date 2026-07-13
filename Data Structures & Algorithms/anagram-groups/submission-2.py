class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        out = []
        maps = []
        for s in strs:
            chars = {}
            for c in s:
                if c in chars:
                    chars[c] +=1
                else:
                    chars[c]=1
            if chars not in maps:
                maps.append(chars)
                out.append([s])
            else:
                out[maps.index(chars)].append(s)
        
        return out