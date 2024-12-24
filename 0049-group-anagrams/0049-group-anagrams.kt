class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
       val count = HashMap<List<Int>, MutableList<String>>()
       for(word in strs){
        val freq = MutableList(26) { 0 }
        for (letter in word){
            freq[letter - 'a']++
        }
        count.getOrPut(freq) { mutableListOf() }.add(word)
       }
       return count.values.toList()
    }
}