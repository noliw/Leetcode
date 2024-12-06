class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        val sCount = HashMap<Char, Int>()
        for (letter in s){
            sCount.put(letter, sCount.getOrDefault(letter, 0) + 1)
        }
        var reference: Int? = null
    for (value in sCount.values) {
        if (reference == null) {
            // Set the first value as the reference
            reference = value
        } else if (value != reference) {
            // If any value doesn't match the reference, return false
            return false
        }
    }
    return true

    }
}