class Solution {
    fun isPalindrome(s: String): Boolean {
        val formatted = s.lowercase().filter { it.isLetterOrDigit() }
        var left = 0
        var right = formatted.length - 1

        while (left <= right){
            if(formatted[right] != formatted[left]) return false
            left++
            right--
        }
        return true
       
        
    }
}