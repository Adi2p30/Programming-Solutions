#https://leetcode.com/problems/isomorphic-strings/
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        maps = {}
        count = 0
        for i in range(0,len(s)):
            if t[i] in maps.values() and s[i] not in maps.keys() :
                return False
            maps[s[i]] = t[i]
        for j in range(0,len(t)):
            if t[j] == maps[s[j]]:
                count = count + 1
        if (count) == len(s):
            return True
        else:
            return False
        