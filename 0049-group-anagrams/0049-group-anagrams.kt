class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // Step 1: Create a hash map to store groups of anagrams
    val res = HashMap<List<Int>, MutableList<String>>()

    // Step 2: Iterate over each string in the input array
    for (s in strs) {
        // Step 3: Create a frequency count for the current string
        val count = MutableList(26) { 0 } // Array of size 26 initialized to 0

        // Step 4: Update the frequency count for each character in the string
        for (c in s) {
            count[c - 'a']++ // Increment the count for the character
        }

        // Step 5: Use the frequency count as a key in the hash map
        res.getOrPut(count) { mutableListOf() }.add(s)
        // If the key doesn't exist, initialize a new list and add the string to it
    }

    // Step 6: Return the grouped anagrams as a list of lists
    return res.values.toList()

        
    }
}