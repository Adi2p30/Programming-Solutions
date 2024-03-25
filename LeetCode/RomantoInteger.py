#https://leetcode.com/problems/roman-to-integer/description/
class Solution:
    def romanToInt(self, s: str) -> int:
        roman = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
        }
        
        s = list(s)

        romint = 0
        prevno = 0
        for num in s:

            if roman.__contains__(num):
                currno = roman[num]
                if(prevno < currno):
                    if currno != 'I':
                        romint += currno - (prevno * 2)

                else:
                    romint += roman[num]
                prevno = roman[num]
        return romint
