class Solution:
    def createTargetArray(self, nums, index):
        ret = []
        t = 0
        for n in nums:
            ret.insert(index[t], n)
            t += 1
        
        return ret
