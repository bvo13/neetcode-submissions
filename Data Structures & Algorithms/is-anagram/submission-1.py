class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ana1 = {}
        ana2= {}
        if(not (len(s)==len(t))):
            return False
        for i in range(len(s)):
            if(not ana1.get(s[i])==None):
                ana1[s[i]] = ana1.get(s[i])+1
            else:
                ana1 [s[i]] = 1
            if(not ana2.get(t[i])==None):
                ana2[t[i]] = ana2.get(t[i])+1
            else:
                ana2 [t[i]] = 1

        return ana1==ana2
        