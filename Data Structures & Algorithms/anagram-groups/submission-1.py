class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        out =[]
        characters =[]
        for s in strs:
            counts = {}
            for c in s:
                if c in counts:
                    counts[c] = counts[c]+1
                else:
                    counts[c] = 1
            if counts in characters:
                out[characters.index(counts)].append(s)
            else:
                characters.append(counts)
                out.append([s])
        
        return out
