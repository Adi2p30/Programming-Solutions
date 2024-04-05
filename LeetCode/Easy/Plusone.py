# https://leetcode.com/problems/plus-one/
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        listint = [str(i) for i in digits]
        modint = int("".join(listint)) + 1
        return reduce(lambda acc, x: acc + [int(x)], str(modint), [])
