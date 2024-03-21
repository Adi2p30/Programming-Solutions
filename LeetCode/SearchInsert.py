#https://leetcode.com/problems/search-insert-position/
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        flag = 1
        for i in range(0,len(nums)):
            if nums[i] == target:
                return i
            elif target > nums[len(nums)-1]:
                return (len(nums))
            elif target > nums[i] and target < nums[i+1]:
                return (i+1)
            elif target < nums[0]:
                return 0