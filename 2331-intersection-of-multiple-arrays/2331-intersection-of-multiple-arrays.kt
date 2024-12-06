/*
1. inputs:
    - 2D array nums
    - the elements in the subarray are:
        - positive
        - distinct
        - non-empty
2. what do we need to do to that input:
    - we need to find the numbers that are present in each subarray
3. what do we return:
    - we need to return list of integers sorted in ascending order
*/


class Solution {
    fun intersection(nums: Array<IntArray>): List<Int> {
       // Step 1: Create a hash map to count occurrences of each number.
    val countMap = mutableMapOf<Int, Int>()
    
    // Step 2: Initialize the hash map with the first subarray.
    for (num in nums[0]) {
        countMap[num] = 1 // Mark each number from the first subarray.
    }
    
    // Step 3: Iterate through the rest of the subarrays.
    for (i in 1 until nums.size) {
        // Create a set of the current subarray for efficient lookups.
        val currentSet = nums[i].toSet()
        
        // Step 4: Update countMap by incrementing counts for numbers present in the current subarray.
        for ((key, value) in countMap.entries) {
            if (key in currentSet) {
                countMap[key] = value + 1
            }
        }
    }
    
    // Step 5: Collect numbers that appear in all subarrays (count == nums.size).
    val result = mutableListOf<Int>()
    for ((key, value) in countMap) {
        if (value == nums.size) {
            result.add(key)
        }
    }
    
    // Step 6: Sort the result.
    return result.sorted()
    }
}