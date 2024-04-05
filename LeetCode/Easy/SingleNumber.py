# https://leetcode.com/problems/single-number/
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        numbers = []
        for i in nums:
            if i not in numbers:
                numbers.append(i)
                print("added " + str(i))
            else:
                numbers.remove(i)
                print("removed " + str(i))
        return numbers[0]
