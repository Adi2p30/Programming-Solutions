# https://leetcode.com/problems/pascals-triangle/
class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        trianglelst = [[1], [1, 1]]
        currlst = []
        if numRows == 1:
            return [[1]]
        if numRows == 2:
            return trianglelst
        for i in range(2, numRows):
            currlst.append(1)
            for j in range(2, i + 1):
                currlst.append(
                    (trianglelst[i - 1][j - 2]) + (trianglelst[i - 1][j - 1])
                )
            currlst.append(1)
            trianglelst.append(currlst)
            currlst = []
        print(trianglelst)
        return trianglelst
