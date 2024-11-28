class Solution {
    fun missingNumber(nums: IntArray): Int {
      // Step 1: Create a set with all numbers from 0 to n
        val n = nums.size
        val numberSet = (0..n).toMutableSet()

        // Step 2: Remove each number in nums from the set
        for (num in nums) {
            numberSet.remove(num)
        }

        // Step 3: The remaining number in the set is the missing number
        return numberSet.first()
    }
}