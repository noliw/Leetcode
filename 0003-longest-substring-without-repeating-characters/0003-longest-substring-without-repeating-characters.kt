class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
       var left = 0
       val seen = mutableSetOf<Char>()
       var maxLen = 0
       

       for (right in s.indices){
        while (s[right] in seen){
            seen.remove(s[left])
            left++
        }
        seen.add(s[right])
        maxLen = maxOf(maxLen, right - left + 1)
       }
       return maxLen
    }
}