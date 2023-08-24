class Solution(object):
    def longestCommonPrefix(self, strs):
        
        strs = ["flower","flow","flight"]
        boole = strs[0][1] == strs[1][0]
        print(boole)       
        """
        :type strs: List[str]
        :rtype: str
        """

strs = ["flower","flow","flight"]

numPrefix = 0
for i in range(min(strs, key=len)):
    if strs[0][i] == strs[1][i] == strs[2][i]:
        numPrefix = numPrefix + 1
print(numPrefix)






    
        