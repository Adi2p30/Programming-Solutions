# https://leetcode.com/problems/first-bad-version/
class Solution:
    def firstBadVersion(self, n: int) -> int:
        high = n
        low = 1
        while low <= high:
            mid = ((high + low)) // 2
            if isBadVersion(mid):
                if not isBadVersion(mid - 1):
                    return mid
                high = mid - 1
            else:
                low = mid + 1
