# https://leetcode.com/problems/remove-element/
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        initial = len(nums)
        while val in nums:
            nums.remove(val)
        return len(nums)
