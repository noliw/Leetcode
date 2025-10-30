class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
       
        var sum = 0.0
        
        for (right in 0 until k){
            sum += nums[right]
        }

        var maxSum = sum

        for (right in k until nums.size){
            sum += nums[right]
            sum -= nums[right - k]
            maxSum = maxOf(maxSum, sum)
        }
        return maxSum / k
    }
}