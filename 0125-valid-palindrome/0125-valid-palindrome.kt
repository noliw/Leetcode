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
        var cleanedString = s.lowercase().replace("[^a-zA-Z0-9]".toRegex(), "")
    var start = 0
    var end = cleanedString.length - 1
    while (start < end){
        if(cleanedString[start] != cleanedString[end]) return false
        start++
        end--
    }
    return true
    }
}