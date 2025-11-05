class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var zeroCount = 0
        var maxLen = 0
        var left = 0

        for (right in nums.indices){
            if(nums[right] == 0) zeroCount ++
            if(zeroCount > k){
                if(nums[left] == 0) zeroCount --
                left++
            }

            maxLen = maxOf(maxLen, right - left + 1)
        }

        return maxLen
    }
}