class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        map1 = {}
        map2 = {}
        for c in s1:
            if c not in map1:
                map1[c]=1
            else:
                map1[c]+=1
        left = 0
        right = 0
        while right<len(s2):
            if s2[right] not in map2:
                map2[s2[right]]=1
            else:
                map2[s2[right]]+=1
            if map1==map2:
                return True
            if (right-left)<(len(s1)-1):
                right+=1
                continue
            elif map2[s2[left]]==1:
                del map2[s2[left]]
            else:
                map2[s2[left]]-=1
            left+=1
            right+=1
        if map1==map2:
            return True
        else:
            return False
