# https://leetcode.com/problems/merge-sorted-array/
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        index = 0
        for x in range(len(nums1)):
            if index >= n:
                break
            if nums1[x] == 0:
                nums1[x] = nums2[index]
                index += 1
        nums1.sort()
