class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        // Build the first window [0..k-1]
        var windowSum = 0.0
        for (i in 0 until k) windowSum += nums[i]

        var bestSum = windowSum

        // Slide the window across the array
        for (right in k until nums.size) {
            val left = right - k                      // index that leaves the window
            windowSum += nums[right]                  // add the new element entering
            windowSum -= nums[left]                   // remove the element leaving
            if (windowSum > bestSum) bestSum = windowSum
        }

        return bestSum / k
    }
}