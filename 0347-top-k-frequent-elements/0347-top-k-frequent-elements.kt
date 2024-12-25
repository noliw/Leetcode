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
    val frequencyMap = mutableMapOf<Int, Int>() // Map to store number and its frequency.
    for (num in nums) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1 // Increment frequency.
    }

    // Step 2: Create a bucket list where the index represents the frequency.
    // The size of the buckets array is nums.size + 1 since the maximum frequency
    // an element can have is nums.size (if all elements are the same).
    val buckets = List(nums.size + 1) { mutableListOf<Int>() } // Initialize empty buckets.
    for ((num, freq) in frequencyMap) {
        buckets[freq].add(num) // Add the number to the bucket corresponding to its frequency.
    }

    // Step 3: Gather the top k frequent elements from the buckets.
    val result = mutableListOf<Int>() // List to store the result.
    for (i in buckets.size - 1 downTo 1) { // Start from the highest frequency bucket.
        for (num in buckets[i]) {
            result.add(num) // Add the number to the result list.
            if (result.size == k) { // Stop once we have k elements.
                return result.toIntArray() // Convert the result list to an array and return.
            }
        }
    }

    // If we exhaust all elements, return the result as an array (unlikely edge case).
    return result.toIntArray()
        
    }
}