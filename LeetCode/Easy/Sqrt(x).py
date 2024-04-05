# https://leetcode.com/problems/sqrtx/description/
class Solution:
    def mySqrt(self, x: int) -> int:
        left, right = 0, x
        while left < right:
            middle = (left + right + 1) >> 1
            if middle > x // middle:
                right = middle - 1
            else:
                left = middle
        return left
