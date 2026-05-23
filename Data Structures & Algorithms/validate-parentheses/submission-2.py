class Solution:
    def isValid(self, s: str) -> bool:
        parentheses = {')':'(',']':'[','}':'{'}
        stk = []
        for p in s:
            if p in parentheses.values():
                stk.append(p)
                continue;
            if not stk:
                return False
            else:
                if stk[-1]==parentheses[p]:
                    stk.pop()
                    continue;
                else:
                    return False

        if stk:
            return False
        else:
            return True