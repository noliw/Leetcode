class Solution {
    fun isPalindrome(s: String): Boolean {
        val formatted = s.lowercase().filter { it.isLetterOrDigit() }
        var right = formatted.length - 1
        var left = 0
        

        while (left < right){
            if (formatted[left] != formatted[right]) return false
                left++
                right--
            
        }
        return true
        
    }
}