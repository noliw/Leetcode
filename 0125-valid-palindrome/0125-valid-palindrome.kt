/*
1. Given a string
2. what do we need to do?
    - convert all uppercase letters to lower case
    - remove all non-alphanumeric characters
    - check if its a palindrom:  reads the same forward and backwards
3. return true if its a palindrom and false otherwise
*/

class Solution {
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1

        while (l < r) {
            while (l < r && !s[l].isLetterOrDigit()) {
                l++
            }
            while (r > l && !s[r].isLetterOrDigit()) {
                r--
            }
            if (s[l].lowercase() != s[r].lowercase()) {
                return false
            }
            l++
            r--
        }
        return true
    }
}