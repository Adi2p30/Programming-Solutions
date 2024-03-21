#https://leetcode.com/problems/contains-duplicate/
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        dictnum = {}
        count = 0 
        for i in nums:
            if i not in dictnum.keys():
                dictnum[i] = 1
            else:
                dictnum[i] = dictnum[i] + 1
        for i in dictnum.values():
            if i > 1:
                count = 1
        if count > 0:
            return True
        else: 
            return False