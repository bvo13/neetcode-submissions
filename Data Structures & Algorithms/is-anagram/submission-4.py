class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        characters1={}
        characters2={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] in characters1:
                characters1[s[i]]+=1
            else:
                characters1[s[i]]=1
            if t[i] in characters2:
                characters2[t[i]]+=1
            else:
                characters2[t[i]]=1;

        return characters1==characters2

    