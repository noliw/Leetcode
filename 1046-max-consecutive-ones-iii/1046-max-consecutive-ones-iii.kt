class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var left = 0
        var maxLen = 0
        var zeroCount = 0

        for (right in nums.indices){
            if(nums[right] == 0) zeroCount++

            while(zeroCount > k){
                if(nums[left] == 0) zeroCount--
                left++
            }

            maxLen = maxOf(maxLen, right - left + 1)
        }

        return maxLen
    }
}