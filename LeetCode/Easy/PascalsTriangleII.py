# https://leetcode.com/problems/pascals-triangle-ii/
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        trianglelst = [[1], [1, 1]]
        rowIndex = rowIndex + 1
        currlst = []
        if rowIndex == 1:
            return [1]
        if rowIndex == 2:
            return trianglelst[1]
        for i in range(2, rowIndex):
            currlst.append(1)
            for j in range(2, i + 1):
                currlst.append(
                    (trianglelst[i - 1][j - 2]) + (trianglelst[i - 1][j - 1])
                )
            currlst.append(1)
            trianglelst.append(currlst)
            currlst = []
        return trianglelst[rowIndex - 1]
