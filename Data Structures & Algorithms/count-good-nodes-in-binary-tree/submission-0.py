# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:

    good_nodes = 0

    def dfs(self, root: TreeNode, highest: int):
        if not root:
            return None
        if root.val>=highest:
            highest = root.val
            self.good_nodes+=1
        self.dfs(root.left,highest)
        self.dfs(root.right,highest)
    def goodNodes(self, root: TreeNode) -> int:
        self.dfs(root,root.val)
        return self.good_nodes

        