class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        
        start = 0 
        end = 0
        
        for i in range(len(s)):
            
            odd = self.expand(i,i,s)
            even = self.expand(i,i+1,s)
            
            s1 = max(even,odd)
            
            if s1 > end - start:
                start = i - ((s1-1)//2)
                end = i + (s1//2)
                
        return s[start:end+1]
        
        
        
    def expand(self,start,end,s):
        
        while start >= 0 and end <len(s) and s[start] == s[end]:
            start -= 1
            end += 1
            
        return end-start-1
    
        