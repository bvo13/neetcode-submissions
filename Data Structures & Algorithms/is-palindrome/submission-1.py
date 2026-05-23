class Solution:
    def isPalindrome(self, s: str) -> bool:
        left =0
        right=len(s)-1
        sl = s.lower()
        while left<=right:
            if sl[left].isalnum()==False:
                left+=1;
                continue;
            if sl[right].isalnum()==False:
                right-=1;
                continue;
            if sl[left]!=sl[right]:
                return False
            left+=1
            right-=1
        return True

        