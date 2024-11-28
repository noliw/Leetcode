/*
1. inputs: 
- we have an array of integers n with distinct numbers 
- the range in between [0, n]

2. find the missing number in that range
3. return that number 
*/
class Solution {
    fun missingNumber(nums: IntArray): Int {
       // Step 1: Calculate the size of the array
    val n = nums.size

    // Step 2: Calculate the expected sum of numbers from 0 to n
    val expectedSum = (0..n).sum()

    // Step 3: Calculate the actual sum of elements in the nums array
    val actualSum = nums.sum()

    // Step 4: Find the missing number by subtracting the actual sum from the expected sum
    return expectedSum - actualSum
    }
}