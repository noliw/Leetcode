/*
1. inputs:
    - two string s & t
2. what do we do to those inputs:
    - we need to compare and see if t is an anagra of s, making sure that all letters in t appear the same amount of times in s
3. return a boolean

 */

 /*
 the straightforward approach would be for every letter in t we iterate through s and see if it is present while keeping count, for this we may need to a nested loop, one for the outer and inner and this would be O(n^2) complexity and potentially O(1)

 */



class Solution {
    fun isAnagram(s: String, t: String): Boolean {
         val sSeen = HashMap<Char, Int>()
    val tSeen = HashMap<Char, Int>()

    for (char in s) {
        sSeen[char] = sSeen.getOrDefault(char, 0) + 1
    }

    for (char in t) {
        tSeen[char] = tSeen.getOrDefault(char, 0) + 1
    }

    return sSeen == tSeen
        
    }
}