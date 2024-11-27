class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // Step 1: Create a hash map to store numbers and their indices
    val numToIndex = mutableMapOf<Int, Int>()

    // Step 2: Loop through each number in the array
    for ((index, num) in nums.withIndex()) {
        // Step 3: Calculate the complement
        val complement = target - num

        // Step 4: Check if the complement exists in the hash map
        if (numToIndex.containsKey(complement)) {
            // If it exists, return the indices of the current number and the complement
            return intArrayOf(numToIndex[complement]!!, index)
        }

        // Step 5: Otherwise, add the current number and its index to the hash map
        numToIndex[num] = index
    }

    // Step 6: Return an empty array if no solution is found (not required as per the problem)
    return intArrayOf()
        
    }
}

/*
Simplifying the Problem:
1. What are my inputs?
 - An array of integers called nums (e.g., [2, 7, 11, 15]).
 - A single integer target (e.g., 9).

2. What do I need to do with the input?
- Find two numbers in the nums array that add up to the target.
- Return the indices of those two numbers.

3. What is the expected output?
- The indices of the two numbers as a pair (e.g., [0, 1] if nums[0] + nums[1] == target).

To put it simply: 
We are given a list of numbers and a target sum. Our task is to figure out which two numbers in the list add up to the target and return their positions in the list.
 */