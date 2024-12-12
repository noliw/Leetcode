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