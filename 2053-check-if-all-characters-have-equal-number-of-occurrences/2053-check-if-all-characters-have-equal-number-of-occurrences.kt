class Solution {
    fun areOccurrencesEqual(s: String): Boolean {
        val sCount = HashMap<Char, Int>()
        for (letter in s){
            sCount.put(letter, sCount.getOrDefault(letter, 0) + 1)
        }
        return sCount.values.distinct().size == 1

    }
}