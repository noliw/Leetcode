/*
1. Given:
    - integer array nums
    - integer k
2. we need to find the k elements that appear most
3. return an intarray that of the most frequent 
 */

class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
       // Step 1: Create a frequency map to count occurrences of each number.
    val frequencyMap = HashMap<Int, Int>()
    for (num in nums) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    // Step 2: Create a list of buckets where the index represents frequency.
    // The size of the bucket array is nums.size + 1 because the maximum frequency
    // an element can have is nums.size (if all elements are the same).
    val buckets = List(nums.size + 1) { mutableListOf<Int>() }
    for ((num, freq) in frequencyMap) {
        buckets[freq].add(num) // Add the number to the bucket corresponding to its frequency.
    }

    // Step 3: Gather the top k frequent elements from the buckets.
    val result = mutableListOf<Int>()
    for (bucket in buckets.size - 1 downTo 0) { // Start from the highest frequency bucket.
        for (num in buckets[bucket]) {
            result.add(num) // Add the number to the result list.
            if (result.size == k) return result.toIntArray() // Stop once we have k elements.
        }
    }

    return result.toIntArray() // Return the final list of k most frequent elements.
    }
}