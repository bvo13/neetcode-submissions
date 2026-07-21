# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = 0
        curr = head
        while curr:
            length+=1
            curr = curr.next
        p = length-n
        curr = head
        if p==0:
            return head.next
        while p>0:
            prev = curr
            curr = curr.next
            p-=1
        if not curr:
            prev.next = None
        else:
            prev.next = curr.next
        
        return head

        