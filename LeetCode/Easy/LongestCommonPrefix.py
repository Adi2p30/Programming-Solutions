# https://leetcode.com/problems/longest-common-prefix/
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        minlen = len(min(strs, key=len))
        commaccume = ""

        for i in range(minlen):
            comm = strs[0][i]
            for j in range(1, len(strs)):
                if strs[j][i] != comm:
                    return commaccume
            commaccume += comm
        return commaccume
