class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxCount = 0         // longest streak found so far
        var currentCount = 0     // current streak length

        for (num in nums) {
            if (num == 1) {
                // increase streak if we see a 1
                currentCount++
                maxCount = maxOf(maxCount, currentCount)
            } else {
                // reset streak if we see a 0
                currentCount = 0
            }
        }

        return maxCount
    }
}