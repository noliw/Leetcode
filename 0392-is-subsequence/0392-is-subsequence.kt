class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var idx1 = 0
        var idx2 = 0

        while (idx1 < s.length && idx2 < t.length){
            if (s[idx1] == t[idx2]) {
            idx1++ // move s forward only if match
        }
        idx2++ // always move t forward
      
          } 
           return idx1 == s.length
    }
}